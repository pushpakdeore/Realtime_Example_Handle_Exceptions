package pushpak45excepation;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class PoorDrivingRecordException extends Exception {
    public PoorDrivingRecordException(String message) {
        super(message);
    }
}

class HealthIssueException extends Exception {
    public HealthIssueException(String message) {
        super(message);
    }
}
public class PolicyApplication {
    public void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 75) {
            throw new InvalidAgeException("Invalid Age for Policy Application: " + age);
        }
    }

    public void validateDrivingRecord(boolean hasPoorDrivingRecord) throws PoorDrivingRecordException {
        if (hasPoorDrivingRecord) {
            throw new PoorDrivingRecordException("Applicant has a poor driving record.");
        }
    }

    public void validateHealthRecord(boolean hasHealthIssues) throws HealthIssueException {
        if (hasHealthIssues) {
            throw new HealthIssueException("Applicant has health issues.");
        }
    }


}

