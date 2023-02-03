import java.util.*;

public class PhoneBook {

    Map < String, PhoneBookEntry > phoneBookMap;
    public PhoneBook() {
        this.phoneBookMap = new HashMap();
    }

    // input function to store information in phonebook
    public void inputPhoneBookEntry(String f_name, String l_name, String phone_no, String home_address, String email_address){
        PhoneBookEntry phone_book_entries = new PhoneBookEntry(f_name,l_name, phone_no, home_address, email_address);
        // checking if the user is alraedy in the phonebook
        if (!this.phoneBookMap.containsKey(f_name))
            this.phoneBookMap.put(f_name, phone_book_entries);
        else
        {
            System.out.println("Matching entry detected");
            System.out.println("Entry already in the database");
        }
    }

    //update of entry
    public void updatephonebookentry(String f_name,String l_name ,String phone_no, String home_address,String email_address){
        PhoneBookEntry phone_book_entries = new PhoneBookEntry(f_name,l_name, phone_no, home_address,email_address);

        //to check that the user is already in the phonebook or not
        if (this.phoneBookMap.containsKey(f_name)) {
            this.phoneBookMap.put(f_name, phone_book_entries);
        }
        else
        {
            System.out.println("Unable to find the name ");
            System.out.println("This name is not in the  phonebook");
        }
    }

    //function for deleing entries
    public void deletephonebookentry(String name){

        if (this.phoneBookMap.containsKey(name)) {
            this.phoneBookMap.remove(name);
        }
        else
        {
            System.out.println("Unable to find the name ");
            System.out.println("This name is not in the  phonebook");
        }
    }

    //function for printing phonebook
    public void printphonebookentry(String name){

        //to check that the user is already in the phonebook or not
        if (this.phoneBookMap.containsKey(name)) {
            System.out.println(this.phoneBookMap.get(name));
        }
        else
        {
            System.out.println("Unable to find the name ");
            System.out.println("This name is not in the  phonebook");
        }
    }
    public void printAllPhoneBookEntries() {
        for (PhoneBookEntry entry : this.phoneBookMap.values()) {
            System.out.println(entry);
        }
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBookMap=" + phoneBookMap +
                '}';
    }
}

