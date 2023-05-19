import java.util.ArrayList;
import java.util.List;

public class Estoque {
  private List<Ingrediente> ingredientes;

    public Estoque() {
        this.ingredientes = new ArrayList<>();
    }

    public void adicionarItem(Ingrediente ingrediente) {
        ingredientes.add(ingrediente);
    }

    public void removerItem(Ingrediente ingrediente) {
        ingredientes.remove(ingrediente);
    }

}
