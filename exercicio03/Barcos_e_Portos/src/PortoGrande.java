class PortoGrande extends BasePorto {

    public PortoGrande(String nome) {
        super(nome);
    }

    @Override
    public void atracarBarco(Barco barco) {
        if (barco.getTamanho() >= 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println("Recolha-se a sua insignificância, " + barco.getNome() + ", você não é páreo para o todo-poderoso: " + getNome() + ". (tamanho menor que 10)");
        }
    }
}