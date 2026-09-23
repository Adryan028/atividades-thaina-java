package Atividade5;

public class MainATV5 {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario();

        f1.setNome("Adryan Alessandro");
        f1.setIdade(18);
        f1.setEmail("xiadryan231@gmail.com");
        f1.setSalario(8000);
        f1.setCargo("Suporte");
        f1.setDepartamento("TI");

        if (f1.getIdade() <= 16) {
            f1.setAprendiz(true);
        } else {
            f1.setAprendiz(false);
        }

        System.out.println("Informações do Funcionário:\n");
        System.out.printf("Nome: %s\n", f1.getNome());
        System.out.printf("Idade: %d\n", f1.getIdade());
        System.out.printf("Email: %s\n", f1.getEmail());
        System.out.printf("Salario: R$ %.2f\n", f1.getSalario());
        System.out.printf("Cargo: %s\n", f1.getCargo());
        System.out.printf("Departamento: %s\n", f1.getDepartamento());
        System.out.printf("Aprendiz: %b\n", f1.isAprendiz());

    }
}
