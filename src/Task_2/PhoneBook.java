package Task_2;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {

    private Map<String, ArrayList<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new TreeMap<>();
    }

    public void addEntry(String name, String phone){
        if (!phoneBook.containsKey(name))
            phoneBook.put(name, new ArrayList<>());

        phoneBook.get(name).add(phone);
    }

    public ArrayList<String> getNumberPhone(String name){
        return phoneBook.get(name);
    }

}
