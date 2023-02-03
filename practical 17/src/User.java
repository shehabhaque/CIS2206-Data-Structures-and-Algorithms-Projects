import java.util.HashMap;

public class User {
    public static void main(String[] args) {

        //entries inserted into the phonebook
        PhoneBook phone_book = new PhoneBook();
        //inserting elements in phonebook
        phone_book.inputPhoneBookEntry("Shehab","Haque","07864156388","60 Ravensknowle Road, Huddersfield, HD5 8BL","shehabhaque11@gmail.com");
        phone_book.inputPhoneBookEntry("Aaron","Smith","07864560322","88 Firth Street, Huddersfield, HD1 3BN","aaronsmith32@gmail.com");
        phone_book.inputPhoneBookEntry("Ross","Carrington","07375240774","2 Queensgate, Huddersfield, HD1 3DH","carrington@yahoo.co.uk");

        System.out.println("All Entries: ");

        phone_book.printAllPhoneBookEntries();

        System.out.println("\nBefore updating: ");
        phone_book.printphonebookentry("Shehab");

        //updating phone book entry
        phone_book.updatephonebookentry("Shehab","Haque","07864156388","5 Chancery Lane, HD1 6DH","shehabhaque11@gmail.com");

        System.out.println("\nAfter updating: ");
        //printing for confirmation of changes
        phone_book.printphonebookentry("Shehab");
        //deleting updated entry in the phonebook
        phone_book.deletephonebookentry("Aaron");

        // printing results
        System.out.println("\nUpdated Phonebook: ");
        phone_book.printAllPhoneBookEntries();

    }
}
