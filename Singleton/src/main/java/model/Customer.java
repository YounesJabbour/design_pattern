package model;

public class Customer {

    private String name;
    private String address;
    private String phone;
    private String email;
    private final static Customer instance;

    static  {
        instance = new Customer();
    }

    private Customer() {
    }

    public synchronized static Customer getInstance() {
        return instance;
    }
}
