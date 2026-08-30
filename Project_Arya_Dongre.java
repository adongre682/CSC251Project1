import java.util.Scanner;

public class Project_Arya_Dongre
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int policyNumber;
      String providerName;
      String policyholderFirstName;
      String policyholderLastName;
      int policyholderAge;
      String policyholderSmokingStatus;
      double policyholderHeight;
      double policyholderWeight;
      
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Provider Name; ");
      providerName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's First Name: ");
      policyholderFirstName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Last Name: ");
      policyholderLastName = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Age: ");
      policyholderAge = keyboard.nextInt();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      policyholderSmokingStatus = keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      policyholderHeight = keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder's Weight (in pounds): ");
      policyholderWeight = keyboard.nextDouble();
      
      Policy policy = new Policy(policyNumber, providerName, policyholderFirstName,
                                 policyholderLastName, policyholderAge,
                                 policyholderSmokingStatus, policyholderHeight, 
                                 policyholderWeight);
                                 
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getPolicyholderFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getPolicyholderLastName());
      System.out.println("Policyholder's Age: " + policy.getPolicyholderAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getPolicyholderSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getPolicyholderHeight() + "inches");
      System.out.println("Policyholder's Weight: " + policy.getPolicyholderWeight() + "pounds");
      System.out.printf("Policyholder's BMI: %.2f%n", policy.calculateBMI());
      System.out.printf("Policy Price: $%.2f%n", policy.calculatePolicyPrice());
  
   }
}