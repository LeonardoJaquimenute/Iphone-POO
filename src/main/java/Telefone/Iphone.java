package Telefone;

import App.funcoes.Funcoes;

public class Iphone {
    public static void main(String[] args) {
        Funcoes funcoes = new Funcoes();

        //funcoes de musica
        funcoes.abrirReprodutor();
        funcoes.selecionarMusica("have a cigaro");
        funcoes.play();
        funcoes.pause();
        funcoes.fecharReprodutor();


        //funcoes de internet
        funcoes.abrirNavegador();
        funcoes.adicionarPagina();
        funcoes.exibirPagina("youtube.com.br");
        funcoes.atualizarPagina();
        funcoes.fecharNavegador();

        //funcoes de ligacao
        funcoes.ligar("11 9999-0000");
        funcoes.desligar();
        funcoes.iniciarCorreioVoz();
    }
}
