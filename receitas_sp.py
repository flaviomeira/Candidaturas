import pandas as pd
from copy import deepcopy

def preparar_dados_receitasCSV(path_csv=None):
    dados_sp_original = pd.read_csv(path_csv, sep=';', encoding = 'latin-1', low_memory=False)
    dados = deepcopy(dados_sp_original)
    # substituindo ',' por '.' e convertendo pra float
    dados['Valor receita'] = list(map(float, list(map(lambda x: x.replace(',', '.'), dados['Valor receita']))))
    return dados


def filtrar_por_doador(dataframe, nome_doador):
    return dados_agrup[dados_agrup['Nome do doador originário'].str.contains('.*{}.*'.format(nome_doador))]


dados_sp = preparar_dados_receitasCSV('C:\\Users\\flaviomeira10\\Desktop\\prestacao_final_2014\\receitas_candidatos_2014_SP.txt')
# groupby abaixo inclui a coluna valor no resultado da soma e transforma o resultado em dataframe
dados_agrup = dados_sp.groupby(['Nome do doador originário','Sigla  Partido'])['Valor receita'].sum().reset_index(name='Valor')

print(filtrar_por_doador(dados_agrup, 'WTORRE'))


# filtrando por partido
# print(dados_agrup[dados_agrup['Sigla  Partido'] == 'PSC'])
