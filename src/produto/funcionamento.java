package produto;

import equipamentos.AparelhoTelefonico;
import equipamentos.NavegadorInternet;
import equipamentos.ReprodutorMusical;

public class funcionamento implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{
    public void tocar() {
        System.out.println("Resumindo musica");
    }

    public void pausar() {
        System.out.println("Pausando musica");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Agora tocando: " + musica);
    }

    public void exibirPagina(String url) {
        url = "youtube.com";
        System.out.println("Exibindo pagina: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a pagina");
    }

    public void ligar(String numero) {
        numero = "990123112";
        System.out.println("ligando para o numero: " + numero);
    }

    public void atender() {
        System.out.println("Alô?");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Gravando correio de voz");
    }
}
