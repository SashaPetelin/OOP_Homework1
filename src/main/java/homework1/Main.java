package homework1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        WendingMachine store = new WendingMachine();

        store.addProduct(new Product("Lays" , 123.45))
                .addProduct(new Product("fanta" , 98.76))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Product("fan" , 43.21))
                .addProduct(new Beer("alcoholfree" , 67.89))
                .addProduct(new Beer("notbeer" , 67.89, 99))
                .addProduct(new CursedProducts("milk" , 56.65, 7))
                .addProduct(new Chocolate("Schedraya dusha", 48.50, 75 ))
                .addProduct(new Chocolate("Korova-Moloko", 71.44, 24))
                .addProduct(new Apple("Antonovka", 55.00, 5, "green"))
                .addProduct(new Apple("Ranetka", 21.33, 7, "yellow"));

        System.out.println(store);
        System.out.println();
        System.out.println("searching for ay's");
        System.out.println(store.findProduct("ys"));
        System.out.println();
        System.out.println("buying Lay's" );
        store.buy("Lays", 123.45);
        System.out.println(store);

//        System.out.println("buying fan's" );
//        store.buy("fan", 43.21);
//        System.out.println(store);
//        System.out.println("buying a's" );
//        store.buy("fan", 4.1);
//        System.out.println(store);
//        System.out.println("buying a's" );
//        store.buy("milk", 56.65);
//        System.out.println(store);

    }
}

