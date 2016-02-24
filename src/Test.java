
public class Test {
	public static void main(String[] args){
		//I want to add some sort of initialization
			//Load textures, setup initial state
		//Update/draw
			//Read keyboard input, change state, draw current state
		
		
		//Initialization/Load 
		//Message pump
		//Update
		//Clear
		//Drawing goes here
		//window.swapBuffers();
		//}
		//Cleanup Goes Here
		//System.exit(0); }
		
		/*
		 * KeyEvent.VK_* in Java
		 * You need to be able to detect when a key was just pressed or just released
		 * which is why you need to keep track of the previous state
		 * A key press is !prev && cur
		 * A key release is prev && !cur
		 * Second thing you want to do is load and draw images
		 * these functions load a .tga file and draw it on screen
		 * glTexImageTGAFile returns int of drawing(.tga store in 24bit or 32bit_
		 * glDrawSpite
		 * 
		 * 
		 * 
		 * 
		 * 
		 * int sonicTex;
		 * int sonicTexSize[] = new int[2]
		 * ...
		 *Load Textures
		 sonicText = glTextImageTGAFile(gl, "sonic.tga", sonicTextSize)
		 while{
			 clear
			 glDrawSite
		
		Homework 1
		Create a window, the window should have an image dawn in the center of it.
		When a key is pressed, the image should move around
		If key is held, keep it moving smoothly
		
		Hint: Use the two methods
		
		Must submit full source code
		An executable .exe file that I can double click on and run, even without anything else installed.
		
		
		Do not use any other external libraries than the ones I cover in class (so I can compile on Linux)
		
		Due next wesnesday midnight
		
		 }*/
		 
	}

}
