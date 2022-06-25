/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

import disciplina.DadosDisciplinaEspecifica;
import disciplina.DisciplinaEspecifica;
import java.util.ArrayList;

public class NegocioNota implements InterfaceNota {

    @Override
    public void alterarNota(Nota N) throws Exception {
        //validando a matricula
        if (N.getAluno().getMatricula() <= 0) {
            throw new Exception("a matricula do aluno  não pode ser igual ou abaixo de zero");
        }
        //validando o codigo da disciplina
        if (N.getDisciplina().getCodigoDisciplina() <= 0) {
            throw new Exception("o codigo da disciplina não pode ser abaixo ou igual a zero");
        }
        // validando  primeira nota
        if (N.getNota1() < 0) {
            throw new Exception("a nota não pode ser abaixo de zero ");
        }
        // validando  segunda  nota
        if (N.getNota2() < 0) {
            throw new Exception("a nota não pode ser abaixo de zero ");
        }
        DadosNota Conexao = new DadosNota();
        Conexao.alterarNota(N);
    }

    @Override
    public void removerNota(Nota N) throws Exception {
        DadosNota Conexao = new DadosNota();
        Conexao.removerNota(N);
    }

    @Override
    public ArrayList<Nota> listar(Nota filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void cadastrarNota1(Nota N) throws Exception {
        if (N.getAluno().getMatricula() <= 0) {
            throw new Exception("a matricula do aluno  não pode ser igual ou abaixo de zero");
        }
        //validando o codigo da disciplina
        if (N.getDisciplina().getCodigoDisciplina() <= 0) {
            throw new Exception("o codigo da disciplina não pode ser abaixo ou igual a zero");
        }
        // validando  primeira nota
        if (N.getNota1() < 0) {
            throw new Exception("a nota não pode ser abaixo de zero ");
        }
        DadosNota Conexao = new DadosNota();
        Conexao.cadastrarNota1(N);

    }

    @Override
    public void cadastrarNota2(Nota N) throws Exception {
        if (N.getAluno().getMatricula() <= 0) {
            throw new Exception("a matricula do aluno  não pode ser igual ou abaixo de zero");
        }
        //validando o codigo da disciplina
        if (N.getDisciplina().getCodigoDisciplina() <= 0) {
            throw new Exception("o codigo da disciplina não pode ser abaixo ou igual a zero");
        }

        // validando  segunda  nota
        if (N.getNota2() < 0) {
            throw new Exception("a nota não pode ser abaixo de zero ");
        }
        DadosNota Conexao = new DadosNota();
        Conexao.cadastrarNota1(N);
    }

    public ArrayList<Nota> listarNotas(int matricula, int cd_curso) throws Exception {
        DadosNota Dn = new DadosNota();
        DadosDisciplinaEspecifica Dd = new DadosDisciplinaEspecifica();

        ArrayList<Nota> notas = new ArrayList<>();

        try {
            ArrayList<DisciplinaEspecifica> Dis = Dd.listar(Integer.toString(cd_curso));

            for (DisciplinaEspecifica disciplina : Dis) {
                Nota nt = Dn.buscarNota(matricula, disciplina.getCodigoDisciplina());
                notas.add(nt);
            }

            return notas;
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
        }
    }
}
