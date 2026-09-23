package Atividade3;

public class MainCasa2 {

    public static void main(String[] args) {

        Casa2 c1 = new Casa2();

        Casa2 c2 = new Casa2("Rua cariris, 1298", 290887.00, 450, "Casa Alto Padrao");

        System.out.println("Endereço: " + c2.endereco + "\nPreço: " + c2.preco + "\nArea: " + c2.area + "\nTipo: " + c2.tipo);
    }
}
