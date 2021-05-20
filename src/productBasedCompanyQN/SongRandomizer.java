package productBasedCompanyQN;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;

/*
 * @Author: Niraj Thagunna
 * 
 * Song Randomizer
 * All the songs are played in the randomized order and songs are not repeated unless all the songs have been played.
 */

// SongSuffler
public class SongRandomizer {

	// list of all the songs 
	// playList of the songs
	private String[] playList;
	
	// Index to represent all the pending songs available in the play list
	private int pendingSongEndPoint;
	
	// object of Random class to generate the Random number
	private Random random = new Random();
	
	// Constructor to initialize the play list of the songs
	public SongRandomizer(String[] playList) {
		this.playList = playList;
		
		// Initially all the songs are not played
		this.pendingSongEndPoint = playList.length;
	}
	
	// method to play a random song
	public String playRandomSong() {
		
		// get the random song id -> index
		int randomPlayedSongidx = random.nextInt(pendingSongEndPoint);
		
		// get the song name
		String playedSong = playList[randomPlayedSongidx];
		
		// Swapping the played song with the last song
		// i.e. every played song put that song into the last of the list
		swap(randomPlayedSongidx, pendingSongEndPoint - 1);
		
		// one song is played now decrement the pendingSongEndPoint to indicate the new pending songs list
		pendingSongEndPoint--;
		
		// check if all the songs are played
		// then reset the pendingSongIndex to play all the songs again
		if (pendingSongEndPoint == 0)
			pendingSongEndPoint = playList.length;
		
		// return the played song
		return playedSong;
	}
	
	// method to swap the played song with the last song
	public void swap(int i, int j) {
		String temp = playList[i];
		playList[i] = playList[j];
		playList[j] = temp;
	}
	
	// main
	public static void main(String[] args) {
		try {
			// testCase
			String[] playList = {"Linkin Park", "Sathi", "Titanic", "Give me some sunshine", "Perfect"};
			
			// call the play method song
			// creating an object
			SongRandomizer songRandomizer = new SongRandomizer(playList);
			
			// play the song
			System.out.println("1 - Iteration");
			System.out.println("Play first song : " + songRandomizer.playRandomSong());
			System.out.println("Play second song : " + songRandomizer.playRandomSong());
			System.out.println("Play third song : " + songRandomizer.playRandomSong());
			System.out.println("Play fourth song : " + songRandomizer.playRandomSong());
			System.out.println("Play fifth song : " + songRandomizer.playRandomSong());
			
			System.out.println("\n2 - Iteration");
			System.out.println("Play first song : " + songRandomizer.playRandomSong());
			System.out.println("Play second song : " + songRandomizer.playRandomSong());
			System.out.println("Play third song : " + songRandomizer.playRandomSong());
			System.out.println("Play fourth song : " + songRandomizer.playRandomSong());
			System.out.println("Play fifth song : " + songRandomizer.playRandomSong());
			
		}
		catch (Exception ex) {
			StringWriter sw = new StringWriter();
			PrintWriter pw = new PrintWriter(sw);
			ex.printStackTrace();
			String error = sw.toString();
			System.out.println("Error : \n" + error);
		}
	}
}





