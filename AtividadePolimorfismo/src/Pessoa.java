class Pessoa extends Base {
    private Endereco endereco;

    public Pessoa(String nome, Endereco endereco) {
        super(nome);
        this.endereco = endereco;
    }

    public String getEndereco() {

        return endereco.getEndereco();
    }
}