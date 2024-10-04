package pushpak45excepation;

public class Main {
    public static void main(String[] args) {
        //// Problem 1: Policy Application Process
        PolicyApplication policyApp = new PolicyApplication();
        try {
            policyApp.validateAge(25);
            policyApp.validateDrivingRecord(true);
            policyApp.validateHealthRecord(false);
            System.out.println("Policy Application Processed Successfully.");
        } catch (InvalidAgeException | PoorDrivingRecordException | HealthIssueException e) {
            System.err.println("Error in Policy Application: " + e.getMessage());
        }

        // Problem 2: Claim Processing System
        ClaimProcessingSystem claimSystem = new ClaimProcessingSystem();
        try {
            claimSystem.processClaim(-200, false);
        } catch (FraudulentClaimException | InvalidClaimAmountException e) {
            System.err.println("Error in Claim Processing: " + e.getMessage());
        }
        //3


        // Problem 4: Insurance Policy Renewal
        PolicyRenewal renewalSystem = new PolicyRenewal();
        try {
            renewalSystem.renewPolicy(true, false, true);
        } catch (PolicyExpiredException | PaymentPendingException | NonComplianceException e) {
            System.err.println("Error in Policy Renewal: " + e.getMessage());
        }




    }
}
