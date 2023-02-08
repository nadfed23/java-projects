package model;

public class Predator extends Animal {
    public Predator(String name, double m) {
        super(name, m);
    }

    public Predator() {
        super();
    }

    public void eating(Food f) {
        if (!isAlive)
            throw new IllegalStateException("не живой");
        if (!(f instanceof Herbivore))
            throw new IllegalArgumentException("не своя еда");
        Herbivore herbivore = (Herbivore) f;
        if (herbivore.isAlive)
            throw new IllegalArgumentException("еда мертва");
        herbivore.deadth();
        m += herbivore.getM();
        herbivore.setM(0);
        System.out.println("Поел");
    }

}
