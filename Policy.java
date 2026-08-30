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

  public void setPolicyNumber(int policyNumber)
   {
      this.policyNumber = policyNumber;
   }

   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }

   public void setPolicyholderFirstName(String policyholderFirstName)
   {
      this.policyholderFirstName = policyholderFirstName;
   }

   public void setPolicyholderLastName(String policyholderLastName)
   {
      this.policyholderLastName = policyholderLastName;
   }

   public void setPolicyholderAge(int policyholderAge)
   {
      this.policyholderAge = policyholderAge;
   }

   public void setPolicyholderSmokingStatus(String policyholderSmokingStatus)
   {
      this.policyholderSmokingStatus = policyholderSmokingStatus;
   }

   public void setPolicyholderHeight(double policyholderHeight)
   {
      this.policyholderHeight = policyholderHeight;
   }

   public void setPolicyholderWeight(double policyholderWeight)
   {
      this.policyholderWeight = policyholderWeight;
   }

   public int getPolicyNumber()
   {
      return policyNumber;
   }

   public String getProviderName()
   {
      return providerName;
   }

   public String getPolicyholderFirstName()
   {
      return policyholderFirstName;
   }

   public String getPolicyholderLastName()
   {
      return policyholderLastName;
   }

   public int getPolicyholderAge()
   {
      return policyholderAge;
   }

   public String getPolicyholderSmokingStatus()
   {
      return policyholderSmokingStatus;
   }

   public double getPolicyholderHeight()
   {
      return policyholderHeight;
   }

   public double getPolicyholderWeight()
   {
      return policyholderWeight;
   }

   public double calculateBMI()
   {
      return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
   }
   
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
      