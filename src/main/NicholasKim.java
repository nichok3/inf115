package main;
import java.lang.Math;

public class NicholasKim {
	
	public String getFullName() {
		return "Nicholas Kim";
	}
	
	public String getFirstName() {
		return "Nicholas";
	}
	
	public String getLastName() {
		return "Kim";
	}
	
	public String getUCInetID() {
		return "nichok3";
	}
	
	public int getStudentNumber() {
		return 93176609;
	}
	
	public String getRotatedFullName(int rotations) {
		String original = getFullName();
		
		if (rotations < 0)
		{
			rotations = original.length() - Math.abs(rotations);
		}
		
		return original.substring(rotations) + original.substring(0, rotations);
	}
	
	public static void main(String[] args) {
		NicholasKim n = new NicholasKim();
		System.out.println(n.getFullName());
		System.out.println(n.getFirstName()); 
		System.out.println(n.getLastName()); 
		System.out.println(n.getUCInetID()); 
		System.out.println(n.getRotatedFullName(2)); 
		System.out.println(n.getRotatedFullName(-5)); 
	}
}
