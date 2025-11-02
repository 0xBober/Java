package contact;

import methods.ContactMethod;
import utils.TagType;

import java.time.LocalDate;

public class Person extends Contact{

    private String firstName;
    private String lastName;
    private LocalDate birthDate; //optional
    private TagType tag;

    public Person(String firstName, String lastName, LocalDate birthDate, TagType tag, ContactMethod contactMethod) {
        super(firstName + " " + lastName, contactMethod);
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.tag = tag;
    }

    public String getTag() {
        return tag.toString();
    }

    public void setTag(String tag) {
        this.tag = TagType.valueOf(tag);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return String.format("First Name: %s, Last Name: %s, Birth Day: %s, Tag: %s", firstName, lastName,  birthDate.toString(), tag.toString());
    }
}
