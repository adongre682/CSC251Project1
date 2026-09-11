public class Policy
{
   private int policyNumber;
   private String providerName; 
   private String policyholderFirstName;
   private String policyholderLastName;
   private int policyholderAge;
   private String policyholderSmokingStatus;
   private double policyholderHeight;
   private double policyholderWeight;
   
   /**
    * Creates a Policy object with default values.
    */
   public Policy()
   {
      policyNumber = 0;
      providerName = "";
      policyholderFirstName = "";
      policyholderLastName = "";
      policyholderAge = 0;
      policyholderSmokingStatus = "";
      policyholderHeight = 0.0;
      policyholderWeight = 0.0;
   }
   
   /**
    * Creates a Policy object with the specified policy information.
    * @param policyNumber the policy number
    * @param providerName the name of the provider
    * @param policyholderFirstName the policyholder's first name
    * @param policyholderLastName the policyholder's last name
    * @param policyholderAge the policyholder's age
    * @param policyholderSmokingStatus the policyholder's smoking status
    * @param policyholderHeight the policyholder's height in inches
    * @param policyholderWeight the policyholder's weight in pounds
    */
   public Policy(int policyNumber, String providerName, String policyholderFirstName,
                 String policyholderLastName, int policyholderAge,
                 String policyholderSmokingStatus, double policyholderHeight,
                 double policyholderWeight)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.policyholderFirstName = policyholderFirstName;
      this.policyholderLastName = policyholderLastName;
      this.policyholderAge = policyholderAge;
      this.policyholderSmokingStatus = policyholderSmokingStatus;
      this.policyholderHeight = policyholderHeight;
      this.policyholderWeight = policyholderWeight;
   }

   /**
    * Sets the policy number.
    * @param policyNumber the policy number
    */
   public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   /**
    * Sets the provider name.
    * @param providerName the name of the provider
    */
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }

   /**
    * Sets the policyholder's first name.
    * @param policyholderFirstName the policyholder's first name
    */
   public void setPolicyholderFirstName(String policyholderFirstName)
   {
      this.policyholderFirstName = policyholderFirstName;
   }

   /**
    * Sets the policyholder's last name.
    * @param policyholderLastName the policyholder's last name
    */
   public void setPolicyholderLastName(String policyholderLastName)
   {
      this.policyholderLastName = policyholderLastName;
   }

   /**
    * Sets the policyholder's age.
    * @param policyholderAge the policyholder's age
    */
   public void setPolicyholderAge(int policyholderAge)
   {
      this.policyholderAge = policyholderAge;
   }

   /**
    * Sets the policyholder's smoking status.
    * @param policyholderSmokingStatus the policyholder's smoking status
    */
   public void setPolicyholderSmokingStatus(String policyholderSmokingStatus)
   {
      this.policyholderSmokingStatus = policyholderSmokingStatus;
   }

   /**
    * Sets the policyholder's height.
    * @param policyholderHeight the policyholder's height in inches
    */
   public void setPolicyholderHeight(double policyholderHeight)
   {
      this.policyholderHeight = policyholderHeight;
   }

   /**
    * Sets the policyholder's weight.
    * @param policyholderWeight the policyholder's weight in pounds
    */
   public void setPolicyholderWeight(double policyholderWeight)
   {
      this.policyholderWeight = policyholderWeight;
   }

   /**
    * Gets the policy number.
    * @return the policy number
    */
   public int getPolicyNumber()
   {
      return policyNumber;
   }

   /**
    * Gets the provider name.
    * @return the provider name
    */
   public String getProviderName()
   {
      return providerName;
   }

   /**
    * Gets the policyholder's first name.
    * @return the policyholder's first name
    */
   public String getPolicyholderFirstName()
   {
      return policyholderFirstName;
   }

   /**
    * Gets the policyholder's last name.
    * @return the policyholder's last name
    */
   public String getPolicyholderLastName()
   {
      return policyholderLastName;
   }

   /**
    * Gets the policyholder's age.
    * @return the policyholder's age
    */
   public int getPolicyholderAge()
   {
      return policyholderAge;
   }

   /**
    * Gets the policyholder's smoking status.
    * @return the policyholder's smoking status
    */
   public String getPolicyholderSmokingStatus()
   {
      return policyholderSmokingStatus;
   }

   /**
    * Gets the policyholder's height.
    * @return the policyholder's height in inches
    */
   public double getPolicyholderHeight()
   {
      return policyholderHeight;
   }

   /**
    * Gets the policyholder's weight.
    * @return the policyholder's weight in pounds
    */
   public double getPolicyholderWeight()
   {
      return policyholderWeight;
   }

   /**
    * Calculates the policyholder's BMI.
    * @return the policyholder's BMI
    */
   public double calculateBMI()
   {
      return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
   }
   
   /**
    * Calculates the policy price.
    * @return the policy price
    */
   public double calculatePolicyPrice()
   {
      double price = 600.0;

      if (policyholderAge > 50)
      {
         price += 75.0;
      }

      if (policyholderSmokingStatus.equals("smoker"))
      {
         price += 100.0;
      }

      double bmi = calculateBMI();

      if (bmi > 35)
      {
         price += (bmi - 35) * 20;
      }

      return price;
   }
}  