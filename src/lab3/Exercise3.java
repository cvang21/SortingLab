/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import common.Song;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author cvadmin
 */
public class Exercise3 {
    public static void main(String[] args) {
        
        Song s1 = new Song("Here's to the Night", "Eve 6", "Horrorscope", "06");
        Song s2 = new Song("Beat It", "Michael Jackson", "Beat It Single", "01");
        Song s3 = new Song("Like a Surgeon", "Wierd Al Yankovic", "Dare to Be Stupid", "05");
        Song s4 = new Song("Born in the USA", "Bruce Springsteen", "Glittered Advantage", "07");

        Map<String, Song> songMap = new TreeMap<>();
        
        songMap.put(s1.getTrackNumber(), s1);
        songMap.put(s2.getTrackNumber(), s2);
        songMap.put(s3.getTrackNumber(), s3);
        songMap.put(s4.getTrackNumber(), s4);
        
        System.out.println("Sorted by Track: ");
        for (String key : songMap.keySet()){
            Song track  = songMap.get(key);
            System.out.println("Song track:" + track);
        }
        
        Collection songMapValues = songMap.values();
        List<Song> sortedList = new ArrayList<>(songMapValues);
        
        sortedList.sort(songMap);
        System.out.println("");
        System.out.println("Songs from the sorted list created from the collection of the map values, sorted by Artist: ");
        for (Song song : sortedList){
            System.out.println("Song" + song);
        }
    }
}
