package View;

import java.util.Scanner;

public class ConsoleView {
    private Scanner scanner;

    public ConsoleView() {
        scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Añadir Contacto");
        System.out.println("2. Encontar Contacto");
        System.out.println("3. Eliminar Contacto");
        System.out.println("4. Mostar Contactos");
        System.out.println("5. Exit");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}