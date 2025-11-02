package ObjAndClassPK;

public class HomeAddress {
    public String address;

    public HomeAddress() {
        this.address = "";
    }

    public HomeAddress(String address1) {
        this.address = address1;
    }

    @Override
    public String toString(){
        return this.address;
    }
}
