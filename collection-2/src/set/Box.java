package set;

import java.util.HashSet;

public class Box extends Item{
    private double maxM = 5;

    HashSet<Item> itemH = new HashSet<Item>();;

    public Box(int id, String name, double m) {
        super(id, name, m);
    }

    public void put(Item item) {

        if (!item.isPut) {
            if (this.id == item.id) {
                double bM = item.m + this.m;
                if (bM < maxM) {
                    itemH.add(item);
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


        for (Item item:itemH){

            if (item.id == id) {
                itemH.remove(item);
                item.isPut = false;
                this.m -= item.m;
                System.out.println(item.name + " извлечен из " + this.name);
                return item;
            }
        }
        return null;
    }


    public HashSet<Item> removeAll() {
        HashSet<Item> set = new HashSet<Item>();
        for (Item item:itemH){
            item.isPut = false;
            this.m -= item.m;
            set.add(item);
            System.out.println(item.name + " был извлечен");
        }

        itemH.clear();
        System.out.println("Все предметы были извлечены");
        return set;
    }
}
