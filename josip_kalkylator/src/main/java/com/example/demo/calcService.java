package com.example.demo;

public class calcService {
	
	public String kalkylator(String n1, String n2, String operator) {
		int siffra1 = 0;
		int siffra2 = 0;
		int result = 0;
		try {
			siffra1 = Integer.parseInt(n1);
			siffra2 = Integer.parseInt(n2);
		} catch (Exception e) {
			return "fel ange en giltig siffra";
		}
		
		switch (operator) {
		case "plus":
			result = siffra1 + siffra2;
			return "svaret är: " + result;
		case "minus":
			result = siffra1 - siffra2;
			return "svaret är: " + result;
		case "multiplikation":
			result = siffra1 * siffra2;
			return "svaret är: " + result;
		default:
			return "fel operator ange plus minus eller multiplikation.";
		}
		
	}
	
	public String kalkylatorDescription() {
		return "Du skal ange två siffror och en operator alltså plus minus eller multiplikation";
	}

}
