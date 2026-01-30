import java.util.Scanner;
class ArrayExample{
public static void main(String []args){
	Scanner sc=new Scanner(System.in);
int age[] = {10,20,30,40,50,60};
System.out.println("Using for each loop: ");
for(int i : age){
	System.out.println(""+i);
}

System.out.println(age[1]); //accesing element at specific index
System.out.println("Update Array elments: ");
age[3]=100; //Update element by their index

System.out.println("Array Elements: ");
for (int i=0;i<age.length;i++){
System.out.println(age[i]); //printing elements
}
System.out.println("Enter your element: ");
int m=sc.nextInt();
for(int i=0;i<age.length;i++){
	if(age[i]==m){
		System.out.println("Number found at index: " +i); //index specific elelement
}
}
}
}
