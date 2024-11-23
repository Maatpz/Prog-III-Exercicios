package view;

import controller.FuncionarioController;
import model.*;

import java.util.Scanner;

public class FuncionarioView {

    private FuncionarioController controller;
    private Scanner scanner;

    public FuncionarioView() {
        controller = new FuncionarioController();
        scanner = new Scanner(System.in);
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Funcionário");
            System.out.println("2. Listar Funcionários");
            System.out.println("3. Atualizar Funcionário");
            System.out.println("4. Excluir Funcionário");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    listarFuncionarios();
                    break;
                case 3:
                    atualizarFuncionario();
                    break;
                case 4:
                    excluirFuncionario();
                    break;
                case 5:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 5);
    }

    private void cadastrarFuncionario() {
        System.out.print("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Tipo de Cargo: 1 - Desenvolvedor, 2 - Gerente, 3 - Treinador, 4 - Gerente Desenvolvedor");
        int tipo = scanner.nextInt();

        int id = (int) (Math.random() * 1000);  
        Funcionario funcionario = null;

        switch (tipo) {
            case 1:
                funcionario = new Desenvolvedor(id, nome, salario);
                break;
            case 2:
                funcionario = new Gerente(id, nome, salario);
                break;
            case 3:
                funcionario = new Treinador(id, nome, salario);
                break;
            case 4:
                funcionario = new GerenteDesenvolvedor(id, nome, salario);
                break;
            default:
                System.out.println("Cargo inválido.");
        }

        if (funcionario != null) {
            controller.cadastrarFuncionario(funcionario);
            System.out.println("Funcionário cadastrado.");
        }
    }

    private void listarFuncionarios() {
        controller.listarFuncionarios();
    }

    private void atualizarFuncionario() {
        System.out.print("Digite o ID do funcionário a ser atualizado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Novo nome: ");
        String nome = scanner.nextLine();

        System.out.print("Novo salário: ");
        double salario = scanner.nextDouble();

        controller.atualizarFuncionario(id, nome, salario);
    }

    private void excluirFuncionario() {
        System.out.print("Digite o ID do funcionário a ser excluído: ");
        int id = scanner.nextInt();
        controller.excluirFuncionario(id);
    }
}