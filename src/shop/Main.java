package shop;

public class Main {
    public static void main(String[] args) {
        Phones p1 = new Phones("Blue", "IPhone 16");
        Tablets t1 = new Tablets("Light green",  "Macbook 12" );

        Gui gui = new Gui();
        gui.addProduct(p1);
        gui.addProduct(t1);

        gui.run();
    }

}