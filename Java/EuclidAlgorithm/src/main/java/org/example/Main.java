package org.example;

import org.example.euclid.Euclid;

public class Main {
    public static void main(String[] args) {

        Euclid gdc = new Euclid();
        System.out.println(gdc.gcd(22, 6));
        System.out.println(gdc.gcd2(22,7));
    }
}