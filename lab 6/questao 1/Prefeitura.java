public class Prefeitura implements Observador {
    public void update(int temp, int umidade, int velocidade){
    System.out.println("eu sou a prefeitura");
    System.out.println("estou interessada na umidade");
    System.out.println("umidade = " + umidade);
    }
    
}
