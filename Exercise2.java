package chapter1;
import java.util.*;

public class Exercise2 {
	 public static void main(String[] args) {
	
		  byte ASCIIcode;
		  Scanner keyboard = new Scanner(System.in);
		  System.out.print("Input an ASCII code: ");
		  ASCIIcode = keyboard.nextByte();
		  System.out.println("ASCII code "+ASCIIcode +"is" + (char)ASCIIcode);
		  
	 }

}
