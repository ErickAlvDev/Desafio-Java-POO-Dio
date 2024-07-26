package com.ErickAlvDev.desafioIphone.model;

import com.ErickAlvDev.desafioIphone.services.NavegadorInternet;
import com.ErickAlvDev.desafioIphone.services.ReprodutorMusical;
import com.ErickAlvDev.desafioIphone.services.ServicoTelefonico;

public class Iphone  implements ReprodutorMusical, ServicoTelefonico, NavegadorInternet {
    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no navegador");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Carregando pagina: " + url);
    }

    @Override
    public void atualiizarPagina() {
        System.out.println("Atualizando pagina");
    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocando a musica selecionada");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Musica pausada");
    }

    @Override
    public void selecionarMusica(Musica musica) {
        System.out.println("Musica selecionada: " + musica);
    }

    @Override
    public void atenderTelefone() {
        System.out.println("Atendendo telefone");
    }

    @Override
    public void ligarParaNumeroTelefone(String numero) {
        System.out.println("Ligando para o numero de telefone: " + numero);
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }
}
