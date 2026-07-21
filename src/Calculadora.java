public class Calculadora {

    private Interfaces.Operacao operacao;

    public void setOperacao(Interfaces.Operacao operacao) {
        this.operacao = operacao;
    }

    public double fazerCalculo(double a, double b) {
        return operacao.calcular(a, b);
    }
}
