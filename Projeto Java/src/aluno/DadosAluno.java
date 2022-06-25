package aluno;

import Conexao.Conexao;
import curso.Curso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DadosAluno extends Conexao implements InterfaceAluno {

    @Override
    public void cadastrarAluno(Aluno A) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = " INSERT INTO aluno (nome,DataNascimento,cpf,rg,estado,estacivil,cidade,sexo,telefone) ";
        sql += " VALUES (?,?,?,?,?,?,?,?,?) ";
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, A.getNome());
        preparedStatement.setString(2, A.getDataNascimento());
        preparedStatement.setString(3, A.getCpf());
        preparedStatement.setString(4, A.getRg());
        preparedStatement.setString(5, A.getEstado());
        preparedStatement.setString(6, A.getEstadoCivil());
        preparedStatement.setString(7, A.getCidade());
        preparedStatement.setString(8, A.getSexo());
        preparedStatement.setString(9, A.getTelefone());

        // execute insert SQL stetement
        preparedStatement.executeUpdate();

        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public void removerAluno(Aluno A) throws SQLException, Exception {
        //instrucao a ser executada
        String sql = " DELETE FROM aluno ";
        sql += "   WHERE matricula = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setInt(1, A.getMatricula());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();
        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public void alterarAluno(Aluno A) throws SQLException, Exception {

        //instrucao a ser executada
        String sql = "UPDATE aluno SET nome =  ?,dataNascimento = ? , ";
        sql += "cpf = ? ,rg = ? ,estado = ? , ";
        sql += "estaCivil = ? , cidade = ? , ";
        sql += "sexo = ? , telefone = ? ";
        sql += "where nome = ? ";

        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);
        //passando os valores para os parametros
        preparedStatement.setString(1, A.getNome());
        preparedStatement.setString(2, A.getDataNascimento());
        preparedStatement.setString(3, A.getCpf());
        preparedStatement.setString(4, A.getRg());
        preparedStatement.setString(5, A.getEstado());
        preparedStatement.setString(6, A.getEstadoCivil());
        preparedStatement.setString(7, A.getCidade());
        preparedStatement.setString(8, A.getSexo());
        preparedStatement.setString(9, A.getTelefone());
        preparedStatement.setString(10, A.getNome());
        // execute insert SQL stetement
        preparedStatement.executeUpdate();

        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public ArrayList<Aluno> listar(Aluno filtro) throws Exception {
        ArrayList<Aluno> retorno = new ArrayList<>();

        //instrução sql correspondente a inserção do aluno
        String sql = " select a.matricula, a.nome ";
        sql += " from aluno as a ";
        sql += " where a.matricula > 0 ";
        if (filtro.getMatricula() > 0) {
            sql += " and a.matricula = ? ";
        }
        //preparando a instrução
        PreparedStatement preparedStatement = super.conectar().prepareStatement(sql);

        if (filtro.getMatricula() > 0) {
            preparedStatement.setInt(1, filtro.getMatricula());
        }
        //executando a instrução sql
        ResultSet leitor = preparedStatement.executeQuery();
        //lendo os resultados
        while (leitor.next()) {
            Aluno a = new Aluno();
            a.setMatricula(leitor.getInt("matricula"));
            a.setNome(leitor.getString("nome"));
            retorno.add(a);
        }
        //fechando a conexão com o banco de dados
        super.desconectar();
        return retorno;
    }

    @Override
    public void matricularAluno(Aluno A) throws Exception {
        String sql = " UPDATE ALUNO SET Cd_Curso = ? WHERE nome = ? ";
        PreparedStatement stmt = super.conectar().prepareStatement(sql);
        stmt.setInt(1, A.getCurso().getCodigoCurso());
        stmt.setString(2, A.getNome());

        stmt.executeUpdate();

        //fechando a conexão com o banco de dados
        super.desconectar();
    }

    @Override
    public Boolean fazerLogin(Aluno A) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Aluno buscaAlunoPorMatricula(Integer matricula) throws Exception {
       Aluno NovoAluno = new Aluno();

        try {
            String sql = "select matricula, datanascimento from Aluno where matricula = '" + matricula + "'";
            PreparedStatement stmt = super.conectar().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while(rs.next()){
                NovoAluno.setMatricula(rs.getInt("matricula"));
                NovoAluno.setDataNascimento(rs.getString("datanascimento"));
            }

            super.desconectar();            
            return NovoAluno;

        } catch (SQLException ex) {
            throw new Exception(ex.getMessage());
        }
    }

    public Object[] buscarDetalhesAluno(Integer matricula) throws Exception {

           
        Aluno a = new Aluno();
        Curso c = new Curso();
        
        Object[] Data = new Object[2];
        //instrucao a ser executada
        String sql = " SELECT A.matricula,A.nome,A.cd_curso,C.nm_curso ";
        sql+=" FROM Aluno AS A INNER JOIN ";
        sql+=" Curso AS C ON C.cd_curso=A.cd_curso "; 
        sql+=" Where A.matricula = '" + matricula + "'";
        
        try {
            //preparando a instrução
            PreparedStatement stmt = super.conectar().prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                a.setMatricula(rs.getInt("matricula"));
                a.setNome(rs.getString("nome"));
                c.setNomeCurso(rs.getString("nm_Curso"));
                c.setCodigoCurso(rs.getInt("cd_Curso"));
                Data[0] = a;
                Data[1] = c;
            }

            super.desconectar();
            return Data;
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
       }
    }
    public Object[] mostraMatricula(Integer matricula) throws Exception {
          Aluno a = new Aluno();
    //    Curso c = new Curso();
        
        Object[] Data = new Object[2];
        //instrucao a ser executada
        String sql = " select matricula from Aluno" + matricula + "'";
        
        try {
            //preparando a instrução
            PreparedStatement stmt = super.conectar().prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                a.setMatricula(rs.getInt("matricula"));
           //     a.setNome(rs.getString("nome"));
            //    c.setNomeCurso(rs.getString("nm_Curso"));
                Data[0] = a;
               // Data[1] = c;
            }

            super.desconectar();
            return Data;
        } catch (Exception ex) {
            throw new Exception(ex.getMessage());
       }
    }
        
    
}

 
