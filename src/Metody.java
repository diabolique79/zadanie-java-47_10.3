import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Metody {

    public static double sum(Product[] products) {

        double sum = 0;
        for (int i = 0; i < products.length; i++) {

            sum = sum + products[i].getPrice();

        }

        return sum;

    }

    public static double max(Product[] products) {

        int wynik = 0;
        for (int i = 1; i < products.length; i++) {

            if (products[i].getPrice() > products[wynik].getPrice()) {
                wynik = i;

            }
        }

        return products[wynik].getPrice();
    }


}


