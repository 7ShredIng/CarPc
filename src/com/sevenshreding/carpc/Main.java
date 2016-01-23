package com.sevenshreding.carpc;

import java.io.*;
import sun.audio.*;

public class Main {

	public static void main(String[] args) {
	
	    String Filename = "//home//sick//Music//test.wav";
	    try{
		    InputStream in = new FileInputStream(Filename);
		    AudioStream as = new AudioStream(in);         
		    AudioPlayer.player.start(as);            
		    //AudioPlayer.player.stop(as);
	    }
	    catch(Exception e)
	    {
	    	System.out.print(e);
	    }
		System.out.print("hello");
	}
}
