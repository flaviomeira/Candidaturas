from pprint import pprint

from sqlalchemy import (create_engine, MetaData, Column, Table, Integer, String, select, Float, sql, column, desc)

engine = create_engine('sqlite:///././db/Candidaturas.db', echo=False)

metadata = MetaData(bind=engine)

dados_agrup_doadores = Table('dados_agrup_doadores', metadata,
                     Column('id', Integer, primary_key=True, autoincrement=True),
                     Column('nome_doador', String(255), nullable=True),
                     Column('nome_candidato', String(255), nullable=True),
                     Column('partido', String(50), nullable=True),
                     Column('valor', Float(2), nullable=True))

# descomentar para criar tabelas
# metadata.create_all()


def retorna_tabela_completa():
    return [dict(doador=x[0], candidato=x[1], partido=x[2], valor=x[3]) for x in
            select([column('nome_doador'), column('nome_candidato'), column('partido'), column('valor')]).
            select_from(dados_agrup_doadores).order_by('partido').execute()]


def retorna_total_registros_tabela():
    str_sql = 'SELECT COUNT(*) FROM dados_agrup_doadores'
    resultado = engine.execute(str_sql).fetchone()
    return resultado[0]
    # return [x for x in select([dados_agrup_doadores]).count().execute()]
