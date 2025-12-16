/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prova1POO;

/**
 *
 * @author manoe
 */
public class Aluno {
    private String ra,nome;
    private Disciplina disciplina[];
    private int MaxDisci;
    private int cont=0;
    
    public Aluno(){};
    public Aluno(String ra,String nome,int MaxDisci)
    {
        this.ra = ra;
        this.nome = nome;
        this.MaxDisci = MaxDisci;
        this.disciplina = new Disciplina[MaxDisci];
    }
    

    public String getRa()
    {
        return ra;
    }
    public void setRa(String ra)
    {
        this.ra = ra;
    }
    
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public int getMaxDisci()
    {
        return MaxDisci;
    }
    public void setMaxDisci(int maxdis)
    {
        MaxDisci = maxdis;
    }
    
    public void addDisciplina(Disciplina d)
    {
        if(cont<MaxDisci)
        {
            
            disciplina[cont++] = d;    
        }
        else System.out.println("Nao foi possivel adicionar um nova disciplina");
    }
    
    public void exibirAluno()
    {
        System.out.println("Dados do aluno: ");
        System.out.println("Nome: "+getNome());
        System.out.println("Ra: "+getRa());
        for(int i=0;i<cont;i++)
        {
            disciplina[i].exibir();
        }
    } 
    
    public boolean possuiReprova()
    {
        for(int i=0;i<cont;i++)
        {
            if(disciplina[i].estaAprovado() == false)
            {
                return true;
            }
        }
        return false;    
    }
    
    public void disciAprovado()
    {
        boolean aprovado=false;
        for(int i=0;i<cont;i++)
        {
            if(disciplina[i].estaAprovado() == true)
            {
                if(!aprovado)
                {
                    System.out.println("Disciplinas Aprovado: ");
                    aprovado = true;
                }
                System.out.print("-" + disciplina[i].nome);
            }
            
        }
        System.out.println("");
    }
    
    public void mediaFinal()
    {
        float soma = 0;
        for(int i=0;i<cont;i++)
        {
            soma += disciplina[i].calcularNota();
        }
        float media = soma/cont;
        System.out.println("Media Final: "+media);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
