import java.util.Scanner;
class ArraySum{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
System.out.print("Enter the number of elemnet :");
int num = sc.nextInt();

    int[] marks = new int[num];
    for(int i = 0 ; i < num  ; i++){
        marks[i] = sc.nextInt();
    }
    int sum = 0 ;
    for (int i = 0 ; i<num ; i++){
        sum = sum+marks[i];
       
    }
    System.out.print(sum);


    }
}