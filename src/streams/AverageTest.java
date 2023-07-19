package streams;

public class AverageTest {

    public static void main(String[] args) {
        Average avrg1 = new Average();
        avrg1.sum(8.3);
        avrg1.sum(6.7);

        Average avrg2 = new Average().sum(8.3).sum(6.7);

        System.out.println(avrg1.getValue());
        System.out.println(avrg2.getValue());
    }


}
