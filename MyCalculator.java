import java.util.Scanner;

public class MyCalculator {
    public static void main(String[] args) {
        Scanner joseph = new Scanner(System.in);

        String[] names = new String[5];
        int[] ages = new int[5];

        
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter the name of your family member " + (i + 1) + ":");
            names[i] = joseph.nextLine();

            System.out.println("\nEnter the Age:");
            ages[i] = joseph.nextInt();
            joseph.nextLine();  
        }
        StringBuilder output = new StringBuilder();
        output.append("\nFamily members:\n");
        for (int i = 0; i < 5; i++) {
            output.append(names[i] + " (" + ages[i] + ")\n");
        }
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = (double) sum / 5;
        output.append("\nSum of Ages:" + sum + "\n");
        output.append("Average Age:" + averageAge + "\n");

       
        if (averageAge > 60) {
            output.append("The family is mature:\n");
        } else {
            output.append("The family is young:\n");
        }
        System.out.println("\nPress 'p' to print");
        char key = joseph.next().charAt(0);  
        if (key == 'p') {
            System.out.println(output.toString());
        } else {
            System.out.println("Invalid key. Please press 'p' to view the results.");
        }
    }
}
