package com.company;

import java.awt.*;
import java.util.Random;

public class Main {

    private static final Random random = new Random();

    public static void main(String[] args) {
	GriffendorStudents Harry = new GriffendorStudents("Гарри Поттер", generate() ,generate() ,generate(),generate(),generate());
    RavenclawStudent Luna = new RavenclawStudent("Луна", generate(),generate(),generate(),generate(),generate(),generate());
    GriffendorStudents Ron = new GriffendorStudents( "Рон", generate(),generate(),generate(),generate(),generate());
    SlizerinStudents Draco = new SlizerinStudents("Драко", generate(),generate(),generate(),generate(),generate(),generate(),generate());
    HogwartStudents Sedric = new HuffepuffStudents("Седрик",generate(),generate(),generate(),generate(),generate());

        System.out.println(Harry);
        System.out.println(Luna);
        System.out.println(Ron);
        System.out.println(Draco);
        System.out.println(Sedric);

        Harry.compareHogwarts(Draco);
        Luna.compareRavenclaw(Ron);
    }

    private static int generate(){
        return random.nextInt(100);
    }





}
