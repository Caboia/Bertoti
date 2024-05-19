public class Main {
  public static void main(String[] args) {
    
      PagamentoFacade pagamentoFacade = new PagamentoFacade();
      pagamentoFacade.processarPagamento();

      pagamentoFacade.realizarTransferencia();

      pagamentoFacade.consultarSaldo();
  }
}