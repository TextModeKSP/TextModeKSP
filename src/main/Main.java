package main;

import java.awt.*;

import javax.swing.*;

public class Main extends Frame {
	
	static long memAvailableMiB = Runtime.getRuntime().totalMemory() / 1048576;
	
	public Main (String Title){
		
		super();
		
		this.setTitle(Title);
		
		this.setVisible(true);
		
		this.setSize(1024,768);
		
	}
	
	
	
	public static void main(String args[])
	{
		
		Main window = new Main("Text Mode KSP");
		
		System.out.println("TextModeKSP - build 1");
		System.out.println("System information:");
		System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
	    System.out.println("Total memory available to JVM (MiB): " + Main.memAvailableMiB);
		
	}
	
	
	
}

