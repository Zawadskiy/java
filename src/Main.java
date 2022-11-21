
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        1)
        String[] strings = readStrings(scanner);
        concatString(strings);

//        2)
//        List<String> list = new ArrayList<>();
//        readStrings(scanner, list); //
//        concatString(list);
//
//        3)
//        readAndConcat(scanner);
        scanner.close();
    }

    static String[] readStrings(Scanner scanner) {

        String[] stringArray = new String[5];
        boolean next = true;
        int i = 0;

        while (next) {
            String read = scanner.next();
            if (read.equals("end")) {
                next = false;
            } else {
                if (i >= stringArray.length) {
                    stringArray = Arrays.copyOf(stringArray, 3 * stringArray.length / 2 + 1);
                }
                stringArray[i] = read;
                i++;
            }
        }
        return stringArray;
    }

    static void concatString(String... strings) {
        StringBuilder stringBuilder = new StringBuilder();
        String space = " ";
        boolean haveNext = true;
        int i = 0;

        if (strings[i] == null) {
            haveNext = false;
        }

        while (haveNext) {
            stringBuilder.append(strings[i]).append(space);
            i++;
            if (strings[i] == null) {
                haveNext = false;
            }
        }

        System.out.println(stringBuilder);
    }

    static void readStrings(Scanner scanner, List<String> list) {

        boolean next = true;

        while (next) {
            String read = scanner.next();
            if (read.equals("end")) {
                next = false;
            } else {
                list.add(read);
            }
        }
    }

    static void concatString(List<String> text) {
        StringBuilder stringBuilder = new StringBuilder();
        String space = " ";
        for (String st : text) {
            stringBuilder.append(st).append(space);
        }
        System.out.println(stringBuilder);
    }

    static void readAndConcat(Scanner scanner) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean next = true;

        while (next) {
            String read = scanner.next();
            if (read.equals("end")) {
                next = false;
            } else {
                stringBuilder.append(read);
            }
        }
        System.out.println(stringBuilder);
    }
}

