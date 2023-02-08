package list;

import java.util.ArrayList;


public class Box extends Item {
    private double maxM = 5;

    ArrayList <Item> itemS = new ArrayList <Item>();

    public Box(int id, String name, double m) {
        super(id, name, m);
    }

    public void put(Item item) {

        if (!item.isPut) {
            if (this.id == item.id) {
                double bM = item.m + this.m;
                if (bM < maxM) {
                    itemS.add(item);
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


        for (Item item:itemS){

            if (item.id == id) {
                itemS.remove(item);
                item.isPut = false;
                this.m -= item.m;
                System.out.println(item.name + " извлечен из " + this.name);
                return item;
            }
        }
        return null;
    }


    public ArrayList<Item> removeAll() {
        ArrayList<Item> list = new ArrayList<Item>();
        for (Item item:itemS){
            item.isPut = false;
            this.m -= item.m;
            list.add(item);
            System.out.println(item.name + " был извлечен");
        }

        itemS.clear();
        System.out.println("Все предметы были извлечены");
        return list;
    }
}
