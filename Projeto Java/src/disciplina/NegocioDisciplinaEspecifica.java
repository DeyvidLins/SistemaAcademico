
package disciplina;

import java.util.ArrayList;

public class NegocioDisciplinaEspecifica implements InterfaceDisciplinaEspecifica {

    @Override
    public void cadastrarDisciplina(DisciplinaEspecifica D) throws Exception {
        //validando o codigo da disciplina
        if (D.getCodigoDisciplina() <= 0) {
            throw new Exception("o codigo da disciplina não pode ser menor  que 0 ou igual a 0 ");
        }

        // validando o nome da disciplina
        if (D == null) {
            throw new Exception("Instanciar a Disciplina");
        }
        if (D.getNomeDisciplina() == null) {
            throw new Exception("Nulo: Informar o nome da Disciplina");
        }
        if (D.getNomeDisciplina().trim().equals("") == true) {
            throw new Exception("Informar o nome da Disciplina");
        }
        if (D.getNomeDisciplina().trim().length() > 40) {
            throw new Exception("O nome da Disciplina não pode ter mais de 40(quarenta) caracteres");
        }
        if (D.getNomeDisciplina().contains(" ")) {
            throw new Exception("o nome da disciplina não deve conter espaços em branco");
        }
        //validando o turno
        if (D.getTurno() == null) {
            throw new Exception("Nulo: Informar o turno");
        }
        if (D.getTurno().trim().equals("") == true) {
            throw new Exception("Informar o turno");
        }
        if (D.getTurno().trim().length() > 5) {
            throw new Exception("O turno não pode ter mais de 5(cinco) caracteres");
        }
        if (D.getTurno().contains(" ")) {
            throw new Exception("o turno da disciplina não deve conter espaços em branco");
        }
        //validando a turma
        if (D.getTurma() == null) {
            throw new Exception("Nulo: Informar a cturma do aluno");
        }
        if (D.getTurma().trim().equals("") == true) {
            throw new Exception("Informar a turma do aluno");
        }
        if (D.getTurma().contains(" ")) {
            throw new Exception("a a turma disciplina não deve conter espaços em branco");
        }

        DadosDisciplinaEspecifica Conexao = new DadosDisciplinaEspecifica();
        Conexao.cadastrarDisciplina(D);
    }

    @Override
    public void alterarDisciplina(DisciplinaEspecifica D) throws Exception {
        //validando o codigo da disciplina
        if (D.getCodigoDisciplina() <= 0) {
            throw new Exception("o codigo da disciplina não pode ser menor  que 0 ou igual a 0 ");
        }

        // validando o nome da disciplina
        if (D == null) {
            throw new Exception("Instanciar a Disciplina");
        }
        if (D.getNomeDisciplina() == null) {
            throw new Exception("Nulo: Informar o nome da Disciplina");
        }
        if (D.getNomeDisciplina().trim().equals("") == true) {
            throw new Exception("Informar o nome da Disciplina");
        }
        if (D.getNomeDisciplina().trim().length() > 40) {
            throw new Exception("O nome da Disciplina não pode ter mais de 40(quarenta) caracteres");
        }
        if (D.getNomeDisciplina().contains(" ")) {
            throw new Exception("o nome da disciplina não deve conter espaços em branco");
        }
        //validando o turno
        if (D.getTurno() == null) {
            throw new Exception("Nulo: Informar o turno");
        }
        if (D.getTurno().trim().equals("") == true) {
            throw new Exception("Informar o turno");
        }
        if (D.getTurno().trim().length() > 5) {
            throw new Exception("O turno não pode ter mais de 5(cinco) caracteres");
        }
        if (D.getTurno().contains(" ")) {
            throw new Exception("o turno da disciplina não deve conter espaços em branco");
        }
        //validando a turma
        if (D.getTurma() == null) {
            throw new Exception("Nulo: Informar a cturma do aluno");
        }
        if (D.getTurma().trim().equals("") == true) {
            throw new Exception("Informar a turma do aluno");
        }
        if (D.getTurma().contains(" ")) {
            throw new Exception("a a turma disciplina não deve conter espaços em branco");
        }

        DadosDisciplinaEspecifica Conexao = new DadosDisciplinaEspecifica();
        Conexao.alterarDisciplina(D);
    }

    @Override
    public void removerDisciplina(DisciplinaEspecifica D) throws Exception {
        DadosDisciplinaEspecifica Conexao = new DadosDisciplinaEspecifica();
        Conexao.removerDisciplina(D);
    }

    public ArrayList<DisciplinaEspecifica> listar(DisciplinaEspecifica filtro) throws Exception {
        DadosDisciplinaEspecifica dados = new DadosDisciplinaEspecifica();
        return dados.listar("");
    }
   
    @Override
    public void vincularDisciplina(DisciplinaEspecifica D) throws Exception {

        //validando o codigo da disciplina
        if (D.getCodigoDisciplina() <= 0) {
            throw new Exception("o  codigo da disciplina não pode ser menor ou igual a 0");
        }
        // validando o nome do curso
        if (D.getCurso().getNomeCurso() == null) {
            throw new Exception("Nulo: Informe a curso  ");
        }
        if (D.getCurso().getNomeCurso().trim().length() > 100) {
            throw new Exception("o curso não pode ter mais de 100(cem) caracteres");
        }
        if (D.getCurso().getNomeCurso().trim().equals("")) {
            throw new Exception("Informar o curso");
        }

        DadosDisciplinaEspecifica Conexao = new DadosDisciplinaEspecifica();
        Conexao.vincularDisciplina(D);
    }

    @Override
    public ArrayList<DisciplinaEspecifica> listar(String filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
