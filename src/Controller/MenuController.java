package Controller;

import View.ConsoleView;
import models.Contact;

public class MenuController {
    private ContactManager contactManager;
    private ConsoleView consoleView;

    public MenuController() {
        contactManager = new ContactManager();
        consoleView = new ConsoleView();
    }

    public void showMenu() {
        boolean running = true;
        while (running) {
            consoleView.displayMenu();
            String choice = consoleView.getInput("Slecciona una opcion ");
            switch (choice) {
                case "1":
                    addContact();
                    break;
                case "2":
                    findContact();
                    break;
                case "3":
                    deleteContact();
                    break;
                case "4":
                    printList();
                    break;
                case "5":
                    running = false;
                    break;
                default:
                    consoleView.showMessage("Opcion Invalidada, De nuevo");
            }
        }
    }
    /*Adriano Gay borra eso, puro GPT */
    public void addContact() {
        String name = consoleView.getInput("Ingresa el nombre: ");
        String phone = consoleView.getInput("Ingrese el numero: ");
        Contact<String, String> contact = new Contact<>(name, phone);
        contactManager.addContact(contact);
        consoleView.showMessage("Contacto Agregado.");
    }

    public void findContact() {
        String name = consoleView.getInput("Ingresa el nombre a buscar: ");
        Contact<?, ?> contact = contactManager.findContactByName(name);
        if (contact != null) {
            consoleView.showMessage(contact.toString());
        } else {
            consoleView.showMessage("Contacto no agregado");
        }
    }

    public void deleteContact() {
        String name = consoleView.getInput("Ingresa un nombre a eliminar: ");
        contactManager.deleteContactByName(name);
        consoleView.showMessage("Contacto eliminado si existia");
    }

    public void printList() {
        contactManager.printList();
    }
}