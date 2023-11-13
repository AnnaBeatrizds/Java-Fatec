class Vendedor extends Funcionario {
    public Vendedor(String nome, int matricula) {
        super(nome, matricula);
    }

    public void realizarVenda() {
        System.out.println(getNome() + " realizou uma venda como vendedor.");
    }
}
