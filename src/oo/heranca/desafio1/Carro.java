package oo.heranca.desafio1;
//pckg desafio
//        classes: Carro (generica), 2 modelos de carros → Ferrari extends Carro, classe Teste (main) → instanciar os carros e utiilizar os metodos
//        dentro da classe generica: atributo velocidade atual, método acelerar sem parametro(aumentar a velocidade), método frear sem paramentro(diminuir a velocidade), a velocidade nunca pode ser > 0, se tentar frear o carro parado, nao deve fazer nada.
//        Ferrari → acelerar de 15 em 15km, sobreescrever ou chamar o metodo da classe pai, fazendo a modificação
public class Carro {

    final double VELOCIDADE_MAXIMA;
    double velocidadeAtual;
    private int delta = 5;

    Carro(double velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    void acelerar(){
        if (velocidadeAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidadeAtual = VELOCIDADE_MAXIMA;
        }
        else {
            velocidadeAtual += getDelta();
        }

    }

    void frear(){
        if (velocidadeAtual >= 5){
            velocidadeAtual -= 5;
        } else {
            velocidadeAtual = 0;
        }
    }

    public double getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
