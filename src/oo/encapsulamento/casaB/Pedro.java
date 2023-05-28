package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

    void testeAcessos(){
//       segredo
//       facoDentroDeCasa
//       formaDeFalar
//       todosSabem

        //Ana mae = new Ana(); -> nao preciso instanciar uma ana, como é por herança, posso acessar direto os atributos herdados

//        System.out.println(mae.segredo);
//        System.out.println(mae.facoDentroDeCasa);
//        System.out.println(mae.formaDeFalar);
//        System.out.println(mae.todosSabem);

//        System.out.println(segredo); //nao recebi por herança -> visibilidade privada
//        System.out.println(facoDentroDeCasa); //nao recebi por herança -> visibibilidade default/pacote
        System.out.println(formaDeFalar); //só recebo esse atributo protect via HERANÇA,nao consigo acessá-lo de outra forma
        System.out.println(todosSabem);


    }
}
