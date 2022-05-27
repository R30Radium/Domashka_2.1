package com.company;

public class GriffendorStudents extends HogwartStudents {

    private int nobility;
    private int bravery;
    private int honor;

    public GriffendorStudents(String name, int magic, int transgression, int bravery, int nobility, int honor) {
        super(name, magic, transgression);
        this.honor = honor;
        this.nobility = nobility;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    @Override
    public int ability() {
        return nobility+honor+bravery;
    }


    public  void compareGriffendor(GriffendorStudents griffendorStudents) {
        int ability1 = ability();
        int ability2 =  griffendorStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(),  griffendorStudents.getName());
        } else if (ability2>ability1) {
            System.out.printf("Студент %s лучше студента %s%n", griffendorStudents.getName(), getName());
        } else {
            System.out.printf("Студент %s такой же, как и %s%n", getName(),  griffendorStudents.getName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d",super.toString(),nobility,honor,bravery);

    }
}
