package pushpak45excepation;
class PolicyExpiredException extends Exception {
    public PolicyExpiredException(String message) {
        super(message);
    }
}

class PaymentPendingException extends Exception {
    public PaymentPendingException(String message) {
        super(message);
    }
}

class NonComplianceException extends Exception {
    public NonComplianceException(String message) {
        super(message);
    }
}
public class PolicyRenewal {
    public void renewPolicy(boolean isPolicyExpired, boolean isPaymentPending, boolean isCompliant)
            throws PolicyExpiredException, PaymentPendingException, NonComplianceException {
        if (isPolicyExpired) {
            throw new PolicyExpiredException("The policy has expired.");
        }

        if (isPaymentPending) {
            throw new PaymentPendingException("Payment is pending for renewal.");
        }

        if (!isCompliant) {
            throw new NonComplianceException("Policyholder is non-compliant with renewal terms.");
        }

        System.out.println("Policy renewed successfully.");
    }
}
