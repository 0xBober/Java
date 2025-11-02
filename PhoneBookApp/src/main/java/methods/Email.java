package methods;

public class Email extends ContactMethod{

    private String email;

    public Email(String email, String label, Boolean isPrimary) {
        super(label, isPrimary);
        this.email = validateEmail(email);
    }

    private String validateEmail(String email){
        email = email.trim().toLowerCase();
        if(email.matches("^[\\w._%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$")){
            return email;
        }else{
            System.out.printf("Invalid email %s\n", email);
            return "example@email.com";
        }
    }

    public void  setEmail(String email){
        this.email = validateEmail(email);
    }

    @Override
    public String toString() {
        return String.format("%s (%s%s)",
                email,
                getLabel(),
                getIsPrimary() ? ", primary" : "");
    }
}
