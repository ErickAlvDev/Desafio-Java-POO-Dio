package com.ErickAlvDev.desafioIphone.services;

import com.ErickAlvDev.desafioIphone.model.Musica;

public interface ReprodutorMusical {
    public void tocarMusica();
    public void pausarMusica();
    public void selecionarMusica( Musica musica);
}
