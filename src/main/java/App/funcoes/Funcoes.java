package App.funcoes;

import App.browser.NavegadorDeInternet;
import App.music.ReprodutorMusica;
import App.phone.AparelhoTelefonico;

public class Funcoes implements ReprodutorMusica, NavegadorDeInternet, AparelhoTelefonico {

    //funcoes do reprodutor de musica
    @Override
    public void abrirReprodutor() {
        System.out.println("Abrindo reprodutor de musica...");
    }

    @Override
    public void play() {
        System.out.println("Tocando musica");
    }

    @Override
    public void pause() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("a musica:'" + musica + "' foi selecionada.");
    }

    @Override
    public void fecharReprodutor() {
        System.out.println("Fechando o reprodutor de musica");
    }

    //funcoes telefone
    @Override
    public void ligar(String numero) {
        System.out.println("ligando para: " + numero);
    }

    @Override
    public void desligar() {
        System.out.println("Desligando ligacao");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciando correio de voz.");
    }

    //funcoes de navegador de internet

    @Override
    public void abrirNavegador() {
        System.out.println("Abrindo navegador");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("a pagina selecionado foi: " + url);
    }

    @Override
    public void adicionarPagina() {
        System.out.println("Adicionando pagina...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina...");
    }

    @Override
    public void fecharNavegador() {
        System.out.println("Fechando navegador");
    }
}
