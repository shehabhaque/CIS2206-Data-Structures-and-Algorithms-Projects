import java.util.*;
public class PhoneBookEntry {

    // declaring variales of phone book
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String homeAddress;
    private String emailAddress;

    // constructor to add information to the phonebook
    public PhoneBookEntry(String f_name,String l_name ,String phone_no, String home_address,String email_address) {

        this.firstName = f_name;
        this.lastName = l_name;
        this.phoneNumber = phone_no;
        this.homeAddress = home_address;
        this.emailAddress = email_address;

    }

    // method to get the information to the phonebook
    public String getName() {
        return firstName;
    }
    public String getEmail() {
        return emailAddress;
    }
    public String getAddress() {
        return homeAddress;
    }
    public void setPhone_number(String phone_number) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.emailAddress = emailAddress;
    }
    public String getSurname() {
        return lastName;
    }

    // method to return a string representation of the phone book entry
    @Override
    public String toString() {
        return "\nPhoneBookEntry:" +
                "\nFirst Name: " + firstName  +
                "\nSurname: " + lastName +
                "\nPhone no: " + phoneNumber +
                "\nAddress: " + homeAddress +
                "\nEmail: " + emailAddress;
    }
}
