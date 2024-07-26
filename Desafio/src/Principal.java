import com.ErickAlvDev.desafioIphone.model.Iphone;
import com.ErickAlvDev.desafioIphone.model.Musica;

public class Principal {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        Musica babel = new Musica("Un Corazon", "Babel", "Babel", 245);

        String url = "https://github.com/ErickAlvDev/Desafio-Java-POO-Dio";
        String numeroTelefone = "63998885563";

        meuIphone.ligarParaNumeroTelefone(numeroTelefone);
        meuIphone.atenderTelefone();
        meuIphone.iniciarCorreioVoz();

        meuIphone.adicionarNovaAba();
        meuIphone.exibirPagina(url);
        meuIphone.atualiizarPagina();

        meuIphone.selecionarMusica(babel);
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();
    }
}