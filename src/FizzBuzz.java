import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scanner.nextInt();

        boolean isNullByThree = number % 3 == 0;
        boolean isNullByFive = number % 5 == 0;
        boolean isNullByThreeAndFive = isNullByThree && isNullByFive;
        String castedNumber = String.valueOf(number);
    

        String fizzBuzz = isNullByThreeAndFive ? "FizzBuzz" : isNullByFive ? "Buzz" : isNullByThree ? "Fizz" : castedNumber;
        System.out.println(fizzBuzz);
        System.out.println(" ");

    }
}
