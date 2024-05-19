public class Main {
  public static void main(String[] args) {

      AplicativoMensagens aplicativo = new AplicativoMensagens();

      Usuarios usuario1 = new Usuarios("Usuario1");
      Usuarios usuario2 = new Usuarios("Usuario2");
      Usuarios usuario3 = new Usuarios("Usuario3");

      aplicativo.attach(usuario1);
      aplicativo.attach(usuario2);
      aplicativo.attach(usuario3);

      aplicativo.novaMensagem();
  }
}