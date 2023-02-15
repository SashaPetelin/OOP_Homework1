package homework1;

public class Apple extends Product {

    private Integer quantityInBundle = 0;
    private String colour;
    public Apple(String name, Double price) {
        super(name, price);
    }

    public Apple(String name, Double price, Integer quantityInBundle, String colour) {
        super(name, price);
        this.quantityInBundle = quantityInBundle;
        this.colour = colour;
    }

    //    public Apple(String name, Double price, Integer quantityInBundle) {
//        super(name, price);
//        this.quantityInBundle = quantityInBundle;
//    }

    @Override
    public String toString(){
        return String.format("%s quantityInBundle = %d ; colour = %s ; " ,super.toString(), quantityInBundle, colour);
    }
}
