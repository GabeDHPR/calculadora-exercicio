public class Divisao implements Interfaces.Operacao {
    @Override
    public double calcular(double a, double b) {
        if( b==0){
            throw new ArithmeticException("Divisão por zero!!");
        }
        return a / b;
    }
}
