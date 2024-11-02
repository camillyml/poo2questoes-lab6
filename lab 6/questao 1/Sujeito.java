import java.util.ArrayList;
import java.util.List;

public class Sujeito {
    List<Observador> obsList = new ArrayList<>();
    int temp;
    int umidade;
    int velocidade;

    public void addObserver(Observador o){
        obsList.add(o);
    }
    public void notifyObservers(){
        for(Observador o: obsList){
            o.update(temp, umidade, velocidade);
        }
    }
    public void setUmidade(int u){
        this.umidade = u;
        notifyObservers();
    }
    public void setTemperatura(int t){
        this.temp = t;
        notifyObservers();
    }
    public void setVelocidade(int v){
        this.velocidade = v;
        notifyObservers();
    }
    // public void setInfos(int u, int v, int t){
    // this.velocidade = v;
    // this.temp = t;
    // this.umidade = u;
    // notifyObservers();
    //}
}


