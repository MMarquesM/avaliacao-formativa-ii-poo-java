public class Questao05 {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno(
                "Mona Mirella",
                "00000001",
                "Medicina"
        );

        Aluno aluno2 = new Aluno(
                "Matheus Marques",
                "00000857487",
                "Ciências da Computação"
        );

        System.out.println("--- Aluno 1 ---");
        aluno1.exibirDados();

        System.out.println();

        System.out.println("--- Aluno 2 ---");
        aluno2.exibirDados();
    }
}