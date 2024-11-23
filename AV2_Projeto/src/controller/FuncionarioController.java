package controller;

import model.*;
import model.Funcionario;
import java.io.*;
import java.util.*;

public class FuncionarioController {

    private ArrayList<Funcionario> funcionarios;
    private final String arquivo = "funcionarios.txt";

    public FuncionarioController() {
        funcionarios = new ArrayList<>();
        carregarFuncionarios();
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
        salvarFuncionarioNoArquivo(funcionario);
    }

    public void listarFuncionarios() {
        for (Funcionario f : funcionarios) {
            f.mostrarDetalhes();
        }
    }

    public void atualizarFuncionario(int id, String novoNome, double novoSalario) {
        for (Funcionario func : funcionarios) {
            if (func.getId() == id) {
                func.setNome(novoNome);
                func.setSalario(novoSalario); 
                salvarArquivoAtualizado();
                System.out.println("Funcionário atualizado com sucesso.");
                return;
            }
        }
        System.out.println("Funcionário não encontrado.");
    }
    public void excluirFuncionario(int id) {
        funcionarios.removeIf(f -> f.getId() == id);
        salvarArquivoAtualizado();
    }

    private void carregarFuncionarios() {
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split(";");
                int id = Integer.parseInt(dados[0]);
                String tipo = dados[1];
                String nome = dados[2];
                double salario = Double.parseDouble(dados[3]);

                Funcionario funcionario = null;

                switch (tipo) {
                    case "Desenvolvedor":
                        funcionario = new Desenvolvedor(id, nome, salario);
                        break;
                    case "Gerente":
                        funcionario = new Gerente(id, nome, salario);
                        break;
                    case "Treinador":
                        funcionario = new Treinador(id, nome, salario);
                        break;
                    case "GerenteDesenvolvedor":
                        funcionario = new GerenteDesenvolvedor(id, nome, salario);
                        break;
                }

                if (funcionario != null) {
                    funcionarios.add(funcionario);
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao carregar funcionários: " + e.getMessage());
        }
    }

    private void salvarFuncionarioNoArquivo(Funcionario funcionario) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo, true))) {
            bw.write(funcionario.getId() + ";" + funcionario.getClass().getSimpleName() + ";" + funcionario.getNome() + ";" + funcionario.getSalario() + "\n");
        } catch (IOException e) {
            System.err.println("Erro ao salvar funcionário no arquivo: " + e.getMessage());
        }
    }

    private void salvarArquivoAtualizado() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))) {
            for (Funcionario f : funcionarios) {
                bw.write(f.getId() + ";" + f.getClass().getSimpleName() + ";" + f.getNome() + ";" + f.getSalario() + "\n");
            }
        } catch (IOException e) {
            System.err.println("Erro ao atualizar arquivo: " + e.getMessage());
        }
    }
}