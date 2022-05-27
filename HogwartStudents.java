package com.company;

public class HogwartStudents {

    private String name;
    private int magic;
    private int transgression;

    public HogwartStudents(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int ability(){
        return magic + transgression;
    }

    public void print() {
        System.out.println(this);
    }

    public  void compareHogwarts(HogwartStudents hogwartStudents) {
        int ability1 = ability();
        int ability2 = hogwartStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(), hogwartStudents.getName());
        } else if (ability2>ability1) {
            System.out.printf("Студент %s лучше студента %s%n",hogwartStudents.getName(), getName());
        } else {
            System.out.printf("Студент %s такой же, как и %s%n", getName(), hogwartStudents.getName());
        }
    }



    @Override
    public String toString() {
        return String.format("Студент %S; сила магии: %d; сила трансгерссии: %d", name, magic, transgression);
    }
}
