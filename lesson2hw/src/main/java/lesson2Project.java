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
        String _num = "";
        while (!_num.equals("q")){
            System.out.print("Введите номер задачи или 'q' для выхода из программы: ");

            String number = scanner.next();


            boolean r = false;

            switch (number){
                case "1":
                    r = task1SortArray(intArray);
                    break;
                case "2":
                    r = task2SearchMinAndMaxAndSum(intArray);
                    break;
                case "3":
                    r = task3RepeatCount(intArray);
                    break;
                case "q":
                    _num = number;
                    System.out.println("Выход из программы");
                    break;
                default: System.out.println("Введите номер задачи (1, 2, 3). Для выхода введите 'q'.");
            }
        /*if(number == 1) r = task1();
        else if (number == 2) r = task2();
        else System.out.println("Введите номер задачи (1, 2, 3)");*/
            System.out.println("");
            if (r == true) System.out.println(format("Задача %s выполнена", number));
            else if (r == true && !_num.equals("q")) System.out.println("Задача не выполнена.");
        }

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

    public static boolean task2SearchMinAndMaxAndSum(int[] array){
        int max=array[0];
        int min=array[0];
        for (int i = 0; i<array.length;i++){

            if(max<array[i]) max = array[i];
            if(min>array[i]) min = array[i];
        }
        System.out.println(format("Максимальное значение в массиве: %s ",max));
        System.out.println(format("Минимальное значение в массиве: %s ",min));
        System.out.println(format("Сумма максимума и минимума: %s + %s = %s ",max, min,max+min));
        return true;
    }

    public static boolean task3RepeatCount(int[] array){
        int count = 0;
        int element = 0;
        int countRav = 0;
        int countMax = 0;
        int tmp=0;

        boolean no_max = false;
        //int[] ar = new int[10];

        for (int k:array
             ) {
            tmp = 0;
            for (int j = 0; j<array.length; j++){
                if (k==array[j]) {
                    tmp++;
                }
            }
            if(tmp>count){
                //no_max = false;
                //countMax++;
                element = k;
                count = tmp;
            }

        }
        /*for(int i = 0; i<array.length; i++){
            int tmp=0;
            for (int j = 0; j<array.length; j++){
                if (array[i]==array[j]) {
                    tmp++;
                }
            }

            if(tmp>count){
                //no_max = false;
                countMax++;
                element = array[i];
                count = tmp;
            }
            else if (tmp==count) countRav++;
        }*/
        System.out.println(format("Наибольшее количество раз повторяется элемент '%s': %s повторений.",element, count));
        //if (countMax>1) System.out.println(format("Наибольшее количество раз повторяется элемент '%s': %s повторений.",element, count));
        //else if (countMax == countRav) System.out.println(format("Есть элементы, повторяющиеся одинаковое количество раз."));
        //if (no_max){
          //  System.out.println(format("Элементы повторяются одинаковое количество раз."));
        //}
        //else System.out.println(format("Наибольшее количество раз повторяется элемент '%s': %s повторений.",element, count));
        return true;
    }

}
