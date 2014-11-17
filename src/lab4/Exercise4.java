/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import common.Song;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 *
 * @author cvadmin
 */
public class Exercise4 {

    public static void main(String[] args) {

        Song s1 = new Song("Here's to the Night", "Eve 6", "Horrorscope", "06");
        Song s2 = new Song("Beat It", "Michael Jackson", "Beat It Single", "01");
        Song s3 = new Song("Like a Surgeon", "Wierd Al Yankovic", "Dare to Be Stupid", "05");
        Song s4 = new Song("Born in the USA", "Bruce Springsteen", "Glittered Advantage", "07");

        Set<Song> songSet = new TreeSet<>();

        songSet.add(s1);
        songSet.add(s2);
        songSet.add(s3);
        songSet.add(s4);

        System.out.println("Sort songs");
        for (Song song : songSet) {
            System.out.println("Song" + song);
        }

    }

}
