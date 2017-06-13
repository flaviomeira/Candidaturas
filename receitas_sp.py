import pandas as pd

dados_sp = pd.read_csv('C:\\Users\\flaviomeira10\\Desktop\\prestacao_final_2014\\receitas_candidatos_2014_SP.txt', sep=';', encoding = 'latin-1', low_memory=False)
print(dados_sp.groupby(['Nome do doador originário','Sigla  Partido'])['Valor receita'].sum())
