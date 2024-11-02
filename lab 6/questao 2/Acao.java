import java.util.ArrayList;
import java.util.List;
class Acao {
    private List<AcaoObserver> obsList = new ArrayList<>();
    private double preco;

    public void addObserver(AcaoObserver o) {
        obsList.add(o);
    }

    public void notifyObservers() {
        for (AcaoObserver o : obsList) {
            o.update(preco);
        }
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
        notifyObservers();
    }
}
