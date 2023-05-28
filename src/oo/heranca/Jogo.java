package oo.heranca;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro1 = new Monstro();
        monstro1.x = 10;
        monstro1.y = 10;

        Heroi heroi1 = new Heroi(10, 11);
//        heroi1.x = 10;
//        heroi1.y = 11;

        System.out.println("Monstro tem: " + monstro1.vida);
        System.out.println("Herói tem: " + heroi1.vida);
        System.out.println();

        monstro1.atacar(heroi1);
        heroi1.atacar(monstro1);

        monstro1.andar(Direcao.NORTE); //saiu da direcao do ataque
        monstro1.atacar(heroi1);
        heroi1.atacar(monstro1);

        System.out.println("Monstro tem: " + monstro1.vida);
        System.out.println("Herói tem: " + heroi1.vida);


    }
}
