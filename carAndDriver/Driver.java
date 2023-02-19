public class Driver extends Car{
    
    public void Driving(){
        System.out.println("You drive the car");
        gas--;
        status();
    }

    public void boosters(){
        if(gas < 4){
            System.out.println("Not enough fuel!");
        } else{
            System.out.println("Boosters on!");
            gas -=3;
            status();

        }

    }

    public void refuel(){
        if(gas > 7){
            System.out.println("No need to refuel yet");
        } else {

            System.out.println("Refueling");
            gas +=2;
            status();
        }
    }
}