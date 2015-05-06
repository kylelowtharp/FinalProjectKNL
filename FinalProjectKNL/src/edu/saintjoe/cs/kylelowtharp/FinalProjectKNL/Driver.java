package edu.saintjoe.cs.kylelowtharp.FinalProjectKNL;

public class Driver {
	public static void main(String[] args) {
		Mammal mamOne, mamTwo, mamThree;
		
		mamOne = new Mammal("bear", 15);
		mamTwo = new Mammal("Whale", 27);
		mamThree= new Mammal("Dog", 7);
		
		System.out.println(mamOne.toString());
	}

}
