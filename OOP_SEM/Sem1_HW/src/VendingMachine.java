
public interface VendingMachine {
    abstract public HotDrink GetProduct(String name, int temperature , double volume);

    HotDrink GetProduct(String name, int temperature);

    HotDrink GetProduct(String name);
}