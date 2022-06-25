
package curso;




import aluno.Aluno;
import disciplina.DisciplinaEspecifica;
import java.util.ArrayList;

public class Curso {

    private int codigoCurso;
    private String nomeCurso;
    private int periodo;
    private String turno;
    private String turma;
    private ArrayList<Aluno> aluno = new ArrayList();
    private ArrayList<DisciplinaEspecifica> disciplina=new ArrayList();

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

    public ArrayList<DisciplinaEspecifica> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(ArrayList<DisciplinaEspecifica> disciplina) {
        this.disciplina = disciplina;
    }

  

    public int getCodigoCurso() {
        return codigoCurso;
    }

    
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

   
    public String getNomeCurso() {
        return nomeCurso;
    }

  
    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

}
