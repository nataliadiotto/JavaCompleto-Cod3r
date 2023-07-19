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

}
