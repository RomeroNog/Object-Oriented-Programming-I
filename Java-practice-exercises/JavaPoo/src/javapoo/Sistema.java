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
public class Sistema {
    
    public Aluno vetor[];
    public int tam=20;
    public int cont=0;
    
    public int menu()
    {
        Scanner sc = new Scanner(System.in);
        int op;
        System.out.println("1-");
        System.out.println("2-");
        System.out.println("3-");
        System.out.println("4-");
        System.out.println("5-");
        System.out.println("6-");
        System.out.println("9-");
        op = Integer.parseInt(sc.nextLine());
        return op;
    }
    public void exec()
    {
        System.out.println("Sistema de gerenciamento: ");
        int op = menu();
    }
}
