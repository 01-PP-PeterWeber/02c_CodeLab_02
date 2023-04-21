package com.cc.java;

public class Mitarbeiter {
	private String lastName;
	private String preName;
	private String stellungImUnternehmen;
	private int eintrittsJahr;

	
	public Mitarbeiter(String lastName, String preName, String stellungImUnternehmen, int eintrittsJahr) {
		this.lastName = lastName;
		this.preName = preName;
		this.stellungImUnternehmen = stellungImUnternehmen;
		this.eintrittsJahr = eintrittsJahr;
	}

	public String getInfo(String attribut) {
		switch (attribut) {
			case "#lastName":
				return this.lastName;
			case "#preName":
				return this.preName;
			case "#stellungImUnternehmen":
				return this.stellungImUnternehmen;
			case "#eintrittsJahr":
				return String.valueOf(this.eintrittsJahr);		
			default:
				return "Ungültige Eingabe!";
		}
		
	}

}
