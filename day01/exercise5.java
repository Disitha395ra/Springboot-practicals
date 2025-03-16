/*5)Reverse the left and right numbers like
You must use only a loop
input  9
output 4 3 2 1 5 9 8 7 6

input 13
output 6 5 4 3 2 1 7 13 12 11 10 9 8*/
import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        sc.close();
        int left = n/2;
        for(int i= left; i>=1; i--){
            System.out.print(i+" ");
        }
        for(int j=n; j>left; j--){
            System.out.print(j+" ");
        }

    }
    
}
