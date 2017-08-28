import java.util.Scanner;

import static java.lang.String.format;

public class lesson2Project {
    public static void main(String[] args) {
        int size = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        size = scanner.nextInt();
        int[] intArray = new int[size];

        System.out.println(format("Введите %s чисел", size));


        for (int i = 0; i < size; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.print("Введите номер задачи: ");

        String number = scanner.next();


        boolean r = false;

        switch (number){
            case "1":
                r = task1SortArray(intArray);
                break;
            case "2":
                //task2();
                break;
            case "3":
                //task3();
                break;
            case "q":
                //task3();
                break;
            default: System.out.println("Введите номер задачи (1, 2, 3). Для выхода введите 'q'.");
        }
        /*if(number == 1) r = task1();
        else if (number == 2) r = task2();
        else System.out.println("Введите номер задачи (1, 2, 3)");*/
        System.out.println("");
        if (r == true) System.out.println("Задача выполнена.");
        else System.out.println("Задача не выполнена.");
        scanner.close();
    }

    public static boolean task1SortArray(int[] array){
        int last = array.length;

        for ( boolean sorted = last == 0; !sorted; --last )
        {
            sorted = true;
            for ( int i = 1; i < last; i++ )
            {
                if ( array[i-1] < array[i] )
                {
                    sorted = false;

                    int tmp = array[i-1];
                    array[i-1] = array[i];
                    array[i] = tmp;
                }

            }
        }

        for (int i = 0; i<array.length; i++){
            System.out.print(format("%s ",array[i]));
        }

        return true;
    }

}
