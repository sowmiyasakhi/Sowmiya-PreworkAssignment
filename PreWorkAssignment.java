import java.util.Scanner;
public class PreWorkAssignment{
Scanner in = new Scanner(System.in);
//fn for palindrome number check
public void checkPalindrome() {
 	 int a,b,c,d=0;
System.out.println("Enter number");
Scanner in = new Scanner(System.in);
b= in.nextInt();
a=b;

do
{
c=a%10;
d=(d*10)+c;
a=a/10;
}
while (a!=0);
System.out.println("The reverse of the given number is "+d);
if (b==d)
System.out.println("The given number is palindrome number.\n");
else
System.out.println("The given number is not palindrome number.\n");
return;
}

//fn to print pattern with given input 
public void printPattern() {  
System.out.println("Enter Number for starting pattern");
Scanner in = new Scanner(System.in);
int rows;
rows = in.nextInt();      
//inner loop  
for (int i= rows-1; i>=0 ; i--)  
{  
//outer loop  
for (int j=0; j<=i; j++)  
{  
//prints star and space  
System.out.print("*" + " ");  
}  
//throws the cursor in the next line after printing each line  
System.out.println();  
}  
}  
  

//fn to prime no check for given number
 public void checkPrimenumber(){
 System.out.println("Enter the number");
    Scanner in =new Scanner(System.in);
    int num;
    num = in.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.\n");
    else
      System.out.println(num + " is not a prime number.\n");
  }
//fn to print fibonacci series with intial 0,1 respect

 public void printFibonacciSeries(){    
 int n1=0,n2=1,n3,i,count; 
 System.out.println("Enter count number");  
Scanner in = new Scanner(System.in);
count = in.nextInt();
 System.out.print(n1+" "+n2);//printing 0 and 1    
    
 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
 {    
  n3=n1+n2;    
  System.out.print(" "+n3);    
  n1=n2;  
  n2=n3;    
 }    
  
}

//switch and dowhile loop

public static void main(String[] args) {
PreWorkAssignment obj = new PreWorkAssignment();
int choice;
Scanner in = new Scanner(System.in); 

do{
System.out.println("\nEnter your choice from list below.\n"+"1.Find palindrome of number.\n"+"2.Print Pattern for given number.\n"+"3.Check the given number is prime number.\n"+"4.Print Fibonacci series.\n"+"-->Enter 0 to EXIT.\n");
System.out.println();
choice = in.nextInt();

switch (choice){
case 0:choice=0;break;
case 1:{obj.checkPalindrome();}break;
case 2:{obj.printPattern();}break;
case 3:{obj.checkPrimenumber();}break;
case 4:{obj.printFibonacciSeries();}break;
default: System.out.println("Invalid choice. Enter a valid no.\n");
}

}while(choice!=0);
System.out.println("Exited Successfully!!!");

in.close();

}
}


