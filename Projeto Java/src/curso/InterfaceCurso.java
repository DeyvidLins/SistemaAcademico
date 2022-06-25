/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso;


import java.util.ArrayList;

/**
 *
 * @author deyvid
 */
public interface InterfaceCurso {
    
    void cadastrarCurso(Curso C) throws Exception;

    void alterarCurso(Curso C) throws Exception;

    void removerCurso(Curso C) throws Exception;
   
    ArrayList<Curso> listar(Curso filtro) throws Exception;

    
}
