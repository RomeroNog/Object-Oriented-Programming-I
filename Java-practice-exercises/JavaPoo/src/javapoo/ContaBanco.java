/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo;

/**
 *
 * @author manoe
 */
public class ContaBanco {
    public String numero;
    public String cliente;
    public double saldo;
    
    ContaBanco(){}
    ContaBanco(String numero,String cliente,double saldo)
    {
        this.numero=numero;
        this.cliente=cliente;
        this.saldo=saldo;
    }
    public void Deposito(double valor)
    {
        if(valor>0)
        {
            saldo +=valor;
        }
    }
    public void Sacar(double valor)
    {
        if(valor <= saldo)
        {
            saldo -=valor;
        }
    }
    
    
    public void setNumero(String numero)
    {
        this.numero = numero;
    }
    void setCliente(String cliente)
    {
        this.cliente = cliente;
    }
    void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
    
    public String getNumero()
    {
        return numero;
    }
    public String getCliente()
    {
        return cliente;
    }
    public double getSaldo()
    {
        return saldo;
    }
}
