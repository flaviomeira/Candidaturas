import os

from bottle import jinja2_view, route, run, static_file

from run_app.dbengine.db_engine import retorna_total_registros_tabela, retorna_tabela_completa


@route('/')
@jinja2_view('paginas/resumo_doacao.html')
def resumo_doacao():
    """Rederizando uma view com o decorador do jinja."""
    lista_doacoes = retorna_tabela_completa()
    total_registros = retorna_total_registros_tabela()
    return dict(lista_doacoes=lista_doacoes, total_registros=total_registros)


@route('/css/<filename>')
def stylesheets(filename):
    return static_file(filename, root='./paginas/css')


if __name__ == '__main__':
    if os.environ.get('APP_LOCATION') == 'heroku':
        run(host="0.0.0.0", port=int(os.environ.get("PORT", 5000)))
    else:
        run(port=8080, debug=True)
