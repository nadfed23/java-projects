package set;

import java.util.ArrayList;

public class Item {
    protected int id;
    protected String name;
    protected double m;
    public boolean isPut;


    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public Item(int id, String name, double m) {
        this.id = id;
        this.name = name;
        this.m = m;
        this.isPut = false;
    }

    public boolean isPut() {
        return isPut;
    }
}
