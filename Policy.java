public class Policy {
    private String policyNumber;
    private String providerName;
    private PolicyHolder policyHolder; // Policy HAS-A PolicyHolder (Class Collaboration)

    // Static field to track total Policy objects created
    private static int policyCount = 0;

    /**
     * Constructor for Policy
     */
    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        
        // Step 2: Added toString method for Policy
        
        // Security consideration: create a deep copy of PolicyHolder to prevent security holes / aliasing
        this.policyHolder = new PolicyHolder(policyHolder);
        
        // Increment static policy count whenever a Policy object is created
        policyCount++;
    }

    // Getters and Setters
    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }

    public String getProviderName() { return providerName; }
    public void setProviderName(String providerName) { this.providerName = providerName; }

    // Security consideration: return a deep copy instead of direct reference
    public PolicyHolder getPolicyHolder() {
        return new PolicyHolder(policyHolder);
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = new PolicyHolder(policyHolder);
    }

    /**
     * Returns static count of total Policy objects created
     */
    public static int getPolicyCount() {
        return policyCount;
    }

    /**
     * Calculates price based on PolicyHolder attributes
     */
    public double getPrice() {
        double price = 600.00;

        if (policyHolder.getAge() > 50) {
            price += 75.00;
        }

        if (policyHolder.getSmokingStatus().equalsIgnoreCase("smoker")) {
            price += 100.00;
        }

        double bmi = policyHolder.getBMI();
        if (bmi > 35) {
            price += (bmi - 35) * 20;
        }

        return price;
    }

    /**
     * toString method for Policy (implicitly calls policyHolder.toString())
     */
    @Override
    public String toString() {
        return String.format("Policy Number: %s\n" +
                             "Provider Name: %s\n" +
                             "%s\n" +
                             "Policy Price: $%.2f\n",
                             policyNumber, providerName, policyHolder.toString(), getPrice());
    }
}