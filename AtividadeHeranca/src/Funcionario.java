public class Funcionario {
    private String nome;
    private int matricula;

    public Funcionario(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void baterPonto() {
        System.out.println(nome + " bateu o ponto.");
    }

    public void fecharCaixa() {
        System.out.println(nome + " fechou o caixa.");
    }

    public String getNome() {
        return nome;
    }
}
