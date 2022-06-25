/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

import Conexao.Conexao;
import disciplina.DadosDisciplinaEspecifica;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DadosNota extends Conexao implements InterfaceNota {

  
    @Override
    public void alterarNota(Nota N) throws Exception {
        //instrucao a ser executada
        String sql = "UPDATE nota SET nota1 =  ?, nota2 = ? , ";
        sql += "cd_disciplina = ? where matricula = ?   ";
        //preparando a instrução
        PreparedStatement stmt = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        stmt.setFloat(1, N.getNota1());
        stmt.setFloat(2, N.getNota2());
        stmt.setInt(3, N.getDisciplina().getCodigoDisciplina());
        stmt.setInt(4, N.getAluno().getMatricula());

        // execute insert SQL stetement
        stmt.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public void removerNota(Nota N) throws Exception {
  //instrucao a ser executada
        String sql = " DELETE FROM Notas ";
        sql += "   WHERE matricula = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(4, N.getAluno().getMatricula());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    
    }

    @Override
    public ArrayList<Nota> listar(Nota filtro) throws Exception {
        ArrayList<Nota> retorno = new ArrayList<>();
        String sql = " select D.Cd_Disciplina, D.Nm_Disciplina,D.turno,D.turma ";
        sql += " from DisciplinaEspecifica as D ";
        sql += " where D.Cd_Disciplina > 0 ";

        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

        ResultSet leitor = preparedStatement.executeQuery();

        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;

    }
    
    public Nota buscarNota(int matricula, int cd_disciplina) throws Exception {
        Nota nota = new Nota();
        DadosDisciplinaEspecifica Dd = new DadosDisciplinaEspecifica();
        
        String sql = "select nota1, nota2 from notas ";
        sql += " where Cd_Disciplina ='" + cd_disciplina + "' and matricula = '" + matricula+ "' ";
      
        try {
            PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()) {
                nota.setNota1(rs.getFloat("nota1"));
                nota.setNota2(rs.getFloat("nota2"));
                nota.setDisciplina(Dd.buscaDisciplina(cd_disciplina));
            }
            
            super.desconectar();
            
            return nota;
        } catch (Exception ex) {
            throw new Exception("Erro ao buscar nota!");
           
        }
    }

    @Override
    public void cadastrarNota1(Nota N) throws Exception {
         String sql = " INSERT INTO Nota (matricula,cd_Disciplina,Nota1)  ";
        sql += " VALUES (?,?,?) ";
        PreparedStatement stmt = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        stmt.setInt(1, N.getAluno().getMatricula());
        stmt.setInt(2, N.getDisciplina().getCodigoDisciplina());
        stmt.setFloat(3, N.getNota1());

        // execute insert SQL stetement
        stmt.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public void cadastrarNota2(Nota N) throws Exception {
          String sql = " INSERT INTO Nota (matricula,cd_Disciplina,Nota2)  ";
        sql += " VALUES (?,?,?) ";
        PreparedStatement stmt = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        stmt.setInt(1, N.getAluno().getMatricula());
        stmt.setInt(2, N.getDisciplina().getCodigoDisciplina());
        stmt.setFloat(3, N.getNota2());
        // execute insert SQL stetement
        stmt.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

}
