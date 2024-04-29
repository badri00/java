package electricity.app;
import electricity.app.*;


public class Customer {
    private int id;
    private String name;
    private String mobile;
    private String email;
    private String password;
    private String address;

    public Customer(int id, String name, String mobile, String email, String password, String address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getAddress() {
        return address;
    }
}