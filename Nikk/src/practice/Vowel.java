package practice;
import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  character");
		char ch=s.next().charAt(0); 
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A'|| ch=='E'|| ch=='I' || ch=='O'|| ch=='U')
		{
			System.out.println("character is ovwel");
		}
		else
		{
			System.out.println("character is cosanant");
		
		
		}

	}

}
