public class Aluno extends Pessoa {
    private String ra;
    private String curso;

    public Aluno() {

    }

    public Aluno(String nome, String cpf, String ra, String curso) {
        super.setNome(nome);
        super.setCpf(cpf);
        this.ra = ra;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() +
               "\nCPF: " + super.getCpf() +
               "\nRa: " + ra +
               "\nCurso: " + curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
