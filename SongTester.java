/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dorothy
 */
public class SongTester {
    
    public static void main(String[] args) {
        
        // ALL OF THESE SHOULD WORK ONCE YOU HAVE ADDED THE METHODS TO THE CLASS SONG.
        Song song1 = new Song();
        song1.setSongTitle("Blinding Lights");
        song1.setSongArtist("Weeknd");

        Song song2 = new Song();
        song2.setSongTitle("Dance Monkey");
        song2.setSongArtist("Tones & I");

        System.out.println("Song 1 title: "+ song1.getSongTitle()+", artist: "+song1.getSongArtist());
        System.out.println("Song 2 title: "+ song2.getSongTitle()+", artist: "+song2.getSongArtist());
        System.out.println("No of songs: "+Song.getNoOfSongs());
    }
}
