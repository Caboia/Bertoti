package sistemadiretorios;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements Component {
  private String nome;
  private List<Component> componentes;

  public Pasta(String nome) {
      this.nome = nome;
      this.componentes = new ArrayList<>();
  }

  public void adicionar(Component componente) {
      componentes.add(componente);
  }

  public void remover(Component componente) {
      componentes.remove(componente);
  }

  @Override
  public void listar() {
      System.out.println("Pasta: " + nome);
      for (Component componente : componentes) {
          componente.listar();
      }
  }
}
