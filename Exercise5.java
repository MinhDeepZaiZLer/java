package chapter1;

import java.util.*;

public class Exercise5 {
	public static void main(String[] args) {
		double r;
		final float pi=3.1415f;
		Scanner k=new Scanner(System.in);
		System.out.println("Input radius r= ");
		r=k.nextDouble();
		System.out.println("Circle area= "+r*r*pi);
		System.out.println("Circle perimeter= "+2*r*pi);
		
	}

}
