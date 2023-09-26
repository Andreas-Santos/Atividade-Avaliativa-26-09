public class Atendente extends Funcionario {
    private String setor;
    private String funcao;
    
    public Atendente() {

    }

    public Atendente(String nome, String cpf, String setor, String funcao) {
        super.setNome(nome);
        super.setCpf(cpf);
        this.setor = setor;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Nome: " + super.getNome() +
               "\nCPF: " + super.getCpf() +
               "\nSetor: " + setor +
               "\nFunção: " + funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
