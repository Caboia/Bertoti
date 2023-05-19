import java.util.ArrayList;
import java.util.List;

public class Cardapio {
  private List<ItemMenu> itens;

    public Cardapio() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(ItemMenu item) {
        itens.add(item);
    }

    public void removerItem(ItemMenu item) {
        itens.remove(item);
    }

}
