public class Gerente extends Funcionario{
    public Gerente(String nome, int matricula) {
        super(nome, matricula);
    }

    public void realizarVenda() {
        System.out.println(getNome() + " realizou uma venda como gerente.");
    }
}
