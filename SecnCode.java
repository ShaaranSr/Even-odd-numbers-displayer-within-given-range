package basicProblems;
import java.util.ArrayList;
import java.util.Scanner;
public class SecnCode  {
public static void main(String[] args) {
	 ArrayList<Integer> myEven = new ArrayList<Integer>();
	 ArrayList<Integer> myOdd = new ArrayList<Integer>();
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int num1= sc.nextInt();
System.out.print("Enter Second number: ");
int num2= sc.nextInt();
for(int i=num1;i<=num2;i++) {
     if(i%2==0){
    	 myEven.add(i);
     }
     else {
    	 myOdd.add(i);
     }
      
    }  System.out.print("Even: ");
       for (int j : myEven) {
        System.out.print(" "+j);
      } 
       System.out.println("");
       System.out.print("Odd: ");
         for (int k : myOdd) {
        System.out.print(" "+k);
      } sc.close();
}
}
