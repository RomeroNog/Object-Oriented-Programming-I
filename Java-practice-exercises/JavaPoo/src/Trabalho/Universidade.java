/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author manoe
 */
public class Universidade {
    private String nome;
    private int MaxDep = 30;
    private Departamento deps[] = new Departamento[MaxDep];
    private int contaDep=0;
    
    
    
    //Construtores
    public Universidade(){}
    public Universidade(String name)
    {
        nome = name;
    }
    
    //Getters e Setters
    public String getNome()
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    //Metodos
    public void addDep(Departamento dep)
    {
        if(contaDep<MaxDep)
        {
            deps[contaDep++] = dep;
        }
        else
        {
            System.out.println("Erro ao adicionar departamento!");   
        }
    }
    
    public Departamento buscaDep(String codigo)
    {
        for(int i=0;i<contaDep;i++)
        {
            if(deps[i].getCodigo().equals(codigo))
            {
                return deps[i];
            }
        }
        return null;
    }
    
    public void exibirDepEspecif(String codigo)
    {
        Departamento d;
        d = buscaDep(codigo);
        if(d!=null)
        {
            d.exibir();
        }
        else
        {
            System.out.println("Departamento nao encontrado!");
        }
        
    }
    
    public void DepsComGastoEspecif()
    {
        for(int i=0;i<contaDep;i++)
        {
            deps[i].DepGastoEspecif();
        }
    }
    public void exibirTdsDeps()
    {
        for(int i=0;i<contaDep;i++)
        {
            deps[i].exibir();
        }
    }
    
    public void relatorioGeral()
    {
        System.out.println("Nome Universidade: "+this.nome);
        for(int i=0;i<contaDep;i++)
        {
            Funcionario funs[] = deps[i].getFuncionarios();
            int contafunc = deps[i].getContador();
            
            System.out.println("Informações do Departamento ");
            deps[i].exibir();
            System.out.println("Nome dos funcionários: ");
            for(int j=0;j<contafunc;j++)
            {
                System.out.println(funs[j].getNome());
            }
        }
    }
    
}
