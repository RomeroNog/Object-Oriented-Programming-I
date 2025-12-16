/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author manoe
 */
public class Departamento {
    private String codigo;
    private String nome;
    private int MAXFUNC = 30;
    private Funcionario funcionarios[] = new Funcionario[MAXFUNC];
    private int contaFunc = 0;
    private double MinFxSal = 1600.5;
    private double MaxFxSal = 3000.5;
    private double MinFxDep = 3000.5;
    private double MaxFxDep = 10000.5;
    
    //Construtores
    public Departamento(){}
    public Departamento(String codigo,String nome)
    {
        this.codigo = codigo;
        this.nome = nome;
    }
 
    //Getters e Setters
    public String getCodigo()
    {
        return this.codigo;
    }
    public void setCodigo(String codigo) 
    {
        this.codigo = codigo; 
    }
    
    public String getNome() 
    {
        return this.nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    
    public Funcionario[] getFuncionarios()
    {
        return funcionarios;
    }
    
    public void setFuncionario(Funcionario funcs[])
    {
        this.funcionarios = funcs;
    }   
    
    public int getContador()
    {
        return contaFunc;
    }
    
    //Metodos
    public void addFuncionario(Funcionario f)
    {
        if(contaFunc<MAXFUNC)
        {
            funcionarios[contaFunc++] = f;
        }
        else System.out.println("Nao foi possivel adicionar!");
    }
    
    public double gastoTotal()
    {
        double soma=0;
        for(int i=0;i<contaFunc;i++)
        {
            soma+=funcionarios[i].calcularSalario();
        }
        return soma;
    }
    
    public Funcionario buscaPorCodigo(String cod)
    {
        for(int i=0;i<contaFunc;i++)
        {
            if(funcionarios[i].codigo.equals(cod))
            {
                return funcionarios[i];
            }
        }
        return null;
    }
    
    public Funcionario buscaPorNome(String nome)
    {
        for(int i=0;i<contaFunc;i++)
        {
            if(funcionarios[i].nome.equals(nome))
            {
                return funcionarios[i];
            }
        }
        return null;
    }
    
    public void exibirFuncEspecifCod(String cod)
    {
        Funcionario f;
        f = buscaPorCodigo(cod);
        if(f!=null)
        {
            f.exibir();
        }
        else
        {
            System.out.println("Funcionário nao encontrado!");
        }
    }
    
    public void exibirFuncEspecifNome(String nome)
    {
        Funcionario f;
        f = buscaPorNome(nome);
        if(f!=null)
        {
            f.exibir();
        }
        else
        {
            System.out.println("Funcionário nao encontrado!");
        }
    }
    
    public void exibirDocentesSubstitutos()
    {
        for(int i=0;i<contaFunc;i++)
        {
            if(funcionarios[i] instanceof Substituto)
            {
                ((Substituto)funcionarios[i]).exibir();
            }
        }
    }
    public void exibirDocentesEfetivos()
    {
        for(int i=0;i<contaFunc;i++)
        {
            if(funcionarios[i] instanceof Efetivo)
            {
                ((Efetivo)funcionarios[i]).exibir();
            }
        }
    }
    public void exibirDocentes()
    {
        this.exibirDocentesEfetivos();
        System.out.println("");
        this.exibirDocentesSubstitutos();
    }
    
    public void exibirTecnicos()
    {
        for(int i=0;i<contaFunc;i++)
        {
            if(funcionarios[i] instanceof Tecnico)
            {
                ((Tecnico)funcionarios[i]).exibir();
            }
        }
    }
    
    public void exibirFuncionarios()
    {
        for(int i=0;i<contaFunc;i++)
        {
            funcionarios[i].exibir();
        }
    }
    
    public void FuncSalEspecifc()
    {
        System.out.println("Funcionarios com salario na faixa especificada!");
        for(int i=0;i<contaFunc;i++)
        {
            if(funcionarios[i].calcularSalario()>= MinFxSal && funcionarios[i].calcularSalario()<=MaxFxSal)
            {
                funcionarios[i].exibir();
            }
        }
    }
    
    public void exibir()
    {
        System.out.println("Resumo do departamento");
        System.out.println("Nome: "+this.nome);
        System.out.println("Codigo: "+this.codigo);
        System.out.println("Numero de funcionarios: "+this.contaFunc);
        System.out.println("Gasto do Departamento: "+this.gastoTotal());
    }
    
    public void DepGastoEspecif()
    {
        if(this.gastoTotal()>=MinFxDep && this.gastoTotal()<=MaxFxDep)
        {
            this.exibir();
        }
    }
    
}
