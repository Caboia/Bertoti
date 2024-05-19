import sistemadiretorios.Arquivo;
import sistemadiretorios.Pasta;

public class Main {
  public static void main(String[] args) {

      Arquivo arquivo1 = new Arquivo("documento.txt");
      Arquivo arquivo2 = new Arquivo("foto.jpg");

      Pasta pasta1 = new Pasta("Documentos");
      Pasta pasta2 = new Pasta("Fotos");

      pasta1.adicionar(arquivo1);
      pasta2.adicionar(arquivo2);

      Pasta pastaPrincipal = new Pasta("Meus Documentos");
      pastaPrincipal.adicionar(pasta1);
      pastaPrincipal.adicionar(pasta2);

      pastaPrincipal.listar();
  }
}