package contact;

import methods.ContactMethod;

import java.time.LocalDateTime;

public abstract class Contact {
    private static int nextID = 1; //shared counter for all contacts

    protected int id;
    protected String displayName;
    protected LocalDateTime createdAt;
    protected LocalDateTime updatedAt;
    protected ContactMethod contactMethod;


    public Contact(String displayName, ContactMethod contactMethod) {
        this.id = nextID++;
        this.displayName = displayName;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.contactMethod = contactMethod;
    }

    public int getID() {
        return id;
    }
}
