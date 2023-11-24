import java.util.ArrayList;
import java.util.List;
class Aluno extends Base {
    private List<Disciplina> disciplinas;

    public Aluno(String nome) {
        super(nome);
        disciplinas = new ArrayList<>();
    }

    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
}