import java.util.Scanner;
class SwitchCaseExample{
public static void main(String []args){
Scanner sc = new Scanner(System.in);
int a;
System.out.println("Enter a Number: ");
a = sc.nextInt();

switch(a){
case 1 : System.out.print("HELLO WORLD !!");
 break;
 case 2 : System.out.print("HELLO JAVA !!");
 break;
 default : System.out.print("HEYYYYYY !!");
 break;
 }
 
 sc.close();
} 
}
