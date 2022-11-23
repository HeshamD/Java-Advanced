package Collections;

public class Customer implements Comparable<Customer>{ // we need to compare a customer with another
    private String name;
    private String email;

    public Customer(String name,String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer otherCustomer) {

        // we need to compare between to objects./
        // if this object is smaller the other object return -1
        // == 0
        // if this object greater than the other 1

        // but on what basis/characteristics we going to compare these two objects
                // in this case we have the name so we comparing names
        return name.compareTo(otherCustomer.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
