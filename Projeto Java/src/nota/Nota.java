/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

import aluno.Aluno;
import disciplina.DisciplinaEspecifica;

public class Nota {

    private float nota1;
    private float nota2;
    private DisciplinaEspecifica disciplina = new DisciplinaEspecifica();
    private Aluno aluno = new Aluno();

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public DisciplinaEspecifica getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(DisciplinaEspecifica disciplina) {
        this.disciplina = disciplina;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

}
