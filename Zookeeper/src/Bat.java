
public class Bat extends Mammal {

	
	public Bat() {
		super(300);
	}
	
	public void fly() {
		System.out.println("Whoosh");
		energy -= 50;
		displayEnergy();
	}
	
	public void eatHumans() {
		System.out.println("Hey bat, stop that!");
		energy += 25;
		displayEnergy();
	}
	
	public void attackTown() {
		System.out.println("Snap, Crackle, Pop");
		energy -= 100;
		displayEnergy();
	}

}
