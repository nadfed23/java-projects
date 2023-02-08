package model;

public class Herbivore extends Animal implements Food {

    public Herbivore(String name, double m) {
        super(name, m);
    }

    public Herbivore() {
        super();
    }

    public void eating(Food f) {
        if (!isAlive)
            throw new IllegalStateException("не живой");
        if (!(f instanceof Herb))
            throw new IllegalArgumentException("не своя еда");
        Herb herb = (Herb) f;
        if (!(herb.getM() > 0))
            throw new IllegalArgumentException("нет еды");
        m += (herb.getM());
        herb.setM(0);
        System.out.println("Поел");
    }


}
