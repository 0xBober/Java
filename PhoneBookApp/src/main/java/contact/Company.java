package contact;

import methods.ContactMethod;
import utils.TagType;

public class Company extends Contact{

    private String name;
    private String industry;
    private TagType tag;

    public Company(String name, String industry, TagType tag, ContactMethod contactMethod) {
        super(name, contactMethod);
        this.name = name;
        this.industry = industry;
        this.tag = tag;
    }

    public String getTag() {
        return tag.toString();
    }

    public void setTag(String tag) {
        this.tag = TagType.valueOf(tag);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Industry: %s, Tag: %s", name, industry, tag.toString());
    }
}
