public class Main {
  public static void main(String[] args) {

      AplicativoMensagens aplicativo = new AplicativoMensagens();

      Usuario usuario1 = new Usuario("Usuario1");
      Usuario usuario2 = new Usuario("Usuario2");
      Usuario usuario3 = new Usuario("Usuario3");

      aplicativo.attach(usuario1);
      aplicativo.attach(usuario2);
      aplicativo.attach(usuario3);

      aplicativo.novaMensagem();
  }
}