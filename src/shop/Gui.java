package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Gui {
    private List<Product> procucts = new ArrayList<Product>();

    private Scanner scanner = new Scanner(System.in);

    public void addProduct(Product product) {
        this.procucts.add(product);
    }

    public void run() {
        while (true) {
            System.out.println("1 Show all the Products");
            System.out.println("2 Show color of the products ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    showProducts();
                    break;

                    case 2: 
                    showValue();

                default:
                    break;
            }

        }
    }

    private void showProducts() {
        System.out.println("Show all the Products");
        for (Product product : procucts) {
            System.out.println("Name: " + product.getName());
        }

    }

    private void showValue() {
        System.out.println("Show color of the products ");
        for (Product product : procucts) {
            System.out.println("Color: " + product.getColor());
        }
    }
}