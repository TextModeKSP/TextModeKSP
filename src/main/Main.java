package main;

public class Main {
	
	static long memAvailableMiB = Runtime.getRuntime().totalMemory() / 1048576;
	
	public static void main(String args[])
	{
		
		System.out.println("TextModeKSP - build 1");
		System.out.println("System information:");
		System.out.println("Available processors (cores): " + Runtime.getRuntime().availableProcessors());
	    System.out.println("Total memory available to JVM (MiB): " + Main.memAvailableMiB);
		
	}
	
}

