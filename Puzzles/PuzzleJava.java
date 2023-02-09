
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;



public class PuzzleJava {
    
    //Create instance of Random
    Random randMachine = new Random();

    public int getTenRolls() {
        int num = 0;
        for(int i = 1; i < 10; i++){
            num = randMachine.nextInt(20);
            System.out.println(num);
        }
        return num;
    }

    public String getRandomLetter() {
        String[] lett = {"a", "b", "c", "d", "e", "f", "g",
                        "h", "i", "j", "k", "l", "m", "n",
                        "o", "p", "q", "r", "s", "t", "u", 
                        "v", "w", "x", "y", "z"};
        int num2 = randMachine.nextInt(26);
        return(lett[num2]);
        
    }

    public String generatePassword() {
        String[] lett2 = {"a", "b", "c", "d", "e", "f", "g",
                        "h", "i", "j", "k", "l", "m", "n",
                        "o", "p", "q", "r", "s", "t", "u", 
                        "v", "w", "x", "y", "z"};
        String password = "";

        for(int i = 0; i <8; i++) {
            password = password + getRandomLetter();
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int amt) {
        ArrayList<String> password2 = new ArrayList<String>();
        
        for(int i = 0; i <amt; i++) {
            password2.add(generatePassword());
        }
        return password2;

    }
}