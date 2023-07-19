package streams;

public class AverageTest {

    public static void main(String[] args) {
        Average avrg1 = new Average();
        avrg1.sum(8.3);
        avrg1.sum(6.7);

        Average avrg2 = new Average().sum(7.9).sum(6.6);

        System.out.println(avrg1.getValue());
        System.out.println(avrg2.getValue());

        System.out.println(Average.combine(avrg1, avrg2).getValue());
    }


}
