package pushpak45excepation;

import java.nio.file.FileAlreadyExistsException;

class FraudulentClaimException extends Exception{
    FraudulentClaimException(String msg){
        super(msg);
    }
}
class InvalidClaimAmountException extends Exception{
    InvalidClaimAmountException(String msg){
        super(msg);
    }
}

public class ClaimProcessingSystem  {
    public void processClaim (double claimAmount, boolean isFraudulentClaim) throws FraudulentClaimException, InvalidClaimAmountException {
        if (isFraudulentClaim) {
            throw new FraudulentClaimException("Fraudulent claim detected.");
        }

        if (claimAmount <= 0 || claimAmount > 50000) {
            throw new InvalidClaimAmountException("Claim amount is invalid.");
        }

        System.out.println("Claim processed successfully for amount: " + claimAmount);
    }
}
