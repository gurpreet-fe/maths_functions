import java.util.Scanner;

class Maths 
{ 
    // Your program begins with a call to main(). 
    public static void main(String args[]) 
    {
        // // Prints "Hello, World" to the terminal window.
        // System.out.println("Hello, World");

        Scanner sc = new Scanner(System.in);

        System.out.println("Addition? ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num1 + " + " + num2 + " = " + addition(num1, num2));

        System.out.println("Substraction? ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(num1 + " - " + num2 + " = " + substraction(num1, num2));

        System.out.println("Multiplication? ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(num1 + " * " + num2 + " = " + multiplication(num1, num2));

        System.out.println("Division? ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println(num1 + " / " + num2 + " = " + division(num1, num2));

        sc.close();
    }

    public static int addition(int num1, int num2) {
        return (num1 + num2);
    }

    public static int substraction(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static int division(int num1, int num2) {
        return num1 / num2;
    }
} 
