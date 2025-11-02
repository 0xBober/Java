package methods;

public class Address extends ContactMethod{
    private String country;
    private String city;
    private String street;
    private String postalCode;

    public Address(String country, String city, String street, String postalCode, String label, Boolean isPrimary) {
        super(label, isPrimary);
        this.country = country;
        this.city = city;
        this.street = street;
        this.postalCode = validatePostalCode(postalCode);
    }

    private String validatePostalCode(String postalCode) {
        // Check format: two digits, dash, three digits (e.g., "12-345")
        if (postalCode.matches("\\d{2}-\\d{3}")) {
            return postalCode;
        } else {
            System.out.println("Postal code is incorrect. Expected format: 12-345");
            return "00-000"; // default fallback
        }
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = validatePostalCode(postalCode);
    }

    public void updateAddress(String... parts) {
        if (parts == null || parts.length == 0) return;

        String[] values;
        if (parts.length == 1 && parts[0] != null && parts[0].contains(",")) {
            values = parts[0].split(",");
        } else {
            values = parts;
        }

        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) values[i] = values[i].trim();
        }

        if (values.length > 0 && values[0] != null && !values[0].isBlank()) setCountry(values[0]);
        if (values.length > 1 && values[1] != null && !values[1].isBlank()) setCity(values[1]);
        if (values.length > 2 && values[2] != null && !values[2].isBlank()) setStreet(values[2]);
        if (values.length > 3 && values[3] != null && !values[3].isBlank()) setPostalCode(values[3]);
    }

    @Override
    public String toString() {
        return String.format(
                "%s, %s, %s, %s (%s%s)",
                street,
                city,
                postalCode,
                country,
                getLabel(),
                getIsPrimary() ? ", primary" : ""
        );
    }

}
