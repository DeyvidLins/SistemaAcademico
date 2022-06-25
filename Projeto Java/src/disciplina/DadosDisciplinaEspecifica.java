package disciplina;

import Conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DadosDisciplinaEspecifica extends Conexao implements InterfaceDisciplinaEspecifica {

    @Override
    public void cadastrarDisciplina(DisciplinaEspecifica D) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "INSERT INTO DisciplinaEspecifica (Cd_Disciplina,NM_Disciplina,Turma,turno) ";
        sql += " VALUES (?,?,?,?)";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, D.getCodigoDisciplina());
        preparedStatement.setString(2, D.getNomeDisciplina());
        preparedStatement.setString(3, D.getTurma());
        preparedStatement.setString(4, D.getTurno());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public void removerDisciplina(DisciplinaEspecifica D) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "DELETE FROM DisciplinaEspecifica WHERE Cd_Disciplina = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, D.getCodigoDisciplina());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public void alterarDisciplina(DisciplinaEspecifica D) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = "UPDATE DisciplinaEspecifica SET NM_Disciplina =? ,Turma = ? ,turno = ? where cd_disciplina = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, D.getNomeDisciplina());
        preparedStatement.setString(2, D.getTurma());
        preparedStatement.setString(3, D.getTurno());
        preparedStatement.setInt(4, D.getCodigoDisciplina());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }
    
    @Override
    public ArrayList<DisciplinaEspecifica> listar(String filtro) throws Exception {
        ArrayList<DisciplinaEspecifica> retorno = new ArrayList<>();

        //instrução sql correspondente a inserção do aluno
        String sql = " select Cd_Disciplina,Nm_Disciplina,turno,turma ";
        sql += " from DisciplinaEspecifica ";
        
        if (!filtro.isEmpty()) {
            sql += " where cd_curso = '" + filtro + "'";
        }
        
        //preparando a instrução
        PreparedStatement preparedStatement;
        try {
            preparedStatement = super.conectar().prepareStatement(sql);
                    //executando a instrução sql
            ResultSet leitor = preparedStatement.executeQuery();
            //lendo os resultados
            while (leitor.next()) {
                DisciplinaEspecifica D = new DisciplinaEspecifica();
                D.setCodigoDisciplina(leitor.getInt("Cd_Disciplina"));
                D.setNomeDisciplina(leitor.getString("Nm_Disciplina"));
                D.setTurno(leitor.getString("turno"));
                D.setTurma(leitor.getString("turma"));
                retorno.add(D);
            }
            //fechando a conexão com o banco de dados
            super.desconectar();
            return retorno;
            
        } catch (Exception ex) {
            throw new Exception("Erro ao buscar disciplinas!");
        }


    }
    
    public DisciplinaEspecifica buscaDisciplina(int cd_disciplina) throws Exception {
        DisciplinaEspecifica disciplina = new DisciplinaEspecifica();
        
        String sql = " select Cd_Disciplina, Nm_Disciplina, turno, turma ";
        sql += " from DisciplinaEspecifica where cd_disciplina = '" + cd_disciplina + "' ";
        
        PreparedStatement preparedStatement;
        try {
            preparedStatement = super.conectar().prepareStatement(sql);
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next()) {
                disciplina.setCodigoDisciplina(cd_disciplina);
                disciplina.setNomeDisciplina(rs.getString("Nm_disciplina"));
                disciplina.setTurno(rs.getString("turno"));
                disciplina.setTurma(rs.getString("turma"));
            }
            
            super.desconectar();
            return disciplina;
            
        } catch (Exception ex) {
            throw new Exception("Erro ao buscar disciplina");
        }
        
        
    }
    
    @Override
    public void vincularDisciplina(DisciplinaEspecifica D) throws Exception {
        String sql = " UPDATE curso SET Cd_Disciplina = ? WHERE Nm_Curso = ? ";
        PreparedStatement stmt = super.conectar().prepareStatement(sql);
        stmt.setInt(1, D.getCodigoDisciplina());
        stmt.setString(2, D.getCurso().getNomeCurso());

        stmt.executeUpdate();

        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    public ArrayList<DisciplinaEspecifica> listar(DisciplinaEspecifica c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
