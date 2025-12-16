/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vetores;

import java.util.Scanner;

/**
 *
 * @author manoe
 */
public class ContaEspecial {
    public String numero;
    public String titular;
    public float saldo;
    public float limite;

    public ContaEspecial(){}
    
    public ContaEspecial(String numero,String titular,float saldo, float limite)
    {
        this.numero = numero;
        this.titular = titular;
        this.saldo=saldo;
        this.limite = limite;
    }
    
    public void setNumero(String numero)
    {
        this.numero=numero;
    }
    public String getNumero()
    {
        return numero;
    }
    
    public void setTitular(String titular)
    {
        this.titular=titular;
    }
    public String getTitular()
    {
        return titular;
    }
    
    public void setSaldo(float saldo)
    {
        this.saldo=saldo;
    }
    public float getSaldo()
    {
         return saldo;       
    }
    
    public void setLimite(float limite)
    {
        this.limite = limite;
    }
    public float getLimite()
    {
        return limite;
    }


    void depositar(float valor)
    {
        if(valor>0)
        {
            saldo+=valor;
            System.out.println("Valor depositado");
        }
        else
        {
            System.out.println("Valor invalido");
        }
    }

    void saque(float valor)
    {
        if(valor<=saldo+limite)
        {
            if(valor>saldo)
            {
                valor-=saldo;
                saldo=0;
                limite-=valor;
                System.out.println("Saque bem sucedido");
            }
            else
            {
               saldo-=valor; 
                System.out.println("Saque bem sucedido");
            } 
        }
        else
        {
            System.out.println("Valor excede o limite");
        }
    }
    
    public int tam=20;
    public int cont=0;
    ContaEspecial vetor[] = new ContaEspecial[tam];
    
    void menu()
    {
        System.out.println("MENU");
        System.out.println("1-Cadastrar Nova Conta");
        System.out.println("2-Saque");
        System.out.println("3-Deposito");
        System.out.println("4-Listar contas(posi vetor+nome)");
        System.out.println("5-Relatorio Geras(all contas)");
        System.out.println("6-Relatorio de Contas negativas(saldo<0)");
        System.out.println("7-Relatorio da conta de um cliente x");
        System.out.println("9-Sair");
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        exec(op);
    }
    
    private void exec(int op)
    {
        switch(op)
        {
            case 1:
                if(cont<tam)
                {
                    Scanner sc = new Scanner(System.in);
                    vetor[cont] = new ContaEspecial();
                    
                    System.out.println("Numero: ");
                    vetor[cont].numero = sc.nextLine();
                    
                    System.out.println("Titular: ");
                    vetor[cont].titular = sc.nextLine();
                    
                    System.out.println("Saldo: ");
                    vetor[cont].saldo = sc.nextFloat();
                    
                    System.out.println("Limite: ");
                    vetor[cont].limite = sc.nextFloat();
                }
                cont++;
                menu();
                break;
                
            case 2:
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o numero da conta: ");
                String numero_verif = sc.nextLine();
                ContaEspecial a = new ContaEspecial();
                
                a = buscaNumero(numero_verif);
                if(a!=null)
                {
                    System.out.println("Digite o valor do saque: ");
                    float valor = sc.nextFloat();
                    a.saque(valor);
                }
                else
                {
                    System.out.println("Numero da conta nao registrado!");
                }
                menu();
                break;
                
            case 3:
                Scanner sa = new Scanner(System.in);
                System.out.println("Digite o numero da conta: ");
                String numero_veri = sa.nextLine();
                ContaEspecial b = new ContaEspecial();
                
                b = buscaNumero(numero_veri);
                if(b!=null)
                {
                    System.out.println("Digite o valor do deposito: ");
                    float valor = sa.nextFloat();
                    b.depositar(valor);
                }
                else
                {
                    System.out.println("Numero da conta nao registrado!");
                }
                menu();
                break;
                
            case 4:
                for(int i=0;i<cont;i++)
                {
                    System.out.println(vetor[i].getTitular() + ++i);
                    i--;
                }
                menu();
                break;
                
            case 5:
                for(int i=0;i<cont;i++)
                {
                    exibir(vetor[i]);
                }
                menu();
                break;
            
            case 6:
                for(int i=0;i<cont;i++)
                {
                    if(vetor[i].getSaldo()<=0)
                    {
                        System.out.println("Contas com saldo <=0");
                        exibir(vetor[i]);
                    }
                }
                menu();
                break;
                
            case 7:
                Scanner sn = new Scanner(System.in);
                ContaEspecial ac = new ContaEspecial();
                
                System.out.println("Digite o numero: ");
                String num = sn.nextLine();
                ac = buscaNumero(num);
                if(ac!=null)
                {
                    exibir(ac);
                }
                else
                {
                    System.out.println("Nao há contas com esse numero");
                }
                menu();
                break;
                
            case 9:
                break;
        }
    }
    
    private ContaEspecial buscaNumero(String numero)
    {
        for(int i=0;i<cont;i++)
        {
            if(vetor[i].getNumero().equals(numero))
            {
                return vetor[i];
            }
            
        }
        return null;
    }
    
    private void exibir(ContaEspecial ce)
    {
        ContaEspecial ac = ce;
        System.out.println("Numero: "+ac.getNumero());
        System.out.println("Titular: "+ac.getTitular());
        System.out.println("Saldo: "+ac.getSaldo());
        System.out.println("Limite: "+ac.getLimite());
    }
}
    
