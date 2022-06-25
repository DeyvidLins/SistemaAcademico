package aluno;

import java.util.ArrayList;

public class NegocioAluno implements InterfaceAluno {

    @Override
    public void cadastrarAluno(Aluno A) throws Exception {
        //validando nome

        if (A == null) {
            throw new Exception("Instanciar o Aluno");
        }

        if (A.getNome() == null) {
            throw new Exception("Nulo: Informar o nome do Aluno");
        }
        if (A.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome do Aluno");
        }
        if (A.getNome().trim().length() > 100) {
            throw new Exception("O nome do Aluno não pode ter mais de 100(cem) caracteres");
        }

        //validando cpf
        if (A.getCpf() == null) {
            throw new Exception("Nulo: Informar o CPF do Aluno");
        }
        if (A.getCpf().replaceAll(" ", "").equals("..-") == true) {
            throw new Exception("Informar o CPF do Aluno");
        }
        if (A.getCpf().length() != 14) {
            throw new Exception("Informar o CPF completo do Aluno");
        }
        if (A.getCpf().contains(" ") == true) {
            throw new Exception("CPF não deve conter espaços em branco");
        }

        // validando rg
        if (A.getRg() == null) {
            throw new Exception("Nulo: Informar o Rg do Aluno");
        }
        if (A.getRg().trim().equals("") == true) {
            throw new Exception("Informar o Rg");
        }

        if (A.getRg().contains(" ") == true) {
            throw new Exception("Rg não deve conter espaços em branco");
        }

        //validando estado
        if (A.getEstado() == null) {
            throw new Exception("Nulo: Informar o Estado");
        }
        if (A.getEstado().trim().equals("") == true) {
            throw new Exception("Informar o Estado");
        }
        if (A.getEstado().trim().length() > 3) {
            throw new Exception("O Estado não pode ter mais de 2(dois) caracteres");

        }

        //validando cidade
        if (A.getCidade() == null) {
            throw new Exception("Nulo: Informar a cidade do aluno");
        }
        if (A.getCidade().trim().equals("") == true) {
            throw new Exception("Informar a cidade do aluno");
        }

        //validando dataNascimento
        if (A.getDataNascimento().trim().length() != 10) {
            throw new Exception("Data inválida");
        }
        if (A.getDataNascimento() == null) {
            throw new Exception("Nulo: Informar a data de Nascimento do aluno");
        }
        if (A.getDataNascimento().trim().equals("") == true) {
            throw new Exception("Informar a data de Nascimento do aluno");
        }
        if (A.getDataNascimento().contains(" ")) {
            throw new Exception("a data não deve conter espaços em branco");
        }
        if (A.getDataNascimento().length() < 10) {
            throw new Exception("a data de Nascimento deve conter numeros maiores que 10 ");
        }
        if (A.getDataNascimento().replaceAll(" ", "").equals("///") == true) {
            throw new Exception("Informar a data de Nascimento");
        }

        //validando estado civil
        if (A.getEstadoCivil() == null) {
            throw new Exception("Nulo: Informar o estado civil do aluno do aluno");
        }
        if (A.getEstadoCivil().trim().equals("") == true) {
            throw new Exception("Informar o estado civil do aluno");
        }
        if (A.getEstadoCivil().contains(" ")) {
            throw new Exception("o estado civil nao pode estar em branco");
        }

        //validando telefone
        if (A.getTelefone() == null) {
            throw new Exception("Nulo: Informar o telefone do Aluno");
        }
        if (A.getTelefone().replaceAll(" ", "").equals("(81)9-") == true) {
            throw new Exception("Informar o telefone do Aluno");
        }
        //validando sexo
        if (A.getSexo() == null) {
            throw new Exception("Nulo: Informar o Sexo");
        }
        if (A.getSexo().trim().equals("") == true) {
            throw new Exception("Informar o sexo");
        }
        if (A.getSexo().trim().length() > 2) {
            throw new Exception("O Sexo não pode ter mais de 1(um) caracter");

        }
        if (A.getSexo().replaceAll(" ", "").equals("!= m") == true) {
            throw new Exception("o sexo so dever ser M para masculino ou F para feminino");
        }
        if (A.getSexo().replaceAll(" ", "").equals("!= f") == true) {
            throw new Exception("o sexo so dever ser M para masculino ou F para feminino");
        }

        DadosAluno cadastrar = new DadosAluno();
        cadastrar.cadastrarAluno(A);

    }

    @Override
    public void removerAluno(Aluno A) throws Exception {

        //validações a matricula
        DadosAluno b = new DadosAluno();
        b.removerAluno(A);
    }

    @Override
    public void alterarAluno(Aluno A) throws Exception {
        //validando nome

        if (A == null) {
            throw new Exception("Instanciar o Aluno");
        }

        if (A.getNome() == null) {
            throw new Exception("Nulo: Informar o nome do Aluno");
        }
        if (A.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome do Aluno");
        }
        if (A.getNome().trim().length() > 100) {
            throw new Exception("O nome do Aluno não pode ter mais de 100(cem) caracteres");
        }

        //validando cpf
        if (A.getCpf() == null) {
            throw new Exception("Nulo: Informar o CPF do Aluno");
        }
        if (A.getCpf().replaceAll(" ", "").equals("..-") == true) {
            throw new Exception("Informar o CPF do Aluno");
        }
        if (A.getCpf().length() != 14) {
            throw new Exception("Informar o CPF completo do Aluno");
        }
        if (A.getCpf().contains(" ") == true) {
            throw new Exception("CPF não deve conter espaços em branco");
        }

        // validando rg
        if (A.getRg() == null) {
            throw new Exception("Nulo: Informar o Rg do Aluno");
        }
        if (A.getRg().trim().equals("") == true) {
            throw new Exception("Informar o Rg");
        }

        if (A.getRg().contains(" ") == true) {
            throw new Exception("Rg não deve conter espaços em branco");
        }

        //validando estado
        if (A.getEstado() == null) {
            throw new Exception("Nulo: Informar o Estado");
        }
        if (A.getEstado().trim().equals("") == true) {
            throw new Exception("Informar o Estado");
        }
        if (A.getEstado().trim().length() > 3) {
            throw new Exception("O Estado não pode ter mais de 2(dois) caracteres");

        }

        //validando cidade
        if (A.getCidade() == null) {
            throw new Exception("Nulo: Informar a cidade do aluno");
        }
        if (A.getCidade().trim().equals("") == true) {
            throw new Exception("Informar a cidade do aluno");
        }

        //validando dataNascimento
        if (A.getDataNascimento().trim().length() != 10) {
            throw new Exception("Data inválida");
        }
        if (A.getDataNascimento() == null) {
            throw new Exception("Nulo: Informar a data de Nascimento do aluno");
        }
        if (A.getDataNascimento().trim().equals("") == true) {
            throw new Exception("Informar a data de Nascimento do aluno");
        }
        if (A.getDataNascimento().contains(" ")) {
            throw new Exception("a data não deve conter espaços em branco");
        }
        if (A.getDataNascimento().length() < 10) {
            throw new Exception("a data de Nascimento deve conter numeros maiores que 10 ");
        }
        if (A.getDataNascimento().replaceAll(" ", "").equals("///") == true) {
            throw new Exception("Informar a data de Nascimento");
        }

        //validando estado civil
        if (A.getEstadoCivil() == null) {
            throw new Exception("Nulo: Informar o estado civil do aluno do aluno");
        }
        if (A.getEstadoCivil().trim().equals("") == true) {
            throw new Exception("Informar o estado civil do aluno");
        }
        if (A.getEstadoCivil().contains(" ")) {
            throw new Exception("o estado civil nao pode estar em branco");
        }

        //validando telefone
        if (A.getTelefone() == null) {
            throw new Exception("Nulo: Informar o telefone do Aluno");
        }
        if (A.getTelefone().replaceAll(" ", "").equals("(81)9-") == true) {
            throw new Exception("Informar o telefone do Aluno");
        }
        //validando sexo
        if (A.getSexo() == null) {
            throw new Exception("Nulo: Informar o Sexo");
        }
        if (A.getSexo().trim().equals("") == true) {
            throw new Exception("Informar o sexo");
        }
        if (A.getSexo().trim().length() > 2) {
            throw new Exception("O Sexo não pode ter mais de 1(um) caracter");

        }
        if (A.getSexo().length() != 1) {
            throw new Exception("o sexo so dever possuir 1 caracter");
        }
        if (A.getSexo().trim().length() > 0) {
            throw new Exception("Sexo não pode ser acima de 1 caracter");
        }

        DadosAluno alterar = new DadosAluno();
        alterar.alterarAluno(A);
    }

    @Override
    public ArrayList<Aluno> listar(Aluno filtro) throws Exception {
        // restrição da matricula
        if (filtro.getMatricula() == 0) {
            throw new Exception(" Informar a matricula do Aluno");
        }

        DadosAluno dados = new DadosAluno();
        return dados.listar(filtro);
    }

    @Override
    public void matricularAluno(Aluno A) throws Exception {
        //validando o codigo do curso
        if (A.getCurso().getCodigoCurso()<= 0) {
             throw new Exception("o codigo do curso não pode ser zero");
        }
        
       //validando nome
        if (A == null) {
            throw new Exception("Instanciar o Aluno");
        }

        if (A.getNome() == null) {
            throw new Exception("Nulo: Informar o nome do Aluno");
        }
        if (A.getNome().trim().equals("") == true) {
            throw new Exception("Informar o nome do Aluno");
        }
        if (A.getNome().trim().length() > 100) {
            throw new Exception("O nome do Aluno não pode ter mais de 100(cem) caracteres");
        }

        DadosAluno matricular = new DadosAluno();
        matricular.matricularAluno(A);
    }

    @Override
    public Boolean fazerLogin(Aluno A) throws Exception {
        Aluno novoAluno = new Aluno();
        DadosAluno da = new DadosAluno();

        if (A.getMatricula() == 0) {
            throw new Exception("Nulo: Informar a Matricula do aluno");
        }
        //validando dataNascimento
        if (A.getDataNascimento().trim().length() != 10) {
            throw new Exception("Data inválida");
        }
        if (A.getDataNascimento() == null) {
            throw new Exception("Nulo: Informar a data de Nascimento do aluno");
        }
        if (A.getDataNascimento().trim().equals("")) {
            throw new Exception("Informar a data de Nascimento do aluno");
        }
        if (A.getDataNascimento().contains(" ")) {
            throw new Exception("a data não deve conter espaços em branco");
        }
        if (A.getDataNascimento().length() < 10) {
            throw new Exception("a data de Nascimento deve conter numeros maiores que 10 ");
        }
        if (A.getDataNascimento().replaceAll(" ", "").equals("///")) {
            throw new Exception("Informar a data de Nascimento");
        }

        novoAluno = da.buscaAlunoPorMatricula(A.getMatricula());

        if (novoAluno.getMatricula() != A.getMatricula() || !novoAluno.getDataNascimento().equals(A.getDataNascimento())) {
            throw new Exception("Matricula ou data de nascimento inválidas.");
        } else {
            return true;
        }
    }

    @Override
    public Aluno buscaAlunoPorMatricula(Integer matricula) throws Exception {
        return null;
    }

}
