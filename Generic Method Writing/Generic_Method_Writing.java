package patika_week_3;

public class Generic_Method_Writing {

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};

        String[] strArray = {"Java", "Generics", "Ödev"};

        Double[] doubleArray = {16.03,20.16,6.10,20.23};

        printArray(intArray);
        System.out.println();
        printArray(strArray);
        System.out.println();
        printArray(doubleArray);

    }

     public static <T> void printArray(T[] array){
        for(T element: array){
            System.out.print(element + " ");
        }
     }
}
