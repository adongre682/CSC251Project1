import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class PolicyDemo{
   public static void main(String[] args) {
   ArrrayList<Policy> policyList = newArrayList<>();
   int smokerCount = 0;
   int nonSmokerCount = 0;
   
   //Step 2: Added toString method for PolicyHolder 
   
   try {
     File file = new File("PolicyInformation.txt");
     Scanner scanner = new Scanner(file);
     
     while (scanner.hasNext()) {
                String policyNumber = scanner.nextLine().trim();
                String providerName = scanner.nextLine().trim();
                String firstName = scanner.nextLine().trim();
                String lastName = scanner.nextLine().trim();
                int age = Integer.parseInt(scanner.nextLine().trim());
                String smokingStatus = scanner.nextLine().trim();
                double height = Double.parseDouble(scanner.nextLine().trim());
                double weight = Double.parseDouble(scanner.nextLine().trim());

                if (scanner.hasNextLine()) {
                    scanner.nextLine(); // Clear empty line between records
                }

                if (smokingStatus.equalsIgnoreCase("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }

                PolicyHolder holder = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
                Policy policy = new Policy(policyNumber, providerName, holder);
                policyList.add(policy);
            }
            scanner.close();

            // Step 6: Implicitly calls toString()
            for (Policy p : policyList) {
                System.out.println(p); 
            }

            // Step 7: Display counts
            System.out.println("There were " + Policy.getPolicyCount() + " Policy objects created.");
            System.out.println("The number of policies with a smoker is: " + smokerCount);
            System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}