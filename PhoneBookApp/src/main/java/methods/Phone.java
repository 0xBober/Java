package methods;

public class Phone extends ContactMethod{

    private String phoneNumber;

    public Phone(String phoneNumber, String label, Boolean isPrimary) {
        super(label, isPrimary);
        this.phoneNumber = validatePhoneNumber(phoneNumber);
    }

    private String validatePhoneNumber(String phoneNumber) {
        // Remove all non-digit characters
        phoneNumber = phoneNumber.replaceAll("\\D", "");

        if (phoneNumber.length() == 9) {
            // Format as XXX-XXX-XXX
            return String.format("%s-%s-%s",
                    phoneNumber.substring(0, 3),
                    phoneNumber.substring(3, 6),
                    phoneNumber.substring(6));
        } else {
            System.out.printf("Invalid phone number: %s\n", phoneNumber);
            return "000-000-000";
        }
    }


    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = validatePhoneNumber(phoneNumber);
    }


    @Override
    public String toString() {
        return String.format("%s (%s%s)",
                phoneNumber,
                getLabel(),
                getIsPrimary() ? ", primary" : "");
    }

}
