import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Aufgabe1 {

	public static void main(String[] args) throws IOException {
int sum=0;
BufferedReader einlesen=new BufferedReader(new InputStreamReader(System.in));
		
		int []a=new int[10];
		System.out.println("bitte zehn Integer-Werte eingeben!");
		
		
		
		
		
		
		for(int i=0;i<a.length;i++) {
	
			a[i]=Integer.parseInt(einlesen.readLine());
			sum+=a[i];
			
		}

		
	System.out.println("die summe der Werte ist : "+sum);
		
		
	}

}
