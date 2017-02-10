package skype.teach.lesson.basics.types;

/**
 *
 */
public class EqualsTeach {
    public static void main(String[] args) {
        Address a1 = new Address("SPb ", 10);
        Address a2 = new Address("SPb ", 10);
        Address a3 = a1;
        Address a4 = new Address(new String("SPb "), 10);
        Address a5 = new Address(null,10);
        Address a6 = new Address(null, 10);
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1.equals("ABC"));
        System.out.println(a1.equals(a4));
        System.out.println(a5.equals(a4));
        System.out.println(a5.equals(a6));
    }
}

class Address {
    private String city;
    private int houseNumber;

    public Address(String city, int houseNumber) {
        this.city = city;
        this.houseNumber = houseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address)) return false;

        Address address = (Address) o;

        if (houseNumber != address.houseNumber) return false;
        return city != null ? city.equals(address.city) : address.city == null;

    }


    //    @Override
    public boolean equals1(Object obj){
//        1. CompareReference (return true if are the same)
//        2. false if obj = null
//        3. false if obj class is not Address
//        4. CompareState

        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (!(obj instanceof Address)){
            return false;
        }
        Address address = (Address) obj;
        if(this.city == null && address.city != null){
            return false;
        }
        if (this.city == null && address.city == null){
            return true;
        }
        if(this.city.equals(address.city) && this.houseNumber == address.houseNumber){
            return true;
        }
        return false;
    }
}
