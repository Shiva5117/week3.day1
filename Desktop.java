package org.system;

public class Desktop extends Computer{
	
	public void desktopSize(int inch) {
		
		System.out.println("\nSize of Desktop: "+inch +" inch");
	}

	public static void main(String[] args) {
		
		//Creating object for Computer class
		Computer model = new Computer();
		model.computerModel("HP");
		
		//Creating object for Desktop class
		Desktop size = new Desktop();
		size.desktopSize(55);

	}

}
