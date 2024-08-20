package produto;

public class Iphone {
    public static void main(String[] args) {
        funcionamento Iphone = new funcionamento();

        System.out.println("### Você abriu o aplicativo de musica ###");
        System.out.println(" ");

        Iphone.selecionarMusica("I love you - Fontaines D.C");
        Iphone.tocar();
        Iphone.pausar();

        System.out.println(" ");
        System.out.println("### Você abriu o navegador de internet ###");
        System.out.println(" ");

        Iphone.adicionarNovaAba();
        Iphone.exibirPagina("youtube.com");
        Iphone.atualizarPagina();

        System.out.println(" ");
        System.out.println("### Você abriu o aplicativo de ligação ###");
        System.out.println(" ");

        Iphone.ligar("123241231");
        Iphone.atender();
        Iphone.iniciarCorreioVoz();
    }
}
