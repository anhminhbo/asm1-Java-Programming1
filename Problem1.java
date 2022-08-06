/*
  RMIT University Vietnam
  Course: COSC2081 Programming 1
  Semester: 2022B
  Assessment: Test 1
  Author: Nguyen Cuong Anh Minh
  ID: 3931605
  Created  date: 06/08/2022
  Acknowledgement: Acknowledge the resources that you use here.
*/
import java.util.Scanner;
public class Problem1 {
    private static boolean isAlplabet(char c) {
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) return true;
        return false;
    }

    private static boolean isUpperCase(char c) {
        if (c == Character.toUpperCase(c)) return true;
        return false;
    }

    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input string");

        String input = scanner.nextLine();

        for (int i=0; i< input.length(); i++) {
            while (!isAlplabet(input.charAt(i))) {
                System.out.println("Your input is wrong format. Enter your input string.");
                input = scanner.nextLine();
            }

            if (i == input.length() - 1) {
                result.append(input.charAt(i));
                break;
            }

            if ( (isUpperCase(input.charAt(i)) && !isUpperCase(input.charAt(i+1))) ||
                    (!isUpperCase(input.charAt(i)) && isUpperCase(input.charAt(i+1))) ) {
                result.append(input.charAt(i));
                result.append("&");
                result.append(input.charAt(i+1));
                i++;
            } else {
                result.append(input.charAt(i));
            }
        }

        System.out.println("Output format string is: " + result.toString());
    }
}
