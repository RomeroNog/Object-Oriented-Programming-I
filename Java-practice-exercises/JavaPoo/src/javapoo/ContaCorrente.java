/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo;

/**
 *
 * @author igor.nogueira_unesp
 */
public class ContaCorrente {
    String titular;
    double saldo;
    double limite;
    
    
    ContaCorrente(){}
    ContaCorrente(String titular,double saldo,double limite)
    {
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }
    
    void setTitular(String titular)
    {
        this.titular = titular;
    }
    void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    void setLimite(double limite)
    {
        this.limite = limite;
    }
    
    String getTitular()
    {
        return titular;
    }
    double getSaldo()
    {
        return saldo;
    }
    double getLimite()
    {
        return limite;
    }
    
    void ExibirValores()
    {
        System.out.println("Titular: "+getTitular()+" Saldo: "+getSaldo()+" Limite: "+getLimite());
    }
    void Depositar(float valor)
    {
       if(valor>0)
       {
           saldo+=valor;
           System.out.println("Deposito concluido");
       }
       else
       {
           System.out.println("Valor invalido");
       }
    }
    void Saque(float valor)
    {
        if(saldo+limite>=valor)
        {
            if(saldo>=valor)
            {
                saldo -=valor;
                System.out.println("Saque bem sucedido");        
            }
            else
            {
                valor -=saldo;
                limite -=valor;
                saldo = 0;
            }
        }
        else
        {
            System.out.println("Saldo insuficiente!");
        }
    }
}
