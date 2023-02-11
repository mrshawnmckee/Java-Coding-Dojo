import java.util.HashMap;
import java.util.Set;
// Creating a Hash map of songs for A band from Teignmouth, Devon

public class SongsHashMap{
    public static void main(String[] args){
        HashMap<String, String> songTitles = new HashMap<String, String>();
        
        //Create four song titles
        songTitles.put ("West of London", "Here we sing of a Town that is West of London");
        songTitles.put( "Rain Rain", "Why is it always Rain, rain");
        songTitles.put("Hello English Channel", "I see the water and it calls me");
        songTitles.put("Exit from Exeter", "We have to get out Quick");

        //Print out one song title
        System.out.println(songTitles.get("Hello English Channel"));

        //Print out all of the track names in Key:value format

        System.out.println("======Title==========Lyrics===================");
        Set<String> songs = songTitles.keySet();
        for(String key: songs) {
            System.out.println(key + ": " + songTitles.get(key));

        }
    }


}


