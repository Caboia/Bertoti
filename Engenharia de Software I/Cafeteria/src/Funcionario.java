public class Funcionario {
  private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void realizarPedido(ItemMenu item, Funcionario funcionario) {
      System.out.println("Realizando pedido do item " + item.getNome() + " pelo funcionário " + funcionario.getNome());
    }

    public void receberPagamento(double valor) {
      System.out.println("Recebendo pagamento de R$" + valor);
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getCargo() {
      return cargo;
    }

    public void setCargo(String cargo) {
      this.cargo = cargo;
    }

    public double getSalario() {
      return salario;
    }

    public void setSalario(double salario) {
      this.salario = salario;
    }

    
}

