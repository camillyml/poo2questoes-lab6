public class Aeroporto implements Observador {
    public void update(int temp, int umidade, int velocidade){
        System.out.println("eu sou o aeroporto");
        System.out.println("estou interessado na velocidade");
        System.out.println("velocidade = " + velocidade);
        }
        
}
