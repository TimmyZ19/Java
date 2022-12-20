import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class HotDrinkVendingMachine implements VendingMachine{
    List<HotDrink> items = new ArrayList<HotDrink>();
    public HotDrinkVendingMachine(List<HotDrink> listIn){
        this.items.addAll(listIn);
    }

    @Override
    public HotDrink GetProduct(String name, int temperature , double volume) {
        for(HotDrink p: this.items) {
            if (Objects.equals(p.name, name)) {
                if (temperature != -1) {
                    if (temperature == p.temperature) {
                        if (volume != -1) {
                            if (volume == p.volume) {
                                return p;
                            }
                            else {
                                return null;
                            }
                        }
                        else {
                            return p;
                        }
                    }
                    else {
                        return null;
                    }
                }
                else {
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public HotDrink GetProduct(String name, int temperature) {
        return GetProduct(name, -1, -1);
    }

    @Override
    public HotDrink GetProduct(String name) {
        return GetProduct(name, -1);
    }

}