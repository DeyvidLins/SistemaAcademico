/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;

import Conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author deyvid
 */
public class DadosCurso extends Conexao implements InterfaceCurso {

    @Override
    public void cadastrarCurso(Curso C) throws Exception {
        String sql = "INSERT INTO Curso (Cd_Curso,Nm_curso,Periodo,turma,turno) ";
        sql += " VALUES (?,?,?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, C.getCodigoCurso());
        preparedStatement.setString(2, C.getNomeCurso());
        preparedStatement.setInt(3, C.getPeriodo());
        preparedStatement.setString(4, C.getTurma());
        preparedStatement.setString(5, C.getTurno());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public void alterarCurso(Curso C) throws Exception {
        //instrucao a ser executada
        //instrucao a ser executada
        String sql = "UPDATE Curso SET Nm_curso  =  ? , Periodo  = ? , turma = ? , turno = ?  where Cd_Curso = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
       
        preparedStatement.setString(1, C.getNomeCurso());
        preparedStatement.setInt(2, C.getPeriodo());
        preparedStatement.setString(3, C.getTurma());
        preparedStatement.setString(4, C.getTurno());
         preparedStatement.setInt(5, C.getCodigoCurso());
        
        
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public void removerCurso(Curso C) throws Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM Curso WHERE cd_curso = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, C.getCodigoCurso());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public ArrayList<Curso> listar(Curso filtro) throws Exception {
        ArrayList<Curso> retorno = new ArrayList<>();

        //instrução sql correspondente a inserção do aluno
        String sql = " select c.CD_CURSO,c.NM_CURSO,c.Periodo,c.turno,c.turma ";
        sql += " from Curso as c";
        sql += " where c.CD_CURSO > 0 ";
        if (filtro.getCodigoCurso() > 0) {
            sql += " and c.CD_CURSO = ? ";
        }
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

        if (filtro.getCodigoCurso() > 0) {
            preparedStatement.setInt(1, filtro.getCodigoCurso());
        }
        //executando a instrução sql
        ResultSet leitor = preparedStatement.executeQuery();
        //lendo os resultados
        while (leitor.next()) {
            Curso C = new Curso();
            C.setCodigoCurso(leitor.getInt("CD_CURSO"));
            C.setNomeCurso(leitor.getString("NM_CURSO"));
            C.setPeriodo(leitor.getInt("Periodo"));
            C.setTurno(leitor.getString("turno"));
            C.setTurma(leitor.getString("turma"));

            retorno.add(C);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }

}
