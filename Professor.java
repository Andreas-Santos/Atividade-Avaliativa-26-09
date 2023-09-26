import java.util.ArrayList;

public class Professor extends Funcionario {
    private String urlCurriculoLattes;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Professor() {

    }

    public Professor(String nome, String cpf, String urlCurriculoLattes) {
        super.setNome(nome);
        super.setCpf(cpf);
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() +
               "\nCPF: " + super.getCpf() +
               "\nURL Curriculo Lattes: " + urlCurriculoLattes +
               "\nDisciplinas: " + disciplinas;
    }

    public void addDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }

    public void removeDisciplina(int index){
        disciplinas.remove(index);
    }

    public void removeDisciplina(Disciplina disciplina) {
        disciplinas.remove(disciplina);
    }

    public Disciplina getDisciplina(int index) {
        return disciplinas.get(index);
    }

    public String getUrlCurriculoLattes() {
        return urlCurriculoLattes;
    }

    public void setUrlCurriculoLattes(String urlCurriculoLattes) {
        this.urlCurriculoLattes = urlCurriculoLattes;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
