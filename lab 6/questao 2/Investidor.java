class Investidor implements AcaoObserver {
    private String nome;
    private double limiteMinimo;
    private double limiteMaximo;

    public Investidor(String nome, double limiteMinimo, double limiteMaximo) {
        this.nome = nome;
        this.limiteMinimo = limiteMinimo;
        this.limiteMaximo = limiteMaximo;
    }

    @Override
    public void update(double preco) {
        System.out.println("Investidor " + nome + " notificado. Preço da ação: " + preco);
        if (preco >= limiteMaximo) {
            System.out.println("Limite máximo atingido! Vendendo ações.");
            // Aqui poderia haver lógica para o AcaoBroker vender ações
        } else if (preco <= limiteMinimo) {
            System.out.println("Limite mínimo atingido! Considerar compra.");
        }
    }
}