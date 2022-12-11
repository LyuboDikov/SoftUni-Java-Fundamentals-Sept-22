package TextProcessing_StringBuilder.Exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] usernamesArr = input.split(", ");

        List<String> validUsername = new ArrayList<>();

        //Взимаме всеки юзернейм и обхождаме неговите символи.
        for (String currentUser : usernamesArr) {
            StringBuilder newUser = new StringBuilder();

            //Ако е валиден username го запазваме във validUsername.
            if (isValidUsername(currentUser, newUser)){
                validUsername.add(currentUser);
            }
        }
        //Принтираме всеки валиден юзер на нов ред.
        for (String user : validUsername){
            System.out.println(user);
        }
    }

    private static boolean isValidUsername(String currentUser, StringBuilder newUser) {
        for (int j = 0; j < currentUser.length(); j++) {
            char currentSymbol = currentUser.charAt(j);

            //Проверяваме всеки символ и ако е валиден ( letter, number, hyphen, underscore ) го запазваме в нова променлива.
            if (Character.isLetter(currentSymbol) || Character.isDigit(currentSymbol) || currentSymbol == '-' || currentSymbol == '_') {
                newUser.append(currentSymbol);
            }
        }
        //Проверяваме дали новата променлива е еднаква с текущия юзернейм и ако е еднаква И е между 3-16 символа, го запазваме във validUsername листа.
        return newUser.toString().equals(currentUser) && (newUser.length() >= 3 && newUser.length() <= 16);
    }
}

