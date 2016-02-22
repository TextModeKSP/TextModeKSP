package main;

import java.awt.*;

import javax.swing.*;

public class Main {
	
	static long memAvailableMiB = Runtime.getRuntime().totalMemory() / 1048576;
	
	public static void main(String args[])
	{
		
		System.out.println("TextModeKSP - build 1");
		System.out.println("System information:");
		System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
	    System.out.println("Total memory available to JVM (MiB): " + Main.memAvailableMiB);
		
	}
	
	public newWindow extends Frame {
		
			setTitle("Text Mode KSP"); // Set the title
		    setSize(400,400); // Set size to the frame
		    setVisible(true); // Make the frame visible
		    setBackground(Color.red); // Set the background
		    setExtendedState(MAXIMIZED_BOTH); // Make the frame maximized
		    setCursor(Cursor.HAND_CURSOR); // Deprecated
		
	}
	
}

