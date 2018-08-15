package view;


import controller.AlunoJpaDAO;
import model.Alunos;


public class App 
{
    public static void main(String[] args ){
        Alunos alunos = new Alunos();
        alunos.setNome("vinicinho");
        alunos.setId_aluno(1);
        alunos.setEndereco("rua topster, 12");
        
        AlunoJpaDAO.getInstance().merge(alunos);
        System.out.println("Objetos salvo com sucesso!!!");
    }
}
