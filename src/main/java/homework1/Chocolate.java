package homework1;

public class Chocolate extends Product {

    private Integer darkPercent = 0;

    public Chocolate(String name, Double price) {
        super(name, price);
    }

    public Chocolate(String name, Double price, Integer darkPercent) {
        super(name, price);
        this.darkPercent = darkPercent;
    }

    @Override
    public String toString() {
        return String.format("%s darkPercent = %d  ", super.toString(), darkPercent);
    }
}