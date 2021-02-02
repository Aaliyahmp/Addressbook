import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//pretty much a utility class
public class AddressBook {
    //field: an Arraylist of generic type Entries
  private static List<Entry> entryList = new ArrayList<>();
    //methods: ways to manipulate the array list


    //add method
//    public static Object addEntry(Entry entry){
//
//
//        entryList.add(entry);
//        System.out.println(entry);
//        return null;
//    }
    //delete

public static void deleteEntry(Entry entry){
        entryList.remove(entry);
        System.out.println(entry);
}

public static Entry addEntry() {
    Scanner input = new Scanner (System.in);
        System.out.println("Enter first name");
        String firstName = input.nextLine();
        System.out.println("Enter last name");
        String lastName = input.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = input.nextLine();
        System.out.println("Enter email address");
        String email = input.nextLine();

return addEntry();
    }
    //
}
