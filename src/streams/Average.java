package streams;

public class Average {

    private double total;
    private int quantity;

    public Average sum(double value){
        total += value;
        quantity++;
        return this;
    }

    public double getValue(){
        return  total/quantity;
    }

    public static Average combine(Average avrg1, Average avrg2){
        Average result = new Average();
        result.total = avrg1.total + avrg2.total;
        result.quantity = avrg1.quantity + avrg2.quantity;
        return result;
    }

}
