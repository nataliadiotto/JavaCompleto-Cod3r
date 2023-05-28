package oo.heranca.desafio1;

public class Ferrari extends Carro {

    Ferrari(){
        this(200);
    }

    Ferrari (double velocidadeMaxima){
        super(velocidadeMaxima);
    }
    @Override
    void acelerar(){
       velocidadeAtual += 15;
    }
}
