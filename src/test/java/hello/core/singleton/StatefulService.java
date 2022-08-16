package hello.core.singleton;

public class StatefulService {

    // private int price; // State field

    public int order(String name, int price) {
        System.out.printf("name = " + name + " price = " + price);
        System.out.printf("\n");
        return price;
    }
}
