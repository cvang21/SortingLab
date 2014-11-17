package lab2;
import common.Song;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author cvadmin
 */
public class Exercise2 {
    public static void main(String[] args) {
        
        Song s1 = new Song("Here's to the Night", "Eve 6", "Horrorscope", "6");
        Song s2 = new Song("Beat It", "Michael Jackson", "Beat It Single", "1");
        Song s3 = new Song("Like a Surgeon", "Wierd Al Yankovic", "Dare to Be Stupid", "5");
        Song s4 = new Song("Born in the USA", "Bruce Springsteen", "Glittered Advantage", "7");

        Map<String, Song> songMap = new HashMap<>(); 
        songMap.put(s1.getTrackNumber(), s1);
        songMap.put(s2.getTrackNumber(), s2);
        songMap.put(s3.getTrackNumber(), s3);
        songMap.put(s4.getTrackNumber(), s4);
     
        System.out.println("Songs in Hashmap - Not Ordered");
        for (String key: songMap.keySet()){
        Song track = songMap.get(key);
            System.out.println("Song " + track);
        }
        
        songMap = new LinkedHashMap<>(songMap);
        System.out.println("Song linked Hash - Ordered");
        for (String key: songMap.keySet()){
        Song track = songMap.get(key);
            System.out.println("Song " + track);
        }
        
    }
        
    
}
