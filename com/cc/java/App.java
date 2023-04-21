package com.cc.java;

public class App {

	public static void main(String[] args) {
        Mitarbeiter mitarbeiter1 = new Mitarbeiter("Mustermann", "Max", "IT-Manager", 2010);
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Musterfrau", "Maria", "Personalchefin", 2015);
        Mitarbeiter mitarbeiter3 = new Mitarbeiter("Meier", "Hans", "Marketing-Experte", 2018);

		System.out.println(mitarbeiter1.getInfo("#preName"));
        System.out.println(mitarbeiter1.getInfo("#lastName"));
		System.out.println(mitarbeiter3.getInfo("#stellungImUnternehmen"));
        System.out.println(mitarbeiter1.getInfo("#eintrittsJahr"));
		System.out.println(mitarbeiter2.getInfo("#geburtsJahr"));

    }
}
