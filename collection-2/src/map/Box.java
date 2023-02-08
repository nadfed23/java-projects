package map;

import java.util.HashMap;
import java.util.Map;


public class Box extends Item{

    private double maxM = 5;

    HashMap<Integer, Item> itemHM = new HashMap<Integer, Item>();


    public Box(int id, String name, double m) {
        super(id, name, m);
    }

    public void put(Item item) {

        if (!item.isPut) {
            if (this.id == item.id) {
                double bM = item.m + this.m;
                if (bM < maxM) {
                    itemHM.put(id, item);
                    item.isPut = true;
                    this.m += item.m;
                    System.out.println(item.name + " в " + this.name);
                    return;
                } else
                    System.out.println("Привышение допустимой массы");

                System.out.println("Нельзя положить коробку саму в себя");
                return;
            }
            System.out.println(item.name + " уже в коробке");
            return;
        }
    }

    public Item remove(int id) {


        for (Item item: itemHM.values()){

            if (item.id == id) {
                itemHM.remove(id,item);
                item.isPut = false;
                this.m -= item.m;
                System.out.println(item.name + " извлечен из " + this.name);
                return item;
            }
        }
        return null;
    }


    public HashMap<Integer,Item> removeAll() {
        HashMap<Integer,Item> map = new HashMap<Integer,Item>();
        for (Item item:itemHM.values()){
            item.isPut = false;
            this.m -= item.m;
            map.put(id,item);
            System.out.println(item.name + " был извлечен");
        }

        itemHM.clear();
        System.out.println("Все предметы были извлечены");
        return map;
    }
}
