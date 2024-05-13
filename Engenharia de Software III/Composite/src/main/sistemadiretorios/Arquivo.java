class Arquivo implements Component {
  private String nome;

  public Arquivo(String nome) {
      this.nome = nome;
  }

  @Override
  public void listar() {
      System.out.println("Arquivo: " + nome);
  }
}