class Faxineiro extends Funcionario {
    public Faxineiro(String nome, int matricula) {
        super(nome, matricula);
    }

    public void solicitarMaterial() {
        System.out.println(getNome() + " solicitou material como faxineiro.");
    }
}