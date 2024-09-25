import java.util.Scanner;
public class CheckEligibility{
    public static void main(String[] args) {
        int age;
        float weight;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = Sc.nextInt();
        System.out.println("Enter your weight:");
        weight = Sc.nextFloat();
        if(age>=18)
        {
            System.out.println("You are an adult.");
            if(weight>=40)
            {
                System.out.println("You are eligible to donate blood.");
            }
            else
            {
                System.out.println("You are underweight and not eligible to donate blood.");
            }
        }else
        {
            System.out.println("You are not an adult.");
        }
        Sc.close();
    }
}
