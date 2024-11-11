package controle;


import dominio.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controla_paciente {
	
	private List<Paciente> pacientes;

    public Controla_paciente() {
        pacientes = new ArrayList<>();
    }

    // Método para adicionar paciente
    public void adicionarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        System.out.println("Paciente adicionado com sucesso.");
    }

    // Método para alterar paciente pelo ID
    public void alterarPaciente(int id, String nome, double peso, double altura, int sexo) {
        for (Paciente paciente : pacientes) {
            if (paciente.getId() == id) {
                paciente.setNome(nome);
                paciente.setPeso(peso);
                paciente.setAltura(altura);
                paciente.setSexo(sexo);
                System.out.println("Paciente alterado com sucesso.");
                return;
            }
        }
        System.out.println("Paciente não encontrado.");
    }

    // Método para excluir paciente pelo ID
    public void excluirPaciente(int id) {
        pacientes.removeIf(paciente -> paciente.getId() == id);
        System.out.println("Paciente excluído com sucesso.");
    }

    // Método para listar todos os pacientes
    public void listarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
        } else {
            for (Paciente paciente : pacientes) {
                System.out.println(paciente);
            }
        }
    }
    
    public class Main {
        public static void main(String[] args) {
            Controla_paciente controller = new Controla_paciente();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nEscolha uma opção:");
                System.out.println("1 - Adicionar paciente");
                System.out.println("2 - Alterar paciente");
                System.out.println("3 - Excluir paciente");
                System.out.println("4 - Listar pacientes");
                System.out.println("5 - Sair");
                int opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.print("ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Peso: ");
                        double peso = scanner.nextDouble();
                        System.out.print("Altura: ");
                        double altura = scanner.nextDouble();
                        System.out.print("Sexo (1 para Masculino, 2 para Feminino): ");
                        int sexo = scanner.nextInt();

                        Paciente paciente = new Paciente(id, nome, peso, altura, sexo);
                        controller.adicionarPaciente(paciente);
                    }
                    case 2 -> {
                        System.out.print("ID do paciente a ser alterado: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Novo nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Novo peso: ");
                        double peso = scanner.nextDouble();
                        System.out.print("Nova altura: ");
                        double altura = scanner.nextDouble();
                        System.out.print("Novo sexo (1 para Masculino, 2 para Feminino): ");
                        int sexo = scanner.nextInt();

                        controller.alterarPaciente(id, nome, peso, altura, sexo);
                    }
                    case 3 -> {
                        System.out.print("ID do paciente a ser excluído: ");
                        int id = scanner.nextInt();
                        controller.excluirPaciente(id);
                    }
                    case 4 -> controller.listarPacientes();
                    case 5 -> {
                        System.out.println("Saindo");
                        scanner.close();
                        return;
                    }
                    default -> System.out.println("Opção inválida.");
                }
            }
        }
    }
    
}


