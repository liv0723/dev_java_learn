package getting_to_know_the_language.java_languaje_basics;

public class Arrays {
    public static void main(String[] args) {
//        firstArrays();
//        secondArrays();
//        multidimensionalArrays();
//        notes();
//        copyFromOneArrayToOther();
//        practiceCopyArrays();
//        findValueIntoArray();
//        compareArrays();
          operationStreams();

    }

    public static void firstArrays() {
        int[] anArray;
        anArray = new int[5];
        anArray[0] = 0;
        anArray[1] = 1;
        anArray[2] = 2;
        anArray[3] = 3;
        anArray[4] = 4;

        System.out.println("Element at index 0:\s"
                + anArray[0]);
        System.out.println("Element at index 1:\s"
                + anArray[1]);
        System.out.println("Element at index 2:\s"
                + anArray[2]);

    }

    public static void secondArrays() {
        int[] scores = {1, 2, 3, 4};
        for ( var item : scores) {
            System.out.println("Score:\s" + item);
        }
    }

    public static void threeArrays() {
        double[] temperatures = {100.0, 200.0, 300.0};

        for (var temperature: temperatures) {
            System.out.println("Temperature:\s" + temperature);
        }
    }

    public static void multidimensionalArrays() {
        String[][] names = {{"jose", "mario"},{"juana", "maria"}};

        for (var item : names) {
            for (var name : item) {
                System.out.println("Name:\s" + name);
            }
        }
    }

    public static void notes() {
        double[][] notes = {{1, 2, 3}, {4, 5, 6}};
        double prom = 0;
        int cont = 0;

        for (int i = 0; i < notes.length; i ++) {
            for (int y = 0; y < notes[i].length; y ++) {
                prom = prom + notes[i][y];
                cont ++;
            }
        }
        System.out.println((prom / cont));
        System.out.println(cont);
        System.out.println(prom);
    }

    public static void copyFromOneArrayToOther() {
        String[] names = {"pepe", "maria"};
        String[] copyNames = new String[names.length];

        System.arraycopy(names, 0, copyNames, 0, names.length);
        System.out.println(names.length);
        System.out.println(copyNames.length);

        for (var name : names) {
            System.out.println(name);
        }
        for (var name : copyNames) {
            System.out.println(name);
        }

    }

    public static void practiceCopyArrays() {
        int[] original = {1, 2, 3, 4, 5};
        int[] copy = new int[original.length];

        //manual copy
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }
        System.out.println(java.util.Arrays.toString(original));
        System.out.println(java.util.Arrays.toString(copy));

        // System.arraycopy example
        int[] otherCopy = new int[original.length];

        System.arraycopy(original, 0, otherCopy, 0, original.length);
        System.out.println(java.util.Arrays.toString(otherCopy));

        //using Arrays class
        var threeCopy = java.util.Arrays.copyOfRange(original, 0 , original.length);
        System.out.println(java.util.Arrays.toString(threeCopy));
    }

    public static void findValueIntoArray() {
        int[] notes = {100, 200, 300};
        var result = java.util.Arrays.binarySearch(notes, 200);
        System.out.println(result);
    }

    public static void compareArrays() {
        int[] first = {1, 2};
        int[] second = {1, 2};

        var result = java.util.Arrays.equals(first, second);
        System.out.println(result);
    }

  public static void operationStreams() {
        int [] notes = {1, 2, 3};
      var average = java.util.Arrays.stream(notes).average().getAsDouble();
     var aux = java.util.Arrays.stream(notes).map(value -> {
         if (value > 2) return value;
         return -1;
     }).toArray();


      System.out.println(average);
      System.out.println(java.util.Arrays.toString(aux));
  }
}
