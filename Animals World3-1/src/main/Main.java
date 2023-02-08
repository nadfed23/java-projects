package main;

import model.Herb;
import model.Herbivore;
import model.Predator;

public class Main {

    public static void main(String[] arg) {
        System.out.println("\n");
        Herb hb = null;
        Herb hbb = null;
        Herbivore h = null;
        Herbivore hr = null;
        Herbivore hv = null;
        Predator p = null;

        try {
            hb = new Herb("Кора", 1);
            h = new Herbivore("Заяц", 20);
            hr = new Herbivore("Заяц 2", 25);
            p = new Predator("Лиса", 60);
            hbb = new Herb("Трава", -3);
            hv = new Herbivore("Заяц 3", 0);
        } catch (IllegalArgumentException ex) {
            System.out.println("Объект нельзя создать, тк " + ex.getMessage());
            System.out.println("произошла критическая ошибка, приложение завершает свою работу ");
            return;

        }

        try {
            p.eating(hr);
        } catch (IllegalArgumentException ex) {
            System.out.println("Объкт не может есть, тк " + ex.getMessage());
        }
        try {
            h.eating(hb);
        } catch (IllegalArgumentException ex) {
            System.out.println("Объкт не может есть, тк " + ex.getMessage());
        }
        try {
            h.eating(hbb);
        } catch (IllegalArgumentException ex) {
            System.out.println("Объкт не может есть, тк " + ex.getMessage());
        }
        try {
            p.eating(hb);
        } catch (IllegalArgumentException ex) {
            System.out.println("Объкт не может есть, тк " + ex.getMessage());
        }

        try {
            hr.deadth();
        } catch (IllegalStateException ex) {
            System.out.println("Объект не может умереть, тк он " + ex.getMessage());
        }
        try {
            p.deadth();
        } catch (IllegalStateException ex) {
            System.out.println("Объект не может умереть, тк он " + ex.getMessage());
        }
        try {
            hv.deadth();
        } catch (IllegalStateException ex) {
            System.out.println("Объект не может умереть, тк он " + ex.getMessage());
        }
        try {
            h.deadth();
        } catch (IllegalStateException ex) {
            System.out.println("Объект не может умереть, тк он " + ex.getMessage());
        }

    }
}
