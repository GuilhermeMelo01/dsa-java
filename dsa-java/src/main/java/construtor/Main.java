package construtor;

public class Main {
    public static void main(String[] args) {
//
        Produto p = new Produto();
        p.nome = "Cout";
        p.preco = 22.0;

        System.out.println("Nome: " + p.nome);
        System.out.println("Preço: " + p.preco);

        ContaBancaria contaBancaria = new ContaBancaria("Conta Corrente", 1200.0);
        System.out.println("Nome: " + contaBancaria.titular);
        System.out.println("Preço: " + contaBancaria.saldo);
    }
}