package model;

public class GerenteDesenvolvedor extends Funcionario implements Gerencia, Desenvolve {

    public GerenteDesenvolvedor(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void organizarEquipe() {
        System.out.println(nome + " está organizando a equipe.");
    }

    @Override
    public void conduzirReunioes() {
        System.out.println(nome + " está conduzindo reuniões.");
    }

    @Override
    public void codar() {
        System.out.println(nome + " está codificando.");
    }

    @Override
    public void resolverProblemas() {
        System.out.println(nome + " está resolvendo problemas.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Salário: " + salario + ", Cargo: Gerente Desenvolvedor");
    }
}