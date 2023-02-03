package atos;
import java.util.Scanner;

public class Exercice {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("entrer un nombre : ");
        int userEntry = scanner.nextInt();
        
        System.out.println("======= multiplication table =======");
        
        for(int i = 0; i <= 10; i++) {
            System.out.println(userEntry + "x" + i + "=" + userEntry*i);
        }
        
        System.out.println("====== factorial number =======");
        
        int factorial = userEntry;
        int i = 1;
        while(i<userEntry) {
            if(userEntry == 0 || userEntry == 1) {
                factorial = 1;
                break;
            }
            factorial = factorial * (userEntry - i);
            i++;
        }
        
        System.out.println(userEntry +"! = " + factorial);
        
        System.out.println("====== fibonacci =======");
        
        i = 1;
        int fib = 0;
        do{
            System.out.println(fib);
            fib += i;
            i++;
        }while(i<userEntry);
        

	}

}
