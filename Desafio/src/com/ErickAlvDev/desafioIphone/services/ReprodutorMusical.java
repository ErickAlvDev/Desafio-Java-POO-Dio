package com.ErickAlvDev.desafioIphone.services;

import com.ErickAlvDev.desafioIphone.model.Musica;

public interface ReprodutorMusical {
    void tocarMusica();
    void pausarMusica();
    void selecionarMusica( Musica musica);
}
