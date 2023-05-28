package oo.heranca;

public class Monstro extends Jogador{

    Monstro(){
        super(0, 0);
    }

    Monstro(int x, int y){
        this();
        this.x = x;
        this.y = y;
    }
}
