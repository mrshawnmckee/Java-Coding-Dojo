
public class Gorilla extends Mammal{
	
	public Gorilla(int energy) {
		super(energy);
	}
	public void throwSomething() {
		System.out.println("The gorilla threw something at a person");
		energy -=5;
		displayEnergy();
	}
	
	public void eatBanana() {
		System.out.println("The Gorilla ate a banana and gained energy");
		energy+= 10;
		displayEnergy();
	}
	
	public void climb() {
		System.out.println("The  Gorilla is climbing a tree");
		energy -= 10;
		displayEnergy();
		
	}
}
