package Utils;

import entities.Gamer;

public class Validation {
	public static boolean validate(Gamer gamer) {
		if(gamer.getNationalId().length() > 11) {
			return false;
		}
		else if(gamer.getNationalId().length() > 0 && gamer.getNationalId().length() <= 11 && !gamer.getNationalId().startsWith("0")) {
			return true;
		}
		else {
			return false;
		}
		
		
	}
}
