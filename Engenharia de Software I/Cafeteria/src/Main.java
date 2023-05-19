public class Main {
    public static void main(String[] args) {

        Cafeteria cafeteria = new Cafeteria("Minha Cafeteria", "Rua Principal, 123");

        Funcionario funcionario1 = new Funcionario("João", "Atendente", 1500.0);
        Funcionario funcionario2 = new Funcionario("Maria", "Cozinheira", 2000.0);

        cafeteria.contratarFuncionario(funcionario1);
        cafeteria.contratarFuncionario(funcionario2);

        Ingrediente ingrediente1 = new Ingrediente("Café", 100);
        Ingrediente ingrediente2 = new Ingrediente("Açúcar", 200);

        cafeteria.getEstoque().adicionarItem(ingrediente1);
        cafeteria.getEstoque().adicionarItem(ingrediente2);

        ItemMenu item1 = new ItemMenu("Café Expresso", 5.0);
        ItemMenu item2 = new ItemMenu("Cappuccino", 7.5);

        cafeteria.getCardapio().adicionarItem(item1);
        cafeteria.getCardapio().adicionarItem(item2);

        funcionario1.realizarPedido(item1, funcionario1);
        funcionario2.receberPagamento(20);
    }
}
