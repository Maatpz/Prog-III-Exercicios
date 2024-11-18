package controle;

	import dominio.Paciente;
	import java.io.*;
	import java.util.*;
	import java.util.Scanner;

	public class ControlaPaciente {
	    private ArrayList<Paciente> pacientes;
	    private final String arquivoPacientes = "pacientes.txt";

	    public ControlaPaciente() {
	        this.pacientes = new ArrayList<>();
	        carregarPacientes();
	    }

	    public void adicionarPaciente(int numero, double peso, double altura) {
	        Paciente paciente = new Paciente(numero, peso, altura);
	        pacientes.add(paciente);
	        salvarPacientes();
	        System.out.println("Paciente adicionado com sucesso!");
	    }

	    public void listarPacientes() {
	        if (pacientes.isEmpty()) {
	            System.out.println("Nenhum paciente cadastrado.");
	        } else {
	            System.out.println("Lista de Pacientes:");
	            for (Paciente paciente : pacientes) {
	                paciente.listarPaciente();
	                System.out.println("---------");
	            }
	        }
	    }

	    public void alterarPaciente(int numero) {
	        Paciente paciente = buscarPacientePorNumero(numero);
	        if (paciente != null) {
	            Scanner scanner = new Scanner(System.in);
	            System.out.print("Novo peso do paciente: ");
	            double novoPeso = scanner.nextDouble();
	            System.out.print("Nova altura do paciente: ");
	            double novaAltura = scanner.nextDouble();
	            
	            paciente.setPeso(novoPeso);
	            paciente.setAltura(novaAltura);
	            salvarPacientes();
	            System.out.println("Paciente alterado com sucesso!");
	        } else {
	            System.out.println("Paciente com número " + numero + " não encontrado.");
	        }
	    }

	    public void excluirPaciente(int numero) {
	        Paciente paciente = buscarPacientePorNumero(numero);
	        if (paciente != null) {
	            pacientes.remove(paciente);
	            salvarPacientes();
	            System.out.println("Paciente excluído com sucesso!");
	        } else {
	            System.out.println("Paciente com número " + numero + " não encontrado.");
	        }
	    }

	    private Paciente buscarPacientePorNumero(int numero) {
	        for (Paciente paciente : pacientes) {
	            if (paciente.getNumero() == numero) {
	                return paciente;
	            }
	        }
	        return null;
	    }

	    private void salvarPacientes() {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivoPacientes))) {
	            for (Paciente paciente : pacientes) {
	                writer.write(paciente.getNumero() + ";" + paciente.getPeso() + ";" + paciente.getAltura());
	                writer.newLine();
	            }
	        } catch (IOException e) {
	            System.out.println("Erro ao salvar pacientes: " + e.getMessage());
	        }
	    }

	    private void carregarPacientes() {
	        try (BufferedReader reader = new BufferedReader(new FileReader(arquivoPacientes))) {
	            String linha;
	            while ((linha = reader.readLine()) != null) {
	                String[] dados = linha.split(";");
	                int numero = Integer.parseInt(dados[0]);
	                double peso = Double.parseDouble(dados[1]);
	                double altura = Double.parseDouble(dados[2]);
	                pacientes.add(new Paciente(numero, peso, altura));
	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("Arquivo de pacientes não encontrado. Será criado ao salvar novos pacientes.");
	        } catch (IOException e) {
	            System.out.println("Erro ao carregar pacientes: " + e.getMessage());
	        }
	    }

	    public static void main(String[] args) {
	        ControlaPaciente controle = new ControlaPaciente();
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1. Adicionar Paciente");
	            System.out.println("2. Listar Pacientes");
	            System.out.println("3. Alterar Paciente");
	            System.out.println("4. Excluir Paciente");
	            System.out.println("0. Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Número do Paciente: ");
	                    int numero = scanner.nextInt();
	                    System.out.print("Peso do Paciente: ");
	                    double peso = scanner.nextDouble();
	                    System.out.print("Altura do Paciente: ");
	                    double altura = scanner.nextDouble();
	                    controle.adicionarPaciente(numero, peso, altura);
	                    break;
	                case 2:
	                    controle.listarPacientes();
	                    break;
	                case 3:
	                    System.out.print("Número do Paciente a alterar: ");
	                    int numeroAlterar = scanner.nextInt();
	                    controle.alterarPaciente(numeroAlterar);
	                    break;
	                case 4:
	                    System.out.print("Número do Paciente a excluir: ");
	                    int numeroExcluir = scanner.nextInt();
	                    controle.excluirPaciente(numeroExcluir);
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 0);

	        scanner.close();
	    }
	}