package fr.lecampusnumerique.games.utils;

import java.util.Scanner;

public class InputUser {

    private static Scanner scanner = new Scanner(System.in);

    static String GetInputUser() {
        String input = scanner.nextLine();
        return input;
    }
}
