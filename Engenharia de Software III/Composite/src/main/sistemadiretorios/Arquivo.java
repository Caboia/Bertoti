package sistemadiretorios;

public class Arquivo implements Component {
  private String name;

  public Arquivo(String name) {
      this.name = name;
  }

  @Override
  public void listar() {
      System.out.println("Arquivo: " + name);
  }
}