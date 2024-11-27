package ContactBook;

import java.util.HashMap;

public class ContactBook {
  private HashMap<String, Integer> contacts;

  public ContactBook() {
    contacts = new HashMap<String, Integer>();
  }

  public HashMap<String, Integer> getContacts() {
    return contacts;
  }

  public boolean addContact(String name, int phoneNumber) {
    if (contacts.containsKey(name)) {
      ConsoleUtils.print("Contact with name " + name + " already exists.");
      return false;
    }

    if (contacts.containsValue(phoneNumber)) {
      ConsoleUtils.print("Contact with phone number " + phoneNumber + " already exists.");
      return false;
    }

    contacts.put(name, phoneNumber);
    return true;
  }

  public boolean removeContact(String name) {
    if (!contacts.containsKey(name)) {
      ConsoleUtils.print("Contact with name " + name + " does not exist.");
      return false;
    }

    contacts.remove(name);
    return true;
  }
}
