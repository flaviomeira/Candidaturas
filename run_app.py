import os
from bottle import jinja2_view, route, run, static_file, redirect
from run_app.dbengine.db_engine import retorna_tabela_completa, filtra_por_partido, lista_partidos


@route('/')
@jinja2_view('paginas/resumo_doacao.html')
def resumo_doacao():
    lista_doacoes, total_registros = retorna_tabela_completa()
    partidos = lista_partidos()
    return dict(lista_doacoes=lista_doacoes, total_registros=total_registros, lista_partidos=partidos)


@route('<path:re:.*>/css/<filename>')
def stylesheets(path, filename):
    """
    - Possibilita carregamento dos css estáticos
    - independente do caminho vai direcionar para a pasta correta
    """
    return static_file(filename, root='./paginas/css')


@route('/filtro/partido')
def lista_todos_partidos():
    """lista todos os partidos presentes na tabela dados_agrup"""
    return dict(lista_partidos=lista_partidos())


@route('/filtro/partido/<partido>')
@jinja2_view('paginas/filtro_resumo_doacoes.html')
def efetua_filtro(partido):
    """se partido == todos redireciona pra home"""
    if partido == 'TODOS':
        redirect('/')
    else:
        resultado_filtro, total_registros = filtra_por_partido(partido)
        partidos = lista_partidos()
        return dict(filtro_partido=resultado_filtro, partido=partido, total_registros=total_registros, lista_partidos=partidos)


if __name__ == '__main__':
    if os.environ.get('APP_LOCATION') == 'heroku':
        run(host="0.0.0.0", port=int(os.environ.get("PORT", 5000)))
    else:
        run(port=8080, debug=True)

