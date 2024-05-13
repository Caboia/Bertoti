import java.util.ArrayList;
import java.util.List;

class AplicativoMensagens implements Subject {
  private List<Observer> observadores = new ArrayList<>();

  @Override
  public void attach(Observer observer) {
      observadores.add(observer);
  }

  @Override
  public void detach(Observer observer) {
      observadores.remove(observer);
  }

  @Override
  public void notifyObservers() {
      for (Observer observer : observadores) {
          observer.update();
      }
  }

  public void novaMensagem() {

  String mensagem = "Nova mensagem recebida!";

  System.out.println("Nova mensagem: " + mensagem);

  notifyObservers();
  }
}