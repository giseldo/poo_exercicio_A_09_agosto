/**
 * Provide a simple demonstration of the AddressBook
 * class. Sample data is added to the address book.
 * 
 * @author David J. Barnes and Michael Kolling.
 * @version 2002.05.08
 */
public class AddressBookDemo
{
    // instance variables - replace the example below with your own
    private AddressBook book;

    /**
     * Setup an AddressBook with sample data.
     * The address book is passed to a GUI to provide
     * a view of the data.
     */
    public AddressBookDemo()
    {
        ContactDetails[] sampleDetails = {
            new ContactDetails("david",   "08459 100000", "address 1"),
            new ContactDetails("michael", "08459 200000", "address 2"),
            new ContactDetails("john",    "08459 300000", "address 3"),
            new ContactDetails("helen",   "08459 400000", "address 4"),
            new ContactDetails("emma",    "08459 500000", "address 5"),
            new ContactDetails("kate",    "08459 600000", "address 6"),
            new ContactDetails("chris",   "08459 700000", "address 7"),
            new ContactDetails("ruth",    "08459 800000", "address 8"),
        };
        book = new AddressBook();
        for(int i = 0; i < sampleDetails.length; i++) {
            book.addDetails(sampleDetails[i]);
        }
    }

    /**
     * @return The sample address book.
     */
    public AddressBook getBook()
    {
        return book;
    }
}