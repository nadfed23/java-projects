package list;


public class Main {
    public static void main(String [] arg){


        Item it1 = new Item(1, "Предмет 1", 1);
        Item it2 = new Item(2, "Предмет 2", 1.5);
        Item it3 = new Item(3, "Предмет 3", 0.5);

        Box box1 = new Box(4, "Коробка 1", 3);
        Box box2 = new Box(5, "Коробка 2", 2.5);

        box1.put(it1); box1.put(it2);
        box2.put(box1); box2.put(it3);

        Item it = box2.remove(2);
        it = box1.remove(1);


        System.out.println(box2.removeAll());
        System.out.println(box2.getM());


    }
}
