package projetofinal;

import java.util.ArrayList;

public class RepositorioAluno {
    
    private ArrayList<Aluno> repository;

    public RepositorioAluno(){
        this.repository = new ArrayList<Aluno>();
    }
    public void inserir(Aluno aluno){
        repository.add(aluno);
    }
    public ArrayList<Aluno> getAll(){
        return repository;
    }  
}
