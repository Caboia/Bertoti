public class PagamentoFacade {
  private SistemaCartaoCredito sistemaCartaoCredito;
  private SistemaBancario sistemaBancario;

  public PagamentoFacade() {
      sistemaCartaoCredito = new SistemaCartaoCredito();
      sistemaBancario = new SistemaBancario();
  }

  public void processarPagamento() {
      sistemaCartaoCredito.processarPagamento();
  }

  public void realizarTransferencia() {
      sistemaBancario.realizarTransferencia();
  }

  public void consultarSaldo() {
      sistemaBancario.consultarSaldo();
  }
}