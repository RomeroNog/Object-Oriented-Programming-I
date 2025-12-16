/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herança;

import java.util.Scanner;

/**
 *
 * @author igor.nogueira_unesp
 */
public class SistUniversidade {
        int tamanho = 90;
        int tamanhofunc = 400;
        int cont =0;
        int contadep = 0;
        int contador = 0;
        Universidade vetor[] = new Universidade[tamanho/3];
        Departamento dep[] = new Departamento[tamanho/3];
        Funcionario func[] = new Funcionario[tamanhofunc];
        
        
        void menu()
        {
            System.out.println("MENU ");
            System.out.println("1-Cadastrar Departamento");
            System.out.println("2-Cadastrar Funcionário Técnico");
            System.out.println("3-Cadastrar Funcionário Docente");
            System.out.println("4-Buscar Departamento por Nome");
            System.out.println("5-Buscar Funcionário por Nome");
            System.out.println("6-Listar Departamentos com Funcionários com Faixa Salarial Específica");
            System.out.println("7-Listar Funcionários com Faixa Salarial Específica");
            System.out.println("8-Listar Departamentos cujo gasto total está entre uma Faixa de Valores Específica");
            System.out.println("9-Listar todos Funcionários da Universidade");
            System.out.println("10-Listar todos Departamentos da Universidade");
            System.out.println("11-Listar todos Departamentos da Universidade e seus Respectivos Funcionários");
            System.out.println("12-Listar todos Funcionários Docente");
            System.out.println("13-Listar todos Funcionários Técnico");
            System.out.println("0-Sair");
            Scanner sc = new Scanner(System.in);
            int op = sc.nextInt();
            exec(op);
        }
        
        void exec(int op)
        {
            switch(op)
            {
                case 1: 
                    if(contadep < tamanho)
                    {
                        Scanner sc = new Scanner(System.in);
                        dep[contadep] = new Departamento();

                        System.out.println("Codigo: ");
                        dep[contadep].codigo = sc.nextLine();

                        System.out.println("Nome: ");
                        dep[contadep].nome = sc.nextLine();
                    }
                    contadep++;
                    menu();
                    break;
                    
                case 2: 
                    addFuncTec();
                    menu();
                    break;
                    
                case 3:
                    addFuncDoc();
                    menu();
                    break;
                    
                case 4:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Digite o departamento para busca: ");
                    String buscadep = sc.nextLine();
                    
                    int posi = BuscarDepartamento(buscadep);
                    
                    if(posi!=-1)
                    {
                        dep[posi].exibir();
                    }
                    menu();
                    break;
                    
                case 5:
                    Scanner sca = new Scanner(System.in);
                    System.out.println("Digite o nome para busca:");
                    String buscanome = sca.nextLine();
                    
                    int posiNome = BuscaNome(buscanome);
                    if(posiNome!=-1)
                    {
                        System.out.println("Dados do Funcionario: ");
                        func[posiNome].exibir();
                    }
                    menu();
                    break;
                    
                case 6:
                    float FSMinDepartTofunc = 204f;
                    float FSMaxDepartTofunc = 3204f;
                    System.out.println("Departamentos com funcionarios com Faixa Salarial Específica");
                    int k=0;
                    int departVal[] = new int[tamanho/3];
                    
                    for(int j=0;j<contadep;j++)
                    {
                        int encontrou=0;
                        for(int i=0;i<contador;i++)
                        {
                            if(func[i].codigo.equals(dep[j].codigo))
                            {
                                if(func[i].salario>FSMinDepartTofunc && func[i].salario<FSMaxDepartTofunc)
                                {
                                  encontrou++;  
                                }
                            }
                        }
                        if(encontrou>0)
                        {
                            departVal[k]=j;
                            k++;
                        }
                    }
                    for(int l=0;l<k;l++)
                    {
                        int aux = departVal[l];
                        System.out.println(dep[aux].nome);
                    }
                    
                    menu();
                    break;
                    
                case 7:
                    float FSMinFunc = 204f;
                    float FSMaxFunc = 3204f;
                    System.out.println("Funcionarios na faixa salarial "+FSMinFunc + "a "+ FSMaxFunc);
                    for(int i=0;i<contador;i++)
                    {
                        if(func[i].salario>FSMinFunc && func[i].salario<FSMaxFunc)
                        {
                            System.out.println(func[i].nome);
                        }
                    }
                    menu();
                    break;
            
                case 8:
                    float faixaSalarioMin = 2204f;
                    float faixaSalrioMax = 10204f;
                    System.out.println("Departamentos na faixa salrial "+faixaSalarioMin+ "a "+ faixaSalrioMax);
                    for(int i=0;i<contadep;i++)
                    {
                        if(dep[i].salarioTotalDep()>faixaSalarioMin && dep[i].salarioTotalDep()<faixaSalrioMax)
                        {
                            System.out.println(dep[i].nome);
                        }
                    }
                    menu();
                    break;
                
                case 9:
                    for(int i=0;i<contador;i++)
                    {
                        func[i].exibir();
                    }
                    menu();
                    break;
                    
                case 10:
                    for(int i=0;i<contadep;i++)
                    {
                        System.out.println(dep[i].nome);
                    }
                    menu();
                    break;
                    
                case 11:
                    for(int i=0;i<contadep;i++)
                    {
                        dep[i].exibir();
                    }
                    menu();
                    break;
                    
                case 12:
                    for(int i=0;i<contador;i++)
                    {
                        if(func[i].getClass().equals(Docente.class))
                        {
                            func[i].exibir();
                        }
                    }
                    menu();
                    break;
                    
                case 13:
                    for(int i=0;i<contador;i++)
                    {
                        if(func[i].getClass().equals(Tecnico.class))
                        {
                            func[i].exibir();
                        }
                    }
                    menu();
                    break;
                    
                case 0:
                    break;
            }       
            
            
            
            
            
                
                
        }

        
                
        public void addFuncTec()
        {
            Scanner sc = new Scanner(System.in);
            Tecnico t = new Tecnico();

            System.out.println("Codigo: ");
            t.codigo = sc.nextLine();

            System.out.println("Nome: ");
            t.nome = sc.nextLine();
                        
            System.out.println("Salario: ");
            t.salario = sc.nextFloat();
                        
            System.out.println("Nivel: ");
            t.nivel = sc.nextLine();
            
            String codiguin = t.codigo;
            
            int pos = acharDepCorresp(codiguin);
            
            if(pos!=-1)
            {
                dep[pos].linkFunctoDep(t);
            }
            
            if(contador<tamanhofunc)
            {
                func[contador] = t;
            }
            contador++;
        }
        
        public void addFuncDoc()
        {
            Scanner sc = new Scanner(System.in);
            Docente d = new Docente();

            System.out.println("Codigo: ");
            d.codigo = sc.nextLine();

            System.out.println("Nome: ");
            d.nome = sc.nextLine();
                        
            System.out.println("Salario: ");
            d.salario = sc.nextFloat();
                        
            System.out.println("Nivel: ");
            d.titulacao = sc.nextLine();
            
            String codiguin = d.codigo;
            
            int pos = acharDepCorresp(codiguin);
            
            if(pos!=-1)
            {
                dep[pos].linkFunctoDep(d);
            }
            
            if(contador<tamanhofunc)
            {
                func[contador++] = d;
            }
            
        }        
        
        public int acharDepCorresp(String codiguin)
        {
            int posiDep = -1;
            for(int i=0;i<contadep;i++)
            {
                if(dep[i].codigo.equals(codiguin))
                {
                   posiDep = i;
                }
            }
            return posiDep;
        }
        
        public int BuscarDepartamento(String buscadep)
        {
            int posicaoDeparta = -1;
            for(int i=0;i<contadep;i++)
            {
                if(dep[i].nome.equals(buscadep))
                {
                    posicaoDeparta = 1;
                }
            }
            return posicaoDeparta;
        }
        
        public int BuscaNome(String buscanome)
        {
            int posicaonome = -1;
            for(int i=0;i<contador;i++)
            {
                if(func[i].nome.equals(buscanome))
                {
                    posicaonome = 1;
                }
            }
            return posicaonome;
        }

        
        
        
}       
