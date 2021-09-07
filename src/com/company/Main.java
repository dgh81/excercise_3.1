package com.company;

public class Main {

    public static void main(String[] args) {
        int age = 40;
        float age_float = (float) age;
        // %f er float og matcher ikke int - fejlen er rettet med convertion fra int til float ovenfor
        System.out.printf("age = %f", age_float);
        System.out.println();
        double height = 175.5;
        System.out.printf("height = %d",height);
        // %d er for decimal ikke double - derfor fejlen
    }
}
