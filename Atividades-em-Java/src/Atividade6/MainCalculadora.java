package Atividade6;

public class MainCalculadora {
    public static void main(String[] args) {

        System.out.println("Bem vindo a calculadora!");

        CalculadoraFinanceira calculadora = new CalculadoraFinanceira();

        System.out.println("\nValor da compra é: ");
        double resultado = calculadora.calcularDesconto(1000, 15);
        System.out.printf("R$ %.2f%n", resultado);

        System.out.println("\nValor da segunda Compra parcelada é: ");
        calculadora.calcularDesconto(500, 15, 10);
    }
}
