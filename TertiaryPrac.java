public class TertiaryPrac {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isCold = false;
        System.out.println(isRaining && isCold ? "it is snowing" : 
            isRaining ? "Need Umbrella": 
            isCold ? "Need a coat" : "weather is fine"); 
    }
}