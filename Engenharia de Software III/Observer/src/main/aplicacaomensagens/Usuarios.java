public class Usuarios implements Observer {
  private String nome;

  public Usuarios(String nome) {
      this.nome = nome;
  }

  @Override
  public void update() {
      System.out.println(nome + " recebeu uma nova mensagem.");
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }
}