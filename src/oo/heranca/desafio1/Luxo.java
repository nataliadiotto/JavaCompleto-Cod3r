package oo.heranca.desafio1;

public interface Luxo {

    public void ligarAr();
    abstract void desligarAr();

    //método opcional usando o "default"
    default int velocidadeDoAr(){
        return 1;
    }
}
