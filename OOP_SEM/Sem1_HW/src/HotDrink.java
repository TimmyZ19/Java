public class HotDrink extends Product{
    public int temperature;
    public double volume;

    public HotDrink(String name, Double price, int temperature, double volume){
        super.name = name;
        super.price = price;
        this.temperature = temperature;
        this.volume = volume;
    }
    @Override
    public String toString() {
        return "Наименование:" + this.name +
                ", Цена: " + price.toString() +
                ", Температура напитка: " + ((Integer)temperature).toString() +
                ", Объем напитка: " + ((Double)volume).toString();
    }
}