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
    _select = select([column('nome_doador'), column('nome_candidato'), column('partido'), column('valor')]).\
        select_from(dados_agrup_doadores)

    return [dict(doador=x[0], candidato=x[1], partido=x[2], valor=x[3]) for x in
            _select.order_by('partido').execute()], list(_select.count().execute())[0][0]


def lista_partidos():
    """retorna distinct dos partidos"""
    return [x[0] for x in select([column('partido')]).distinct().select_from(dados_agrup_doadores).execute()]


def filtra_por_partido(_partido):
    """retorna dados do partido passado por parâmetro"""
    _select = select([column('nome_doador'), column('nome_candidato'), column('partido'), column('valor')]).\
        select_from(dados_agrup_doadores).where(column('partido') == _partido)
    # retorna resultado filtrado e count do resuldato

    return [dict(doador=x[0], candidato=x[1], partido=x[2], valor=x[3]) for x in _select.execute()],\
           list(_select.count().execute())[0][0]

