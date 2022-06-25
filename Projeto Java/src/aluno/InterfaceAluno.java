
package aluno;

import java.util.ArrayList;

public interface InterfaceAluno {

    void cadastrarAluno(Aluno A) throws Exception;

    void alterarAluno(Aluno A) throws Exception;

    void removerAluno(Aluno A) throws Exception;

    void matricularAluno(Aluno A) throws Exception;

    Boolean fazerLogin (Aluno A) throws Exception;
    
    Aluno buscaAlunoPorMatricula(Integer matricula) throws Exception; 

    ArrayList<Aluno> listar(Aluno filtro) throws Exception;
    
   
}
