package App.funcoes;

import App.browser.NavegadorDeInternet;
import App.music.ReprodutorMusica;
import App.phone.AparelhoTelefonico;

public class Funcoes implements ReprodutorMusica, NavegadorDeInternet, AparelhoTelefonico {
    public void play(){
        System.out.println("Música tocando");
    }

}
