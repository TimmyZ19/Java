
public abstract class Product {
    protected Double price;
    protected String name;

    public String getName() {
        return this.name;
    }
    @Override
    public String toString() {
        return this.name + " - " + price.toString() ;
    }

}