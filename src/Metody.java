public class Metody {

    public static double sum (Product[] products){

        double sum = 0;
        for (int i = 0; i < products.length; i++) {

            sum = sum + products[i].getPrice();

        }

        return sum;

    }

public static void max(Product [] products){

        int wynik = 0;
    for (int i = 1; i < products.length; i++) {

        if (products[i].getPrice() > products[wynik].getPrice()){
            wynik = i;

        }
    }

    System.out.println(products[wynik].getPrice());


}
}
