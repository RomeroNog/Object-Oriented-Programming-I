/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabalho;

/**
 *
 * @author manoe
 */
public class Principal {
    public static void main(String[] args)
    {
        // Criando a universidade
        Universidade uni = new Universidade("Universidade Avançada");

        // Criando departamentos
        Departamento dep1 = new Departamento("D01", "Departamento de Engenharia");
        Departamento dep2 = new Departamento("D02", "Departamento de Ciências");

        // Criando funcionários
        Tecnico tecnico1 = new Tecnico("T01", "Carlos Silva", "T1", "Manutenção");
        Tecnico tecnico2 = new Tecnico("T02", "Mariana Costa", "T2", "Suporte");
        
        Efetivo efetivo1 = new Efetivo("E01", "Ana Souza", "D2", "Mestre", "Eletrônica");
        Efetivo efetivo2 = new Efetivo("E02", "Paulo Lima", "D3", "Doutor", "Computação");
        
        Substituto substituto1 = new Substituto("S01", "João Lima", "S1", "Doutor", 20);
        Substituto substituto2 = new Substituto("S02", "Carla Freitas", "S2", "Mestre", 40);

        // Adicionando funcionários ao departamento 1
        dep1.addFuncionario(tecnico1);
        dep1.addFuncionario(efetivo1);
        dep1.addFuncionario(substituto1);

        // Adicionando funcionários ao departamento 2
        dep2.addFuncionario(tecnico2);
        dep2.addFuncionario(efetivo2);
        dep2.addFuncionario(substituto2);

        // Adicionando departamentos na universidade
        uni.addDep(dep1);
        uni.addDep(dep2);

        // Relatório geral da universidade
        System.out.println("\n=== Relatório Geral da Universidade ===");
        uni.relatorioGeral();

        // Buscar e exibir funcionário por código no dep1
        System.out.println("\n=== Buscar funcionário pelo código T01 no dep1 ===");
        dep1.exibirFuncEspecifCod("T01");

        // Buscar e exibir funcionário por nome no dep2
        System.out.println("\n=== Buscar funcionário pelo nome 'Paulo Lima' no dep2 ===");
        dep2.exibirFuncEspecifNome("Paulo Lima");

        // Exibir docentes efetivos do departamento 1
        System.out.println("\n=== Docentes Efetivos do Departamento 1 ===");
        dep1.exibirDocentesEfetivos();

        // Exibir docentes substitutos do departamento 2
        System.out.println("\n=== Docentes Substitutos do Departamento 2 ===");
        dep2.exibirDocentesSubstitutos();

        // Exibir técnicos do departamento 1
        System.out.println("\n=== Técnicos do Departamento 1 ===");
        dep1.exibirTecnicos();

        // Exibir todos os funcionários do departamento 2
        System.out.println("\n=== Todos os funcionários do Departamento 2 ===");
        dep2.exibirFuncionarios();

        // Mostrar funcionários com salário dentro da faixa especificada (dep1)
        System.out.println("\n=== Funcionários com salário na faixa especificada no Departamento 1 ===");
        dep1.FuncSalEspecifc();

        // Mostrar departamentos com gasto dentro da faixa especificada na universidade
        System.out.println("\n=== Departamentos com gasto dentro da faixa especificada ===");
        uni.DepsComGastoEspecif();

        // Exibir resumo de departamentos específicos pelo código
        System.out.println("\n=== Exibir resumo do departamento com código D01 ===");
        uni.exibirDepEspecif("D01");

        System.out.println("\n=== Exibir resumo do departamento com código D02 ===");
        uni.exibirDepEspecif("D02");        
    }
}
