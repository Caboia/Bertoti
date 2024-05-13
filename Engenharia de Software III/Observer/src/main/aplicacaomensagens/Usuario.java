class Usuario implements Observer {
  private String nome;

  public Usuario(String nome) {
      this.nome = nome;
  }

  @Override
  public void update() {
      System.out.println(nome + ": Nova mensagem recebida!");
  }
}