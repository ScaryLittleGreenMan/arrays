import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }

        int[] nums = new int[3];
        nums[0] = 10;
        nums[1] = 15;
        nums[2] = 20;
        //nums[3]=1; не существет, ловим эксепшн
        int[] nums2 = {5, 10, 15};
        String[] stringArr = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(nums));
        System.out.println("arr.length: " + nums.length); //длина массива

        int counter = 1;
        int[][] table = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
        printArray(table);

//        объявление массивов равнозначно
//        int arr[] = new int[3];
//        int[] arr2 = new int[3];

        //ввод данных из консоли
        Scanner scan = new Scanner(System.in); //объявление сканнера
        System.out.println("Enter num");
        int a = scan.nextInt(); //чтение целого числа в переменную а
        System.out.println("Enter string");
        String b = scan.nextLine(); //чтение строки
        String c = scan.next(); //чтение до след пробела
        System.out.println(a + b + c);
        //scan.close(); //после пользования закрыть!
        //если сканер еще будет юзаться, то не закрывать, а то падаем

        //если не закомментить предыдущий сканер, падает
        /*int number = getNumberFromScanner("Введите число от 5 до 10", 5, 10);
        System.out.println("Number= " + number);*/

        print1DArray(nums);
        print2DArray(table);
        System.out.println(arrSum(nums));

        System.out.println("Randomizer!");
        Random random = new Random();
        int x = random.nextInt(20);
        System.out.println(x);

        System.out.println("Formatted input");
        System.out.printf("Слово: %s, Число с плаваущей зпт: %f, Целое число: %d, Символ: %c", "Java", 2.5f, 20, 's');
        System.out.println();
        //сравнение строк
        String str1= "A";
        String str2= "A";
        String str3= "B";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { //считает количество строк
            for (int j = 0; j < arr[i].length; j++) { //считает количество столбцов
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    /*public static int getNumberFromScanner(String message, int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int x;
        do {
            System.out.println(message);
            x = scanner.nextInt();
        } while (x < min || x > max);
        scanner.close();
        return x;
    }*/

    public static void print1DArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void print2DArray(int[][] arr) {
        for (int i = 0; i <= arr[0].length; i++) { //нумерация 1 строки
            System.out.print(i + " |");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " |"); //нумерация 1 столбца
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }


}
