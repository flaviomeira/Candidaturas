from copy import deepcopy
import pandas as pd
from sqlalchemy import (create_engine)


def preparar_dados_receitasCSV(path_csv=None):
    dados_sp_original = pd.read_csv(path_csv, sep=';', encoding = 'latin-1', low_memory=False)
    dados = deepcopy(dados_sp_original)
    # substituindo ',' por '.' e convertendo pra float
    dados['Valor receita'] = list(map(float, map(lambda x: x.replace(',', '.'), dados['Valor receita'])))
    return dados


def filtrar_por_doador(dataframe, nome_doador):
    return dataframe[dataframe['Nome do doador originário'].str.contains('.*{}.*'.format(nome_doador))]


dados_sp = preparar_dados_receitasCSV('..\\..\\receitas_candidatos_2014_SP.txt')

# groupby abaixo inclui a coluna valor no resultado da soma e transforma o resultado em dataframe
dados_agrup = dados_sp.groupby(['Nome do doador originário', 'Nome candidato', 'Sigla  Partido'])['Valor receita'].\
    sum().reset_index(name='valor')

# renomeando as colunas do dataframe
dados_agrup.columns = ['nome_doador', 'nome_candidato', 'partido', 'valor']
# preparando banco de dados para receber os dados do csv
engine = create_engine('sqlite:///db/Candidaturas.db', echo=False)
nome_tabela = "dados_agrup_doadores"

# descomentar quando quiser reinserir os dados na tabela
# dados_agrup.to_sql(nome_tabela, engine, if_exists="append", index_label='id', dtype=coluna_valor)

# testando select
# print(retorna_tabela_completa())
