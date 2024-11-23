package model;

public class Treinador extends Funcionario implements Treina {

    public Treinador(int id, String nome, double salario) {
        super(id, nome, salario);
    }

    @Override
    public void ensinarTecnologia() {
        System.out.println(nome + " está ensinando nova tecnologia.");
    }

    @Override
    public void motivarEquipe() {
        System.out.println(nome + " está motivando a equipe.");
    }

    @Override
    public void mostrarDetalhes() {
        System.out.println("ID: " + id + ", Nome: " + nome + ", Salário: " + salario + ", Cargo: Treinador");
    }
}