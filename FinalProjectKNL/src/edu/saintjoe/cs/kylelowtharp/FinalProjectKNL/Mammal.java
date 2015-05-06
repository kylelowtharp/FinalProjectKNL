package edu.saintjoe.cs.kylelowtharp.FinalProjectKNL;

public class Mammal {
	private String name;
	private int age;
	
	
	public Mammal(String mammalName, int mammalAge,){
		name = mammalName;
		age = mammalAge;
	}
	
	public String toString() {
		
		return "this" + mammalName + "is" + age + "years old";
	}
	
	public void setName(String newName) {
			name = newName;
	}
				
	}

}
