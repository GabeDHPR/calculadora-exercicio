import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        double n1, n2;
        Calculadora calculadora = new Calculadora();
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.print("======Menu======\n");
            System.out.print("1 - Soma\n");
            System.out.print("2 - subtração\n");
            System.out.print("3 - Multiplicação\n");
            System.out.print("4 - Divisão\n");
            System.out.print("5 - Potenciação\n");
            System.out.print("6 - Sair\n");
            System.out.print("======Menu======\n");
            System.out.print("Digite qual tipo de expressão desejada: \n");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    calculadora.setOperacao(new Soma());
                    System.out.print("Digite o primeiro valor: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    n2 = sc.nextDouble();
                    double resultadoSoma = calculadora.fazerCalculo(n1, n2);
                    System.out.println("resultado = " + resultadoSoma);
                    break;

                case 2:
                    calculadora.setOperacao(new Subtracao());
                    System.out.print("Digite o primeiro valor: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    n2 = sc.nextDouble();
                    double resultadoSubtracao = calculadora.fazerCalculo(n1, n2);
                    System.out.println("resultado = " + resultadoSubtracao);
                    break;

                case 3:
                    calculadora.setOperacao(new Multiplicacao());
                    System.out.print("Digite o primeiro valor: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    n2 = sc.nextDouble();
                    double resultadoMultiplicacao = calculadora.fazerCalculo(n1, n2);
                    System.out.println("resultado = " + resultadoMultiplicacao);
                    break;
                case 4:
                    calculadora.setOperacao(new Divisao());
                    System.out.print("Digite o primeiro valor: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o segundo valor: ");
                    n2 = sc.nextDouble();
                    double resultadoDivisao = calculadora.fazerCalculo(n1, n2);
                    System.out.println("resultado = " + resultadoDivisao);
                    break;
                case 5:
                    calculadora.setOperacao((new Potenciacao()));
                    System.out.print("Digite o número: ");
                    n1 = sc.nextDouble();
                    System.out.print("Digite o expoente: ");
                    n2 = sc.nextDouble();
                    double resultadoPotencia = calculadora.fazerCalculo(n1, n2);
                    System.out.println("resultado = " + resultadoPotencia);
                    break;

            }
        } while (opc != 6);
    }
}
