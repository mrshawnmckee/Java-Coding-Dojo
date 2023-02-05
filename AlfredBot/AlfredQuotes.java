import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello " + name + ". Lovely to see you";
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if (conversation.contains("Alexis")) {
            return "Low-fi beats would be about all she could handle";
        } else if (conversation.contains("Alfred")) {
            return"It is in your left coat pocket, Sir";
        } else {
            return "Of course Sir";
        }
        // conversation.contains("Alexis") ? return "Lo-Fi Beats would be an accomplishment for her" :
        // conversation.contains("Alfred") ? return "It is in your left coat pocket Sir" :
        // return "Of course , Sir";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}

