/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova1POO;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Sistema {
    private int contAl=0;
    private int tamAl = 30;
    private Aluno alunos[] = new Aluno[tamAl];

    public void addAluno(String ra,String nome, int numDisciplinas)
    {
        if(contAl<tamAl)
        {
            Aluno al = new Aluno(ra,nome,numDisciplinas);
            alunos[contAl++] = al;
        }
        else System.out.println("Numero de alunos excedido!");
    }
    
    public Aluno buscaAluno(String ra)
    {
        for(int i=0;i<contAl;i++)
        {
            if(alunos[i]!=null && alunos[i].getRa().equals(ra))
            {
                return alunos[i];
            }
        }
        System.out.println("Aluno nao encontrado no sistema!");
        return null;
    }
    
    public void atribuirAluno(String ra,Disciplina d)
    {
        Aluno aln = buscaAluno(ra);
        if(aln!=null)
        {
            aln.addDisciplina(d);
        }
    }
    
    public void exibirAlunosComReprova()
    {
        for(int i=0;i<contAl;i++)
        {
            if(alunos[i]!=null && alunos[i].possuiReprova() == true)
            {
                alunos[i].exibirAluno();
            }
        }
    }
    
    public void DadosAluno(String ra)
    {
        Aluno aln = buscaAluno(ra);
        if(aln!=null) aln.exibirAluno();
    }
    
    public void exibirTodosAlunos()
    {
        for(int i=0;i<contAl;i++)
        {
            if(alunos[i]!=null) alunos[i].exibirAluno();
        }
    }
    
    
    
    
    
    
    
    
    
}
