package infrastructure;

import java.util.Scanner;

public class Console {
    private final Scanner scanner;

    public Console() {
        this.scanner = new Scanner(System.in);
    }

    public void showMenu(){
        System.out.println("◯--◯--◯--◯--◯--◯-◯-◯-◯-◯-◯-◯");
        System.out.println("||===||===--\u001B[31mMENU\u001B[0m--===||===||");
        System.out.println("\u001B[4m[1]\u001B[0m Create Concesonary");
        System.out.println("\u001B[4m[2]\u001B[0m Search Concesonary");
        System.out.println("\u001B[4m[3]\u001B[0m See all conseconaries");
        System.out.println("\u001B[4m[4]\u001B[0m EXIT");
    }

    public int readOption(){
        return scanner.nextInt();
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    public String readText(String message){
        System.out.println(message);
        scanner.nextLine(); // clean the buffer
        return scanner.nextLine();
    }

    public int readInt(String message){
        System.out.println(message);
        return scanner.nextInt();
    }

    public void close(){
        scanner.close();
    }
}
