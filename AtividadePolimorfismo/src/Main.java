public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua Barbosa, 852");
        Pessoa pessoa = new Pessoa("Anna Beatriz", endereco);

        Disciplina disciplina1 = new Disciplina("Programação");
        Disciplina disciplina2 = new Disciplina("Inglês");

        Aluno aluno = new Aluno("Leticia");
        aluno.adicionarDisciplina(disciplina1);
        aluno.adicionarDisciplina(disciplina2);

        Compra compra = new Compra("Funko POP");
        Cupom cupom = new Cupom();

        System.out.println("Nome da Pessoa: " + pessoa.getNome());
        System.out.println("Endereço: " + pessoa.getEndereco());
        System.out.println();

        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.print("Disciplinas do Aluno: ");
        for (Disciplina disciplina : aluno.getDisciplinas()) {
            System.out.print(disciplina.getNome() + ", ");
        }

        System.out.println();
        System.out.println();

        cupom.aplicarCupom(compra, "DESC15");
    }
}