package getting_to_know_the_language.java_languaje_basics;

import java.awt.*;

public class Operators {

    public static void main(String[] args) {
        //arithmeticDemo();
        //unaryDemo();
        //prePostDemo();
        comparisonDemo();

    }

    public static void arithmeticDemo() {
        var result = 1 + 1;
        System.out.println("1 + 1:\s" + result);

        var originalResult = result;
        result = result -1;
        System.out.println(originalResult + " -1 =\s" + result);
        originalResult = result;

        result = result * 2;
        System.out.println(originalResult + " * 2 =\s" + result);
        originalResult = result;

        result = result / 2;
        System.out.println(originalResult + " / 2 =\s" + result);
        originalResult = result;

        result = result + 8;
        System.out.println(originalResult + " + 8 =\s" + result);
        originalResult = result;

        result = result % 7;
        System.out.println(originalResult + " % 7 =\s" + result);

    }

    public static void unaryDemo() {
        int result = 1;
        System.out.println(result);

        result--;
        System.out.println(result);

        result++;
        System.out.println(result);

        result = -result;
        System.out.println(result);

        boolean success = false;
        System.out.println(success);
        System.out.println(!success);
    }

    public static void prePostDemo() {
        int i = 3;
        System.out.println(i);
        i++;
        System.out.println(i);

        ++i;
        System.out.println(i);

        System.out.println(i++);
        --i;

        System.out.println(++i);
    }

    public static void comparisonDemo() {
        var value1 = 1;
        var value2 = 2;

        if (value1 == value2)
            System.out.println("value1 == value2");

        if (value1 != value2)
            System.out.println("value1 != value2");

        if (value1 > value2)
            System.out.println("value1 > value2");

        if (value1 < value2)
            System.out.println("value1 < value2");

    }

    public static void conditionalDemo() {
        var value1 = 1;
        var value2 = 2;

        if ((value1 == 1) && (value1 == 2))
            System.out.println("ok");
    }
}
