package oo.heranca.desafio1;

public class Ferrari extends Carro implements Esportivo, Luxo {

    private boolean ligarTurbo;
    private boolean desligarTurbo;
    private boolean ligarAr;
    private boolean desligarAr;

    Ferrari(){
        this(340);
    }

    Ferrari (double velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }
        @Override
    void acelerar(){
       velocidadeAtual += 15;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public double getDelta() {
        if (ligarTurbo && !ligarAr){
            return 35;
        } else if (ligarTurbo && ligarAr) {
            return 30;
        } else if (!ligarTurbo && !ligarAr) {
            return 20;
        } else {
            return 15;
        }
    }
}
