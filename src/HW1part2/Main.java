package HW1part2;

/**
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
 * каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке.
 * Если длины массивов не равны, необходимо как-то оповестить пользователя.
 */
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] array2 = {0, 1, 2, 3, 4, 3, 2, 1, 4};
        System.out.println("Первый массив" + Arrays.toString(array1));
        System.out.println("Второй массив" + Arrays.toString(array2));
        System.out.println("Разница двух массивов" + differenceArray(array1, array2));
        System.out.println("Частное двух массивов" + divideArray(array1, array2));
    }
    public static ArrayList<Integer> differenceArray(int[]a1, int[]a2){
        ArrayList<Integer> result =new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1){
            throw new RuntimeException("Один из массивов пустой");
        }
        if (min < max){
            throw new RuntimeException("Массивы не равны по длинне!");
        }
        for (int i = 0; i < min; i++){
            result.add(a1[i] - a2[i]);
        }
        return result;
    }
    /**
     * ализуйте метод, принимающий в качестве аргументов два целочисленных массива, и
     * возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
     * Если длины массивов не равны, необходимо как-то оповестить пользователя.
     * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше.
     */
    public  static ArrayList<Float> divideArray(int[] a1, int[] a2){
        ArrayList<Float> result = new ArrayList<>();
        int min = Math.min(a1.length, a2.length);
        int max = Math.max(a1.length, a2.length);
        if (min < 1){
            throw new RuntimeException("Один из массивов пустой");
        }
        if (min < max){
            throw new RuntimeException("Массивы не равны по длинне!");
        }
        for (int i = 0; i < min; i++) {
            if(a2[i] != 0){
                result.add((float) (a1[i] / a2[i]));
            }
            else {
                throw  new RuntimeException("Деление на ноль");
            }
        }
        return result;
    }
}
