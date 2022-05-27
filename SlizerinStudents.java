package com.company;

public class SlizerinStudents extends HogwartStudents {

    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstPower;

    public SlizerinStudents(String name, int magic, int transgression, int determination, int ambition, int ingenuity, int cunning,int thirstPower) {
        super(name, magic, transgression);
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.cunning = cunning;
        this.thirstPower = thirstPower;
    }

    public int getCunning() {
        return cunning;
    }

    public int getThirstPower() {
        return thirstPower;
    }

    public void setThirstPower(int thirstPower) {
        this.thirstPower = thirstPower;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    @Override
    public int ability() {
        return cunning +determination+ambition+ingenuity+thirstPower;
    }

    public  void compareSlizerin(SlizerinStudents SlizerinStudents) {
        int ability1 = ability();
        int ability2 = SlizerinStudents.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(), SlizerinStudents.getName());
        } else if (ability2>ability1) {
            System.out.printf("Студент %s лучше студента %s%n",SlizerinStudents.getName(), getName());
        } else {
            System.out.printf("Студент %s такой же, как и %s%n", getName(), SlizerinStudents.getName());
        }
    }


    @Override
    public String toString() {
        return String.format("%s; хитрость: %d; решительность: %d; сооброзительность: %d; находчивость: %d; Жажда власти;"
                ,super.toString(), cunning, determination, ambition, ingenuity, thirstPower);

    }
}


