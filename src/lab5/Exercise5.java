/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import common.Song;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


/**
 *
 * @author cvadmin
 */
public class Exercise5 {
    public static void main(String[] args) {
        
        Song s1 = new Song("Here's to the Night", "Eve 6", "Horrorscope", "06");
        Song s2 = new Song("Beat It", "Michael Jackson", "Beat It Single", "01");
        Song s3 = new Song("Like a Surgeon", "Wierd Al Yankovic", "Dare to Be Stupid", "05");
        Song s4 = new Song("Born in the USA", "Bruce Springsteen", "Glittered Advantage", "07");

        List<Song> songList = new ArrayList<>();

        songList.add(s1);
        songList.add(s2);
        songList.add(s3);
        songList.add(s4);
        
        
    }
}
