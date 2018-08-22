import java.io.*;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        File file = new File("produkty.csv");
        Scanner odczyt = new Scanner(file);
        //System.out.println(file);
Product [] products = new Product[9];
int z= 0;


        while (odczyt.hasNextLine()){
            String name = odczyt.nextLine();
            String tab[] = name.split(",");
            //tab[2] = tab[2].replace(",", ".");
            String productName = tab[0];
            String producer = tab[1];
            double price = Double.parseDouble(tab[2]);
            products[z] = new Product(productName, producer, price);
            z++;
            System.out.println("Nazwa produktu: " + productName + ", Producent: " + producer + ", cena: "+ price);

        }

        Metody.sum(products);
        System.out.println(Metody.sum(products));
        System.out.println(Metody.max(products));



    }
}
