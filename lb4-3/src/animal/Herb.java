package animal;

import java.io.Serializable;

public class Herb implements Food, Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private double m;
    public Herb(String name, double m){
        if (m <= 0){
            throw new IllegalArgumentException("масса отсутствует");
        }
        this.name = name;
        this.m = m;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public String getInfo() {
        return "name = " + name  + " m = " + m;
    }
}
