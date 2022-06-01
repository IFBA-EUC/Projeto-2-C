package projetofinal;

public class Aluno {
    private int cpf;
    private String nome;
    private int matricula;

    public Aluno(int cpf, String nome, int matricula) {
        this.cpf = cpf;
        this.nome = nome;
        this.matricula = matricula;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
