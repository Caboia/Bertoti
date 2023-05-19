import java.util.ArrayList;
import java.util.List;

public class Cafeteria {
  private String nome;
  private String endereco;
  private List<Funcionario> funcionarios;
  private Estoque estoque;
  private Cardapio cardapio;

  public Cafeteria(String nome, String endereco) {
      this.nome = nome;
      this.endereco = endereco;
      this.funcionarios = new ArrayList<>();
      this.estoque = new Estoque();
      this.cardapio = new Cardapio();
  }

  public void contratarFuncionario(Funcionario funcionario) {
      funcionarios.add(funcionario);
  }

  public void demitirFuncionario(Funcionario funcionario) {
      funcionarios.remove(funcionario);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public List<Funcionario> getFuncionarios() {
    return funcionarios;
  }

  public void setFuncionarios(List<Funcionario> funcionarios) {
    this.funcionarios = funcionarios;
  }

  public Estoque getEstoque() {
    return estoque;
  }

  public void setEstoque(Estoque estoque) {
    this.estoque = estoque;
  }

  public Cardapio getCardapio() {
    return cardapio;
  }

  public void setCardapio(Cardapio cardapio) {
    this.cardapio = cardapio;
  }
  
}
