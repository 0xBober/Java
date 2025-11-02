package methods;

public abstract class ContactMethod {
    private String label; //private or company
    private boolean isPrimary;

    public ContactMethod(String label, Boolean isPrimary) {
        this.label = label;
        this.isPrimary = isPrimary;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public boolean getIsPrimary() {
        return isPrimary;
    }

    public void setIsPrimary(boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    //Used only for debugging
    @Override
    public String toString() {
        return String.format("Label: %s, Primary: %s", label, isPrimary);
    }
}
