package Atividade1;

public class MainCasa {
    public static void main(String[] args) {
        Casa c1 = new Casa();
        Casa c2 = new Casa();

        c1.preco = 850000;
        c1.area = 132.0;

        c2.preco = 580000;
        c2.area = 79.0;

        double valorMetroQuadrado = c1.preco / c1.area;
        double valorMetroQuadrado2 = c2.preco / c2.area;

        System.out.printf("O valor por m2 da casa é: %.2f ", valorMetroQuadrado);
        System.out.printf("\nO valor por m2 da casa 2 é: %.2f ", valorMetroQuadrado2);
    }
}
