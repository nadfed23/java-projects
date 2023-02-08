package model;



public abstract class Animal {

    protected int id;
    protected String name;
    protected boolean isAlive;

    public void setM(double m) {
        this.m = m;
    }

    protected double m;

    public abstract void eating(Food f);

    Animal(String name, double m) {
        if (m <= 0) {
            throw new IllegalArgumentException("масса отсутствует");
        }
        this.m = m;
        this.name = name;
        isAlive = true;
        System.out.println("Родился");
    }

    public Animal() {
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void deadth() {
        if (!isAlive)
            throw new IllegalStateException("не живой");
        isAlive = false;
        System.out.println("Мертв");

    }

    public String getInfo() {
        return "id = " + id + " name = " + name + " isAlive = " + isAlive + " m = " + m;
    }

    public double getM() {
        return m;
    }


}
