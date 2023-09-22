package chapter1;
import java.util.*;
public class Exercise8 {
	public static void main(String[] args) {
	double w,h;
	Scanner k=new Scanner(System.in);
	System.out.println("Input wwidth of a rectangle: ");
	w=k.nextDouble();
	System.out.println("Input high of a rectangle: ");
	h=k.nextDouble();
	System.out.println("Rectangle's area: "+w*h);
	System.out.println("Rectangle's perimeter: "+(w+h)*2);
	}
}
