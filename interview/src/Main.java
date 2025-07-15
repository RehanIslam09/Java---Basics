import java.util.Scanner;

public class Main {

    public static void main(String [] args){

        int num = 1000;
        for(int i = 0; i < num; i++){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to be checked: ");
        int number = scanner.nextInt();
        if (number == 0){
            System.out.println("It's not a prime number");
        }
        else if (number == 2){
            System.out.println("It's a prime number");
        }
        else if(number % 2 == 0){
            System.out.println("Even numbers except 2 are not prime");
        } else if (number % num == 0) {
            System.out.println("Not prime");
        }

        scanner.close();
    }
}
