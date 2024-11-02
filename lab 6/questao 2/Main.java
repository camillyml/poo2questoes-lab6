public class Main {
    public static void main(String[] args) {
        Acao acao1 = new Acao();
        Investidor investidor1 = new Investidor("João", 90.0, 110.0);
        Investidor investidor2 = new Investidor("Maria", 85.0, 120.0);

        acao1.addObserver(investidor1);
        acao1.addObserver(investidor2);

        acao1.setPreco(105.0); 
        acao1.setPreco(115.0); 
        acao1.setPreco(85.0);  
    }
}