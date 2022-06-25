/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota;

import java.util.ArrayList;

/**
 *
 * @author deyvid
 */
public interface InterfaceNota {
    void cadastrarNota1(Nota N) throws Exception;
    
    void cadastrarNota2(Nota N) throws Exception;
    
    void alterarNota(Nota N) throws Exception;

    void removerNota (Nota N) throws Exception;
   
    ArrayList<Nota> listar(Nota filtro) throws Exception;

    
}
