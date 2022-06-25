/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplina;

import java.util.ArrayList;

public interface InterfaceDisciplinaEspecifica {

    void cadastrarDisciplina(DisciplinaEspecifica D) throws Exception;

    void alterarDisciplina(DisciplinaEspecifica D) throws Exception;

    void removerDisciplina(DisciplinaEspecifica D) throws Exception;

    void vincularDisciplina(DisciplinaEspecifica D) throws Exception;

    ArrayList<DisciplinaEspecifica> listar(String filtro) throws Exception;

}
