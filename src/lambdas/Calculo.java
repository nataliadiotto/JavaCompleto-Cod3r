package lambdas;

@FunctionalInterface //força a ter um único método, é uma validação
public interface Calculo {
    public abstract double executar(double a, double b);
}
