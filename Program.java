import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
       
        Scanner calculate = new Scanner(System.in);

      
        System.out.println("Enter number 1: ");
        int num1 = calculate.nextInt();
        System.out.println(" ");
        
        System.out.println("Enter number 2: ");
        int num2 = calculate.nextInt();

    
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double avg = (num1 + num2)/2.0;
        int distance = Math.abs(difference);
        int max = (num1 + num2 + Math.abs(num1 - num2))/2;
        int min = (num1 + num2 - Math.abs(num1 -num2))/2;
        
        
        
        System.out.println(" ");
        System.out.println("Original numbers are " + num1 + " and " + num2);
        System.out.println(" ");
        System.out.println("Sum = " + sum);
        System.out.println(" ");
        System.out.println("Difference = " + difference);
        System.out.println(" ");
        System.out.println("Product = " + product);
        System.out.println(" ");
        System.out.println("Average = " + avg);
        System.out.println(" ");
        System.out.println("Absolute value = " + distance);
        System.out.println(" ");
        System.out.println("Maximum = " + max);
        System.out.println(" ");
        System.out.println("Minimum = " + min);
        
        

        
        calculate.close();
    }
}

//console output:
/*Enter number 1: 
13
 
Enter number 2: 
20
 
Original numbers are 13 and 20
 
Sum = 33
 
Difference = -7
 
Product = 260
 
Average = 16.5
 
Absolute value = 7
 
Maximum = 20
 
Minimum = 13
/*


*/
