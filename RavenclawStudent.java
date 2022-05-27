package com.company;

public class RavenclawStudent extends HogwartStudents{

    private int cleverness;
    private int wisdom;
    private int wit;
    private int creativity;

    public RavenclawStudent(String name, int magic, int transgression, int creativity, int wit, int wisdom, int cleverness) {
        super(name, magic, transgression);
        this.cleverness = cleverness;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCleverness() {
        return cleverness;
    }

    public void setCleverness(int cleverness) {
        this.cleverness = cleverness;
    }

    @Override
    public int ability() {
        return cleverness + wit + creativity + wisdom;
    }

    public  void compareRavenclaw(GriffendorStudents ravenclawStudents) {
        int ability1 = ability();
        int ability2 =  ravenclawStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(),  ravenclawStudents.getName());
        } else if (ability2>ability1) {
            System.out.printf("Студент %s лучше студента %s%n", ravenclawStudents.getName(), getName());
        } else {
            System.out.printf("Студент %s такой же, как и %s%n", getName(),  ravenclawStudents.getName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s; ум: %d; сооброзительность: %d; творчество: %d; мудрость: %d",super.toString(),cleverness,wit,creativity,wisdom);

    }
}