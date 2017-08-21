import java.util.Scanner;

public class lesson1Project {

    static double firNum;
    static double secNum;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер задачи: ");

        int number = scanner.nextInt();

        boolean r = false;

        if(number == 1) r = task1();
        else if (number == 2) r = task2();
        else System.out.println("Введите номер задачи (1 или 2)");

        if (r == true) System.out.println("Задача выполнена.");
        else System.out.println("Задача не выполнена.");
        //scanner.close();
    }

    public static boolean task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите X: ");
        firNum = scanner.nextDouble();
        System.out.print("Введите Y: ");
        secNum = scanner.nextDouble();
        scanner.close();
        int ch = chisl((int)firNum,(int)secNum);
        int zn = znam((int)firNum);

        String c = String.format("Числитель: %s", ch);
        String z = String.format("Знаменатель: %s", zn);
        String answer = String.format("%s / %s = %s", ch,zn, uravnenie(ch, zn));

        System.out.println(c);
        System.out.println(z);
        System.out.println(answer);
        return true;
    }

    public static int chisl (int x, int y){
        return 3 * ( x + 2 * x - y );
    }

    public static int znam (int x){
        return 2 * x;
    }

    public static double uravnenie (int chislitel, int znamenatel){
        return (double) chislitel / znamenatel;
    }

    public static boolean task2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите фразу или предложение: ");
        String str = scanner.nextLine();


        System.out.print("Введите слово, которое хотите заменить: ");
        String oldWord = scanner.next();

        System.out.print("Введите слово, на которое хотите заменить: ");
        String newWord = scanner.next();

        String result = String.format("Предложение с заменой: %s", createNewStr(str,oldWord,newWord));
        System.out.println(result);

        System.out.print("Введите слово из второго предложения, которое перенесем в третье предложение: ");
        String wordInNewStr = scanner.next();
        String result2 = String.format("Слово, которое вы выбрали '%s'",copyWordInNewStr(result,wordInNewStr));
        System.out.println(result2);
        return true;
    }

    public static String createNewStr(String str, String oldWord, String newWord){
        String newStr = "";

        for (String word:str.split(" ")
                ) {
            if (word.equals(oldWord)) word = newWord;
            newStr += word + " ";
        }
        return newStr;
    }

    public static String copyWordInNewStr(String str, String copyWord){
        String newWord = "";

        for (String word:str.split(" ")
                ) {
            if (word.equals(copyWord)) newWord = copyWord;
        }
        return newWord;
    }
}
