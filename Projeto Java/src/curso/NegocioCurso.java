package curso;

import java.util.ArrayList;

public class NegocioCurso implements InterfaceCurso {

    @Override
    public void cadastrarCurso(Curso C) throws Exception {
        // validando o codigo curso
        if (C.getCodigoCurso() <= 0) {
            throw new Exception(" o codigo do curso não pode ser menor que zero ou igual a zero");
        }
        //validando o nome do curso
        if (C == null) {
            throw new Exception("Instanciar o Curso");
        }
        if (C.getNomeCurso() == null) {
            throw new Exception("Nulo: Informar o nome do Curso");
        }
        if (C.getNomeCurso().trim().equals("") == true) {
            throw new Exception("Informar o nome do Curso");
        }
        if (C.getNomeCurso().trim().length() > 100) {
            throw new Exception("O nome do Curso não pode ter mais de 40(quarenta) caracteres");
        }
        // validando o codigo do curso
        if (C.getCodigoCurso() == 0) {
            throw new Exception("o codigo do Curso não pode ser 0");

        }
        //validando o turno
        if (C.getTurno() == null) {
            throw new Exception("Nulo: Informar o turno");
        }
        if (C.getTurno().trim().equals("") == true) {
            throw new Exception("Informar o turno");
        }
        if (C.getTurno().trim().length() > 5) {
            throw new Exception("O turno não pode ter mais de 5(cinco) caracteres");
        }
        if (C.getTurno().contains(" ")) {
            throw new Exception("o turno da disciplina não deve conter espaços em branco");
        }
        //validando a turma
        if (C.getTurma() == null) {
            throw new Exception("Nulo: Informar a cturma do aluno");
        }
        if (C.getTurma().trim().equals("") == true) {
            throw new Exception("Informar a turma do aluno");
        }
        if (C.getTurma().contains(" ")) {
            throw new Exception("a a turma disciplina não deve conter espaços em branco");
        }

        DadosCurso Conexao = new DadosCurso();
        Conexao.cadastrarCurso(C);
    }

    @Override
    public void alterarCurso(Curso C) throws Exception {
        // validando o codigo curso
        if (C.getCodigoCurso() <= 0) {
            throw new Exception(" o codigo do curso não pode ser menor que zero ou igual a zero");
        }
        //validando o nome do curso
        if (C == null) {
            throw new Exception("Instanciar o Curso");
        }
        if (C.getNomeCurso() == null) {
            throw new Exception("Nulo: Informar o nome do Curso");
        }
        if (C.getNomeCurso().trim().equals("") == true) {
            throw new Exception("Informar o nome do Curso");
        }
        if (C.getNomeCurso().trim().length() > 100) {
            throw new Exception("O nome do Curso não pode ter mais de 40(quarenta) caracteres");
        }
        // validando o codigo do curso
        if (C.getCodigoCurso() == 0) {
            throw new Exception("o codigo do Curso não pode ser 0");

        }
        //validando o turno
        if (C.getTurno() == null) {
            throw new Exception("Nulo: Informar o turno");
        }
        if (C.getTurno().trim().equals("") == true) {
            throw new Exception("Informar o turno");
        }
        if (C.getTurno().trim().length() > 5) {
            throw new Exception("O turno não pode ter mais de 5(cinco) caracteres");
        }
        if (C.getTurno().contains(" ")) {
            throw new Exception("o turno da disciplina não deve conter espaços em branco");
        }
        //validando a turma
        if (C.getTurma() == null) {
            throw new Exception("Nulo: Informar a cturma do aluno");
        }
        if (C.getTurma().trim().equals("") == true) {
            throw new Exception("Informar a turma do aluno");
        }
        if (C.getTurma().contains(" ")) {
            throw new Exception("a a turma disciplina não deve conter espaços em branco");
        }

        DadosCurso Conexao = new DadosCurso();
        Conexao.alterarCurso(C);
    }

    @Override
    public void removerCurso(Curso C) throws Exception {
        DadosCurso Conexao = new DadosCurso();
        Conexao.removerCurso(C);
    }

    @Override
    public ArrayList<Curso> listar(Curso filtro) throws Exception {
        DadosCurso dados = new DadosCurso();
        return dados.listar(filtro);
    }
}
