package exception;

public class CheckedVsUnchecked {

    public static void main(String[] args) {
       try {
           generatesError1();
       } catch (RuntimeException e) {
           System.out.println(e.getMessage());;
       }

        generatesError2();

        System.out.println("The end.");
    }

    //Unchecked: escolher tratar ou não o erro
    static void generatesError1() {
        throw new RuntimeException("An error has occurred #01");
    }

    //Checked exception: deixar claro na assinatura do método
    /*static void generatesError2() throws Exception {
        throw new Exception("An error has occurred #02");
    }*/

    static void generatesError2() {
        try {
            throw new Exception("An errror has occurred #02");
        } catch (Exception e) {
            System.out.println("How cool!");
        }
    }
}
