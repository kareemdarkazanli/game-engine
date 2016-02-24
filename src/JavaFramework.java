
import com.jogamp.opengl.*;
import com.jogamp.nativewindow.WindowClosingProtocol.WindowClosingMode;
import com.jogamp.newt.event.KeyEvent;
import com.jogamp.newt.event.KeyListener;
import com.jogamp.newt.opengl.GLWindow;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLException;
import com.jogamp.opengl.GLProfile;

import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class JavaFramework {
    // Set this to true to force the game to exit.
    private static boolean shouldExit;

    // The previous frame's keyboard state.
    private static boolean kbPrevState[] = new boolean[256];

    // The current frame's keyboard state.
    private static boolean kbState[] = new boolean[256];
    
    // Position of the sprite.
    private static int[] spritePos;

    // Texture for the sprite.
    private static int spriteTex;
    private static int spriteTex2;
    
    
    private static int blue_sky;
    
    private static int sky0;
    private static int sky1;
    private static int sky2;
    private static int sky3;
    private static int sky4;
    private static int sky5;
    private static int sky6;
    private static int sky7;
    private static int sky8;
    private static int sky9;
    private static int sky10;
    private static int sky11;
    private static int sky12;
    private static int sky13;
    private static int sky14;
    private static int sky15;
    private static int sky16;
    private static int sky17;
    private static int sky18;
    private static int sky19;
    private static int sky20;
    private static int sky21;
    private static int sky22;
    private static int sky23;
    private static int sky24;
    private static int sky25;
    private static int sky26;
    private static int sky27;
    private static int sky28;
    private static int sky29;
    private static int sky30;
    private static int sky31;
    private static int sky32;
    private static int sky33;
    private static int sky34;
    private static int sky35;
    private static int sky36;
    private static int sky37;
    private static int sky38;
    private static int sky39;
    private static int sky40;
    private static int sky41;
    private static int sky42;
    private static int sky43;
    private static int sky44;
    private static int sky45;
    private static int sky46;
    private static int sky47;
    private static int sky48;
    private static int sky49;
    private static int sky50;
    private static int sky51;
    private static int sky52;
    private static int sky53;
    private static int sky54;
    private static int sky55;
    private static int sky56;
    private static int sky57;
    private static int sky58;
    private static int sky59;
    private static int sky60;
    private static int sky61;
    private static int sky62;
    private static int sky63;
    private static int sky64;
    private static int sky65;
    private static int sky66;
    private static int sky67;
    private static int sky68;
    private static int sky69;
    private static int sky70;
    private static int sky71;
    private static int sky72;
    private static int sky73;
    private static int sky74;
    private static int sky75;
    private static int sky76;
    private static int sky77;
    private static int sky78;
    private static int sky79;
    private static int sky80;
    private static int sky81;
    private static int sky82;
    private static int sky83;
    private static int sky84;
    private static int sky85;
    private static int sky86;
    private static int sky87;
    private static int sky88;
    private static int sky89;
    private static int sky90;
    
    




    // Size of the sprite.
    private static int[] spriteSize = new int[2];

    public static void main(String[] args) {
        GLProfile gl2Profile;

        try {
            // Make sure we have a recent version of OpenGL
            gl2Profile = GLProfile.get(GLProfile.GL2);
        }
        catch (GLException ex) {
            System.out.println("OpenGL max supported version is too low.");
            System.exit(1);
            return;
        }

        // Create the window and OpenGL context.
        GLWindow window = GLWindow.create(new GLCapabilities(gl2Profile));
        window.setSize(1280, 960);
        window.setTitle("Java Framework");
        window.setVisible(true);
        window.setDefaultCloseOperation(WindowClosingMode.DISPOSE_ON_CLOSE);
        window.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                kbState[keyEvent.getKeyCode()] = true;
            }

            @Override
            public void keyReleased(KeyEvent keyEvent) {
                kbState[keyEvent.getKeyCode()] = false;
            }
        });
                

        // Setup OpenGL state.
        window.getContext().makeCurrent();
        GL2 gl = window.getGL().getGL2();
        spritePos = new int[] { window.getSurfaceWidth()/2, window.getSurfaceHeight()/2};
        gl.glViewport(0, 0, window.getSurfaceWidth(), window.getSurfaceHeight());
        gl.glMatrixMode(GL2.GL_PROJECTION);
        gl.glOrtho(0, window.getSurfaceWidth(), window.getSurfaceHeight(), 0, 0, 100);
        gl.glEnable(GL2.GL_TEXTURE_2D);
        gl.glEnable(GL2.GL_BLEND);
        gl.glBlendFunc(GL2.GL_SRC_ALPHA, GL2.GL_ONE_MINUS_SRC_ALPHA);

        // Load the texture.
        spriteTex = glTexImageTGAFile(gl,"Mega-Man-transparent.tga", spriteSize);
        spriteTex2 = glTexImageTGAFile(gl,"Mega-Man-transparent_left.tga", spriteSize);
        
        sky0 = glTexImageTGAFile(gl,"7536921_orig-00-00.tga", spriteSize);
        sky1 = glTexImageTGAFile(gl,"7536921_orig-01-00.tga", spriteSize);
        sky2 = glTexImageTGAFile(gl,"7536921_orig-02-00.tga", spriteSize);
        sky3 = glTexImageTGAFile(gl,"7536921_orig-03-00.tga", spriteSize);
        sky4 = glTexImageTGAFile(gl,"7536921_orig-04-00.tga", spriteSize);
        sky5 = glTexImageTGAFile(gl,"7536921_orig-05-00.tga", spriteSize);
        sky6 = glTexImageTGAFile(gl,"7536921_orig-06-00.tga", spriteSize);
        sky7 = glTexImageTGAFile(gl,"7536921_orig-07-00.tga", spriteSize);
        sky8 = glTexImageTGAFile(gl,"7536921_orig-08-00.tga", spriteSize);
        sky9 = glTexImageTGAFile(gl,"7536921_orig-09-00.tga", spriteSize);
        sky10 = glTexImageTGAFile(gl,"7536921_orig-10-00.tga", spriteSize); 
        sky11 = glTexImageTGAFile(gl,"7536921_orig-11-00.tga", spriteSize); 
        sky12 = glTexImageTGAFile(gl,"7536921_orig-12-00.tga", spriteSize); 
        sky13 = glTexImageTGAFile(gl,"7536921_orig-13-00.tga", spriteSize); 
        sky14 = glTexImageTGAFile(gl,"7536921_orig-14-00.tga", spriteSize); 
        sky15 = glTexImageTGAFile(gl,"7536921_orig-15-00.tga", spriteSize); 
        sky16 = glTexImageTGAFile(gl,"7536921_orig-16-00.tga", spriteSize); 
        sky17 = glTexImageTGAFile(gl,"7536921_orig-17-00.tga", spriteSize);
        sky18 = glTexImageTGAFile(gl,"7536921_orig-18-00.tga", spriteSize); 
        sky19 = glTexImageTGAFile(gl,"7536921_orig-19-00.tga", spriteSize);
        sky20 = glTexImageTGAFile(gl,"7536921_orig-20-00.tga", spriteSize); 
        sky21 = glTexImageTGAFile(gl,"7536921_orig-21-00.tga", spriteSize); 
        sky22 = glTexImageTGAFile(gl,"7536921_orig-22-00.tga", spriteSize); 
        sky23 = glTexImageTGAFile(gl,"7536921_orig-23-00.tga", spriteSize); 
        sky24 = glTexImageTGAFile(gl,"7536921_orig-24-00.tga", spriteSize); 
        sky25 = glTexImageTGAFile(gl,"7536921_orig-25-00.tga", spriteSize); 
        sky26 = glTexImageTGAFile(gl,"7536921_orig-26-00.tga", spriteSize); 
        sky27 = glTexImageTGAFile(gl,"7536921_orig-27-00.tga", spriteSize);
        sky28 = glTexImageTGAFile(gl,"7536921_orig-28-00.tga", spriteSize); 
        sky29 = glTexImageTGAFile(gl,"7536921_orig-29-00.tga", spriteSize);
        sky30 = glTexImageTGAFile(gl,"7536921_orig-30-00.tga", spriteSize); 
        sky31 = glTexImageTGAFile(gl,"7536921_orig-31-00.tga", spriteSize); 
        sky32 = glTexImageTGAFile(gl,"7536921_orig-32-00.tga", spriteSize); 
        sky33 = glTexImageTGAFile(gl,"7536921_orig-33-00.tga", spriteSize); 
        sky34 = glTexImageTGAFile(gl,"7536921_orig-34-00.tga", spriteSize); 
        sky35 = glTexImageTGAFile(gl,"7536921_orig-35-00.tga", spriteSize); 
        sky36 = glTexImageTGAFile(gl,"7536921_orig-36-00.tga", spriteSize); 
        sky37 = glTexImageTGAFile(gl,"7536921_orig-37-00.tga", spriteSize);
        sky38 = glTexImageTGAFile(gl,"7536921_orig-38-00.tga", spriteSize); 
        sky39 = glTexImageTGAFile(gl,"7536921_orig-39-00.tga", spriteSize);
        sky40 = glTexImageTGAFile(gl,"7536921_orig-40-00.tga", spriteSize); 
        sky41 = glTexImageTGAFile(gl,"7536921_orig-41-00.tga", spriteSize); 
        sky42 = glTexImageTGAFile(gl,"7536921_orig-42-00.tga", spriteSize); 
        sky43 = glTexImageTGAFile(gl,"7536921_orig-43-00.tga", spriteSize); 
        sky44 = glTexImageTGAFile(gl,"7536921_orig-44-00.tga", spriteSize); 
        sky45 = glTexImageTGAFile(gl,"7536921_orig-45-00.tga", spriteSize); 
        sky46 = glTexImageTGAFile(gl,"7536921_orig-46-00.tga", spriteSize); 
        sky47 = glTexImageTGAFile(gl,"7536921_orig-47-00.tga", spriteSize);
        sky48 = glTexImageTGAFile(gl,"7536921_orig-48-00.tga", spriteSize); 
        sky49 = glTexImageTGAFile(gl,"7536921_orig-49-00.tga", spriteSize);
        sky50 = glTexImageTGAFile(gl,"7536921_orig-50-00.tga", spriteSize); 
        sky51 = glTexImageTGAFile(gl,"7536921_orig-51-00.tga", spriteSize); 
        sky52 = glTexImageTGAFile(gl,"7536921_orig-52-00.tga", spriteSize); 
        sky53 = glTexImageTGAFile(gl,"7536921_orig-53-00.tga", spriteSize); 
        sky54 = glTexImageTGAFile(gl,"7536921_orig-54-00.tga", spriteSize); 
        sky55 = glTexImageTGAFile(gl,"7536921_orig-55-00.tga", spriteSize); 
        sky56 = glTexImageTGAFile(gl,"7536921_orig-56-00.tga", spriteSize); 
        sky57 = glTexImageTGAFile(gl,"7536921_orig-57-00.tga", spriteSize);
        sky58 = glTexImageTGAFile(gl,"7536921_orig-58-00.tga", spriteSize); 
        sky59 = glTexImageTGAFile(gl,"7536921_orig-59-00.tga", spriteSize);
        sky60 = glTexImageTGAFile(gl,"7536921_orig-60-00.tga", spriteSize); 
        sky61 = glTexImageTGAFile(gl,"7536921_orig-61-00.tga", spriteSize); 
        sky62 = glTexImageTGAFile(gl,"7536921_orig-62-00.tga", spriteSize); 
        sky63 = glTexImageTGAFile(gl,"7536921_orig-63-00.tga", spriteSize); 
        sky64 = glTexImageTGAFile(gl,"7536921_orig-64-00.tga", spriteSize); 
        sky65 = glTexImageTGAFile(gl,"7536921_orig-65-00.tga", spriteSize); 
        sky66 = glTexImageTGAFile(gl,"7536921_orig-66-00.tga", spriteSize); 
        sky67 = glTexImageTGAFile(gl,"7536921_orig-67-00.tga", spriteSize);
        sky68 = glTexImageTGAFile(gl,"7536921_orig-68-00.tga", spriteSize); 
        sky69 = glTexImageTGAFile(gl,"7536921_orig-69-00.tga", spriteSize);
        sky70 = glTexImageTGAFile(gl,"7536921_orig-70-00.tga", spriteSize); 
        sky71 = glTexImageTGAFile(gl,"7536921_orig-71-00.tga", spriteSize); 
        sky72 = glTexImageTGAFile(gl,"7536921_orig-72-00.tga", spriteSize); 
        sky73 = glTexImageTGAFile(gl,"7536921_orig-73-00.tga", spriteSize); 
        sky74 = glTexImageTGAFile(gl,"7536921_orig-74-00.tga", spriteSize); 
        sky75 = glTexImageTGAFile(gl,"7536921_orig-75-00.tga", spriteSize); 
        sky76 = glTexImageTGAFile(gl,"7536921_orig-76-00.tga", spriteSize); 
        sky77 = glTexImageTGAFile(gl,"7536921_orig-77-00.tga", spriteSize);
        sky78 = glTexImageTGAFile(gl,"7536921_orig-78-00.tga", spriteSize); 
        sky79 = glTexImageTGAFile(gl,"7536921_orig-79-00.tga", spriteSize);
        sky80 = glTexImageTGAFile(gl,"7536921_orig-80-00.tga", spriteSize); 
        sky81 = glTexImageTGAFile(gl,"7536921_orig-81-00.tga", spriteSize); 
        sky82 = glTexImageTGAFile(gl,"7536921_orig-82-00.tga", spriteSize); 
        sky83 = glTexImageTGAFile(gl,"7536921_orig-83-00.tga", spriteSize); 
        sky84 = glTexImageTGAFile(gl,"7536921_orig-84-00.tga", spriteSize); 
        sky85 = glTexImageTGAFile(gl,"7536921_orig-85-00.tga", spriteSize); 
        sky86 = glTexImageTGAFile(gl,"7536921_orig-86-00.tga", spriteSize); 
        sky87 = glTexImageTGAFile(gl,"7536921_orig-87-00.tga", spriteSize);
        sky88 = glTexImageTGAFile(gl,"7536921_orig-88-00.tga", spriteSize); 
        sky89 = glTexImageTGAFile(gl,"7536921_orig-89-00.tga", spriteSize);
        sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize); 

       
        int[][] background = new int[][]{
        	{		sky0 = glTexImageTGAFile(gl,"7536921_orig-00-00.tga", spriteSize),
        			sky1 = glTexImageTGAFile(gl,"7536921_orig-01-00.tga", spriteSize),
            		sky2 = glTexImageTGAFile(gl,"7536921_orig-02-00.tga", spriteSize),
            		sky3 = glTexImageTGAFile(gl,"7536921_orig-03-00.tga", spriteSize),
            		sky4 = glTexImageTGAFile(gl,"7536921_orig-04-00.tga", spriteSize),
            		sky5 = glTexImageTGAFile(gl,"7536921_orig-05-00.tga", spriteSize),
            		sky6 = glTexImageTGAFile(gl,"7536921_orig-06-00.tga", spriteSize),
            		sky7 = glTexImageTGAFile(gl,"7536921_orig-07-00.tga", spriteSize),
            		sky8 = glTexImageTGAFile(gl,"7536921_orig-08-00.tga", spriteSize),
            		sky9 = glTexImageTGAFile(gl,"7536921_orig-09-00.tga", spriteSize),
        	},
        	{
        			sky10 = glTexImageTGAFile(gl,"7536921_orig-10-00.tga", spriteSize),
                    sky11 = glTexImageTGAFile(gl,"7536921_orig-11-00.tga", spriteSize),	
                    sky12 = glTexImageTGAFile(gl,"7536921_orig-12-00.tga", spriteSize),	
                    sky13 = glTexImageTGAFile(gl,"7536921_orig-13-00.tga", spriteSize),	
                    sky14 = glTexImageTGAFile(gl,"7536921_orig-14-00.tga", spriteSize),
                    sky15 = glTexImageTGAFile(gl,"7536921_orig-15-00.tga", spriteSize),	
                    sky16 = glTexImageTGAFile(gl,"7536921_orig-16-00.tga", spriteSize),	
                    sky17 = glTexImageTGAFile(gl,"7536921_orig-17-00.tga", spriteSize),	                    
                    sky18 = glTexImageTGAFile(gl,"7536921_orig-18-00.tga", spriteSize),
                    sky19 = glTexImageTGAFile(gl,"7536921_orig-19-00.tga", spriteSize),


        	},
        	{
    			sky20 = glTexImageTGAFile(gl,"7536921_orig-20-00.tga", spriteSize),
                sky21 = glTexImageTGAFile(gl,"7536921_orig-21-00.tga", spriteSize),	
                sky22 = glTexImageTGAFile(gl,"7536921_orig-22-00.tga", spriteSize),	
                sky23 = glTexImageTGAFile(gl,"7536921_orig-23-00.tga", spriteSize),	
                sky24 = glTexImageTGAFile(gl,"7536921_orig-24-00.tga", spriteSize),
                sky25 = glTexImageTGAFile(gl,"7536921_orig-25-00.tga", spriteSize),	
                sky26 = glTexImageTGAFile(gl,"7536921_orig-26-00.tga", spriteSize),	
                sky27 = glTexImageTGAFile(gl,"7536921_orig-27-00.tga", spriteSize),	                    
                sky28 = glTexImageTGAFile(gl,"7536921_orig-28-00.tga", spriteSize),
                sky29 = glTexImageTGAFile(gl,"7536921_orig-29-00.tga", spriteSize),


    	},
        	{
			sky30 = glTexImageTGAFile(gl,"7536921_orig-30-00.tga", spriteSize),
            sky31 = glTexImageTGAFile(gl,"7536921_orig-31-00.tga", spriteSize),	
            sky32 = glTexImageTGAFile(gl,"7536921_orig-32-00.tga", spriteSize),	
            sky33 = glTexImageTGAFile(gl,"7536921_orig-33-00.tga", spriteSize),	
            sky34 = glTexImageTGAFile(gl,"7536921_orig-34-00.tga", spriteSize),
            sky35 = glTexImageTGAFile(gl,"7536921_orig-35-00.tga", spriteSize),	
            sky36 = glTexImageTGAFile(gl,"7536921_orig-36-00.tga", spriteSize),	
            sky37 = glTexImageTGAFile(gl,"7536921_orig-37-00.tga", spriteSize),	                    
            sky38 = glTexImageTGAFile(gl,"7536921_orig-38-00.tga", spriteSize),
            sky39 = glTexImageTGAFile(gl,"7536921_orig-39-00.tga", spriteSize),


	},
    	{
			sky40 = glTexImageTGAFile(gl,"7536921_orig-40-00.tga", spriteSize),
            sky41 = glTexImageTGAFile(gl,"7536921_orig-41-00.tga", spriteSize),	
            sky42 = glTexImageTGAFile(gl,"7536921_orig-42-00.tga", spriteSize),	
            sky43 = glTexImageTGAFile(gl,"7536921_orig-43-00.tga", spriteSize),	
            sky44 = glTexImageTGAFile(gl,"7536921_orig-44-00.tga", spriteSize),
            sky45 = glTexImageTGAFile(gl,"7536921_orig-45-00.tga", spriteSize),	
            sky46 = glTexImageTGAFile(gl,"7536921_orig-46-00.tga", spriteSize),	
            sky47 = glTexImageTGAFile(gl,"7536921_orig-47-00.tga", spriteSize),	                    
            sky48 = glTexImageTGAFile(gl,"7536921_orig-48-00.tga", spriteSize),
            sky49 = glTexImageTGAFile(gl,"7536921_orig-49-00.tga", spriteSize),


	},
    	{
		sky50 = glTexImageTGAFile(gl,"7536921_orig-50-00.tga", spriteSize),
        sky51 = glTexImageTGAFile(gl,"7536921_orig-51-00.tga", spriteSize),	
        sky52 = glTexImageTGAFile(gl,"7536921_orig-52-00.tga", spriteSize),	
        sky53 = glTexImageTGAFile(gl,"7536921_orig-53-00.tga", spriteSize),	
        sky54 = glTexImageTGAFile(gl,"7536921_orig-54-00.tga", spriteSize),
        sky55 = glTexImageTGAFile(gl,"7536921_orig-55-00.tga", spriteSize),	
        sky56 = glTexImageTGAFile(gl,"7536921_orig-56-00.tga", spriteSize),	
        sky57 = glTexImageTGAFile(gl,"7536921_orig-57-00.tga", spriteSize),	                    
        sky58 = glTexImageTGAFile(gl,"7536921_orig-58-00.tga", spriteSize),
        sky59 = glTexImageTGAFile(gl,"7536921_orig-59-00.tga", spriteSize),


},
    	{
	sky60 = glTexImageTGAFile(gl,"7536921_orig-60-00.tga", spriteSize),
    sky61 = glTexImageTGAFile(gl,"7536921_orig-61-00.tga", spriteSize),	
    sky62 = glTexImageTGAFile(gl,"7536921_orig-62-00.tga", spriteSize),	
    sky63 = glTexImageTGAFile(gl,"7536921_orig-63-00.tga", spriteSize),	
    sky64 = glTexImageTGAFile(gl,"7536921_orig-64-00.tga", spriteSize),
    sky65 = glTexImageTGAFile(gl,"7536921_orig-65-00.tga", spriteSize),	
    sky66 = glTexImageTGAFile(gl,"7536921_orig-66-00.tga", spriteSize),	
    sky67 = glTexImageTGAFile(gl,"7536921_orig-67-00.tga", spriteSize),	                    
    sky68 = glTexImageTGAFile(gl,"7536921_orig-68-00.tga", spriteSize),
    sky69 = glTexImageTGAFile(gl,"7536921_orig-69-00.tga", spriteSize),

},
    	{
	sky70 = glTexImageTGAFile(gl,"7536921_orig-70-00.tga", spriteSize),
    sky71 = glTexImageTGAFile(gl,"7536921_orig-71-00.tga", spriteSize),	
    sky72 = glTexImageTGAFile(gl,"7536921_orig-72-00.tga", spriteSize),	
    sky73 = glTexImageTGAFile(gl,"7536921_orig-73-00.tga", spriteSize),	
    sky74 = glTexImageTGAFile(gl,"7536921_orig-74-00.tga", spriteSize),
    sky75 = glTexImageTGAFile(gl,"7536921_orig-75-00.tga", spriteSize),	
    sky76 = glTexImageTGAFile(gl,"7536921_orig-76-00.tga", spriteSize),	
    sky77 = glTexImageTGAFile(gl,"7536921_orig-77-00.tga", spriteSize),	                    
    sky78 = glTexImageTGAFile(gl,"7536921_orig-78-00.tga", spriteSize),
    sky79 = glTexImageTGAFile(gl,"7536921_orig-79-00.tga", spriteSize),


},
    	{
	sky80 = glTexImageTGAFile(gl,"7536921_orig-80-00.tga", spriteSize),
    sky81 = glTexImageTGAFile(gl,"7536921_orig-81-00.tga", spriteSize),	
    sky82 = glTexImageTGAFile(gl,"7536921_orig-82-00.tga", spriteSize),	
    sky83 = glTexImageTGAFile(gl,"7536921_orig-83-00.tga", spriteSize),	
    sky84 = glTexImageTGAFile(gl,"7536921_orig-84-00.tga", spriteSize),
    sky85 = glTexImageTGAFile(gl,"7536921_orig-85-00.tga", spriteSize),	
    sky86 = glTexImageTGAFile(gl,"7536921_orig-86-00.tga", spriteSize),	
    sky87 = glTexImageTGAFile(gl,"7536921_orig-87-00.tga", spriteSize),	                    
    sky88 = glTexImageTGAFile(gl,"7536921_orig-88-00.tga", spriteSize),
    sky89 = glTexImageTGAFile(gl,"7536921_orig-89-00.tga", spriteSize),


},
    	{
			sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize),
			sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize),
			sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize),
			sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize),
			sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize),
			sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize),
			sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize),
			sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize),
			sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize),
			sky90 = glTexImageTGAFile(gl,"7536921_orig-90-00.tga", spriteSize),
    


}
        };
        

       
        boolean leftClicked = false;

        // The game loop
        while (!shouldExit) {
            System.arraycopy(kbState, 0, kbPrevState, 0, kbState.length);

            // Actually, this runs the entire OS message pump.
            window.display();
            if (!window.isVisible()) {
                shouldExit = true;
                break;
            }
            
            

            
            // Game logic.
            if (kbState[KeyEvent.VK_ESCAPE]) {
                shouldExit = true;
          
            }

            if (kbState[KeyEvent.VK_LEFT]) {
            	if(spritePos[0] > 0)
            		spritePos[0] -= 10;
            	leftClicked = true;
            	 
            }

            if (kbState[KeyEvent.VK_RIGHT]) {
            	if(spritePos[0] < window.getSurfaceWidth() - 30)
            		spritePos[0] += 10;
            	leftClicked = false;
            }

            if (kbState[KeyEvent.VK_UP]) {
            	if(spritePos[1] > 0)
            		spritePos[1] -= 10;
            }

            if (kbState[KeyEvent.VK_DOWN]) {
            	if(spritePos[1] < window.getSurfaceHeight() - 50)
            		spritePos[1] += 10;
            }

            gl.glClearColor(0, 0, 0, 1);
            gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
            
            for(int i = 0; i < 10; i++){
            	for(int j = 0; j < 20; j++){
                	glDrawSprite(gl, background[i][j % 10], j * spriteSize[0] * 2, i * spriteSize[1] * 2, spriteSize[0] * 2, spriteSize[1] * 2);      
            	}
            }
             

            if (leftClicked) {
                glDrawSprite(gl, spriteTex2, spritePos[0], spritePos[1], spriteSize[0], spriteSize[1]); 
            }
            else{
                glDrawSprite(gl, spriteTex, spritePos[0], spritePos[1], spriteSize[0], spriteSize[1]); 
            }

            // Present to the player.
            //window.swapBuffers();
        }
        System.exit(0);
    }

    // Load a file into an OpenGL texture and return that texture.
    public static int glTexImageTGAFile(GL2 gl, String filename, int[] out_size) {
        final int BPP = 4;

        DataInputStream file = null;
        try {
            
            file = new DataInputStream(new FileInputStream(filename));
        } catch (Exception ex) {
            System.err.format("File: %s -- Could not open for reading.", filename);
            return 0;
        }

        try {
            // Skip first two bytes of data we don't need.
            file.skipBytes(2);

            // Read in the image type.  For our purposes the image type
            // should be either a 2 or a 3.
            int imageTypeCode = file.readByte();
            if (imageTypeCode != 2 && imageTypeCode != 3) {
                file.close();
                System.err.format("File: %s -- Unsupported TGA type: %d", filename, imageTypeCode);
                return 0;
            }

            // Skip 9 bytes of data we don't need.
            file.skipBytes(9);

            int imageWidth = Short.reverseBytes(file.readShort());
            int imageHeight = Short.reverseBytes(file.readShort());
            int bitCount = file.readByte();
            file.skipBytes(1);

            // Allocate space for the image data and read it in.
            byte[] bytes = new byte[imageWidth * imageHeight * BPP];

            // Read in data.
            if (bitCount == 32) {
                for (int it = 0; it < imageWidth * imageHeight; ++it) {
                    bytes[it * BPP + 0] = file.readByte();
                    bytes[it * BPP + 1] = file.readByte();
                    bytes[it * BPP + 2] = file.readByte();
                    bytes[it * BPP + 3] = file.readByte();
                }
            } else {
                for (int it = 0; it < imageWidth * imageHeight; ++it) {
                    bytes[it * BPP + 0] = file.readByte();
                    bytes[it * BPP + 1] = file.readByte();
                    bytes[it * BPP + 2] = file.readByte();
                    bytes[it * BPP + 3] = -1;
                }
            }

            file.close();

            // Load into OpenGL
            int[] texArray = new int[1];
            gl.glGenTextures(1, texArray, 0);
            int tex = texArray[0];
            gl.glBindTexture(GL2.GL_TEXTURE_2D, tex);
            gl.glTexImage2D(
                    GL2.GL_TEXTURE_2D, 0, GL2.GL_RGBA, imageWidth, imageHeight, 0,
                    GL2.GL_BGRA, GL2.GL_UNSIGNED_BYTE, ByteBuffer.wrap(bytes));
            gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MIN_FILTER, GL2.GL_NEAREST);
            gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MAG_FILTER, GL2.GL_NEAREST);
            gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MIN_FILTER, 
            		GL2.GL_CLAMP_TO_EDGE);
            gl.glTexParameteri(GL2.GL_TEXTURE_2D, GL2.GL_TEXTURE_MAG_FILTER, 
            		GL2.GL_CLAMP_TO_EDGE);
            

            out_size[0] = imageWidth;
            out_size[1] = imageHeight;
            return tex;
        }
        catch (IOException ex) {
            System.err.format("File: %s -- Unexpected end of file.", filename);
            return 0;
        }
    }

    public static void glDrawSprite(GL2 gl, int tex, int x, int y, int w, int h) {
        gl.glBindTexture(GL2.GL_TEXTURE_2D, tex);
        gl.glBegin(GL2.GL_QUADS);
        {
            gl.glColor3ub((byte)-1, (byte)-1, (byte)-1);
            gl.glTexCoord2f(0, 1);
            gl.glVertex2i(x, y);
            gl.glTexCoord2f(1, 1);
            gl.glVertex2i(x + w, y);
            gl.glTexCoord2f(1, 0);
            gl.glVertex2i(x + w, y + h);
            gl.glTexCoord2f(0, 0);
            gl.glVertex2i(x, y + h);
        }
        gl.glEnd();
    }
}