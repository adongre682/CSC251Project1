import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Project_Arya_Dongre
{
   public static void main(String[] args) throws FileNotFoundException
   {
      Scanner input = new Scanner(new File("PolicyInformation.txt"));
      ArrayList<Policy> policies = new ArrayList<Policy>();

      int policyNumber;
      String providerName;
      String policyholderFirstName;
      String policyholderLastName;
      int policyholderAge;
      String policyholderSmokingStatus;
      double policyholderHeight;
      double policyholderWeight;
      
      while (input.hasNext())
      {
         policyNumber = input.nextInt();
         input.nextLine();

         providerName = input.nextLine();
         policyholderFirstName = input.nextLine();
         policyholderLastName = input.nextLine();

         policyholderAge = input.nextInt();
         input.nextLine();

         policyholderSmokingStatus = input.nextLine();

         policyholderHeight = input.nextDouble();
         policyholderWeight = input.nextDouble();

         Policy policy = new Policy(policyNumber, providerName, policyholderFirstName,
                                    policyholderLastName, policyholderAge,
                                    policyholderSmokingStatus, policyholderHeight,
                                    policyholderWeight);

         policies.add(policy);
      }
      
      int smokerCount = 0;
      int nonSmokerCount = 0;
      
      for (Policy policy : policies)
      {
                                       
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
      
         if (policy.getPolicyholderSmokingStatus().equals("smoker"))
         {
           smokerCount++;
        }
        else
        {
           nonSmokerCount++;
        }
     }
   
    System.out.println("The number of policies with a smoker is: " + smokerCount);
    System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
  }
}