package com.company;

public class HuffepuffStudents extends HogwartStudents {

    private int industriousness;
    private int loyalty;
    private int honesty;

    public HuffepuffStudents(String name, int magic, int transgression, int industriousness, int honesty, int loyalty) {
        super(name, magic, transgression);
        this.industriousness= industriousness;
        this.honesty= honesty;
        this.loyalty= loyalty;

    }
    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    @Override
    public int ability() {
        return industriousness + honesty + loyalty;
    }

    public  void compareHuffepuff(HuffepuffStudents huffepuffStudents) {
        int ability1 = ability();
        int ability2 = huffepuffStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(), huffepuffStudents.getName());
        } else if (ability2>ability1) {
            System.out.printf("Студент %s лучше студента %s%n",huffepuffStudents.getName(), getName());
        } else {
            System.out.printf("Студент %s такой же, как и %s%n", getName(), huffepuffStudents.getName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s; трудолюбие: %d; верность: %d; честность: %d",super.toString(),industriousness,honesty,loyalty);

    }
}
