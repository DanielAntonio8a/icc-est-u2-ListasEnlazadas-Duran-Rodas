package Controller;

import java.util.LinkedList;

import models.*;

public class ContactManager {
    private LinkedList<Contact<?, ?>> contacts;

    public ContactManager() {
        contacts = new LinkedList<>();
    }

    public void addContact(Contact<?, ?> contact) {
        contacts.add(contact);
    }

    public Contact<?, ?> findContactByName(String name) {
      
                for (Contact<?, ?> contact : contacts) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    public void deleteContactByName(String name) {
        /*Node<Contact<?, ?>> current = contacts.head;
        while (current != null) {
            if (current.getValue().getName().equals(name)) {
                //contacts.deleteByValue(current.getValue());
                contacts.remove(current.getValue());
                return;
            }
            current = current.getNext();
        }*/
         for (Contact<?, ?> contact : contacts) {
            if (contact.getName().equals(name)) {
                contacts.remove(contact);
                return;
            }
        }
    }

    public void printList() {
        for (Contact<?, ?> contact : contacts) {
            System.out.println(contact);
        }
    }
}