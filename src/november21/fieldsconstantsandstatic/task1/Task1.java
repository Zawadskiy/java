package november21.fieldsconstantsandstatic.task1;

import java.util.Scanner;

/**
 * Используя кодовую базу из задачи <a href="https://github.com/KFalcon2022/practical-tasks/blob/master/src/lesson6_methods/Task3.java">...</a>
 * вынести строковые и символьные литералы в константы. Попробуйте нарисовать прямоугольник,
 * используя "==" для каждой единицы длины и "||" – для каждой единицы ширины.
 * <p>
 * Также попробуйте записать в константу переменную scanner. Упростится ли использование сканера внутри методов чтения с клавиатуры?
 */
public class Task1 {
    private static final String LENGTH = "==";
    private static final String WIDTH = "||";
    private static final String SPACE = " ";
    private static final String EMPTY_STRING = "";
    private static final String NEW_LINE = "\n";
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        int length = requireInt("Enter rectangle's length: ");
        int width = requireInt("Enter rectangle's width: ");

        scanner.close();

        String horizontalLine = createHorizontalLine(length);
        String verticalLines = createVerticalLines(length, width);

        printRectangle(horizontalLine, verticalLines);
    }

    static int requireInt(String requiringMessage) {
        System.out.print(requiringMessage);

        return scanner.nextInt();
    }

    static void printRectangle(String horizontalLine, String verticalLines) {
        System.out.print(horizontalLine + verticalLines + horizontalLine);
    }

    static String createHorizontalLine(int length) {
        StringBuilder horizontalLine = new StringBuilder(SPACE);

        for (int i = 0; i < length; i++) {
            horizontalLine.append(LENGTH);
        }

        horizontalLine.append(SPACE + NEW_LINE);

        return horizontalLine.toString();
    }

    static String createVerticalLines(int length, int width) {
        String verticalLinesUnit = getVerticalLinesUnit(length);

        StringBuilder verticalLines = new StringBuilder(EMPTY_STRING);

        for (int i = 0; i < width; i++) {
            verticalLines.append(verticalLinesUnit);
        }
        return verticalLines.toString();
    }

    static String getVerticalLinesUnit(int length) {
        StringBuilder verticalLinesUnit = new StringBuilder(WIDTH);

        for (int i = 0; i < length; i++) {
            verticalLinesUnit.append(SPACE);
        }

        verticalLinesUnit.append(WIDTH + NEW_LINE);
        return verticalLinesUnit.toString();
    }
}