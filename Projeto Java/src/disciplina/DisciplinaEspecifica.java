package disciplina;

import curso.Curso;

public class DisciplinaEspecifica {

    private int codigoDisciplina;
    private String nomeDisciplina;
    private String turma;
    private String turno;
    Curso curso = new Curso();

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

   

    public int getCodigoDisciplina() {
        return codigoDisciplina;
    }

    public void setCodigoDisciplina(int codigoDisciplina) {
        this.codigoDisciplina = codigoDisciplina;
    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}
