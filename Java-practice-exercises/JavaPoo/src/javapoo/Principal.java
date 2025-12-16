/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javapoo;

import java.util.Scanner;

/**
 *
 * @author igor.nogueira_unesp
 */
public class Principal {
    public static void main(String[] args)
    {
        Veiculo v1 = new Veiculo();
        
        v1.setAno(1987);
        v1.setMarca("Fiat");
        v1.setModelo("147");

        v1.devolver();
        if(v1.estaDisponivel())
        {
            System.out.println("Disponivel");
        }
        else
        {
            System.out.println("Nao disponivel");
        }
        v1.emprestar();
        System.out.println("Disponibilidade: "+v1.disponivel);
        System.out.println("Ano: "+v1.getAno());
        System.out.println("Marca: "+v1.getMarca());
        System.out.println("Modelo:"+v1.getModelo());
        
        Aluno a1 = new Aluno(  );
        
        a1.setNome("Jakson");
        a1.setRa("56223443262");
        a1.setT1(7.2f);
        a1.setT2(8.5f);
        a1.setP1(9.9f);
        a1.setP2(4.1f);
        
        System.out.println("Aprovado: "+ a1.APROVADO());
        Aluno a2 = new Aluno("igor","422",8.6f,4.5f,2.5f,9);
        System.out.println("Aprovado: "+a2.APROVADO());
        
        Academia ac1 = new Academia();
        
        ac1.setNome("Jakson");
        ac1.setIdade(18);
        ac1.setAltura(1.85f);
        ac1.setPeso(65);
        
        if(ac1.isMenor())
        {
            System.out.println("Voce tem 10% de desconto!");
        }
        else
        {
            System.out.println("Sem descontos!");
        }
        System.out.println("Seu IMC eh: "+ac1.IMC());
        
        ContaBanco c1 = new ContaBanco();
        c1.setNumero("1234567");
        c1.setCliente("Jorge");
        c1.setSaldo(4202.90f);
        
        System.out.println("Cliente: "+c1.getCliente());
        System.out.println("Numero conta: "+c1.getNumero());
        System.out.println("Saldo: "+c1.getSaldo());
        c1.Deposito(500);
        System.out.println("Novo saldo: "+c1.getSaldo());
        c1.Sacar(401.45f);
        System.out.println("Novo saldo: "+c1.getSaldo());
        
        Horario h1 = new Horario(17,5,57);
        h1.ExibirHora();
        System.out.println("Segundos totais: "+h1.calcSeg());
        
        
        ContaCorrente cc1 = new ContaCorrente("Jakson",4006.89f,5000.6f);
        cc1.ExibirValores();
        cc1.Depositar(4435);
        cc1.ExibirValores();
        cc1.Depositar(-23);
        cc1.ExibirValores();
        cc1.Saque(456.6f);
        cc1.ExibirValores();
        cc1.Saque(1234567);
        cc1.Saque(9000);
        cc1.ExibirValores();
        
        Aluno vetor[] = new Aluno[3];
        vetor[0] = new Aluno("igao","234",3,9,4,9.4f);
        vetor[1] = new Aluno("jonas","25634",6,6,3.4f,10);
        vetor[2] = new Aluno("bruno","3234",5,7,7,6.4f);
        float media = vetor[0].calcularMedia();
        System.out.println("Media: "+media);
        
        for(int i=0;i<3;i++)
        {
            System.out.println("Media: "+vetor[i].calcularMedia());
        }
        
        Scanner sc = new Scanner(System.in);
        String nome,ra;
        float p1,p2,t1,t2;
        System.out.print("RA: ");
        ra = sc.nextLine();
        System.out.print("Prova 1: ");
        p1 = sc.nextFloat();
    }
}
