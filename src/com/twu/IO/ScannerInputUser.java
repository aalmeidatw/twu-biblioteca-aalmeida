package com.twu.IO;
<<<<<<< HEAD:src/com/twu/IO/ScannerInputUser.java
=======

>>>>>>> 82928648e1b8131c3a3f9c02a4e3935261eba03a:src/com/twu/IO/ScannerInputUser.java

import java.util.Scanner;

public class ScannerInputUser {
    Scanner scanner = new Scanner(System.in);

    public String getUserInfoScanner(){
<<<<<<< HEAD:src/com/twu/IO/ScannerInputUser.java

        printerMessage.print("\n\n ");
        printerMessage.print("Choise a letter :");

=======
>>>>>>> 82928648e1b8131c3a3f9c02a4e3935261eba03a:src/com/twu/IO/ScannerInputUser.java
        return scanner.nextLine().toUpperCase();
    }

    public String getNameItemScanner(){
        return scanner.nextLine();
    }

    public int getInputIndex(){
        return scanner.nextInt();

    }

    public String getInputLoginUser(){
        return scanner.next();
    }
}






