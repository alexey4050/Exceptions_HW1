package HW1part1;

/**
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 * Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
*/
public class Main {
    public static void main(String[] args) {
        String[] sArrays = {"first str", null, "third str"};
        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12};
        division(10,0);
        printValueByIndex(array, 12);
        printStringArray(sArrays);
    }
    public static void division(double firstNum, double secondNum){
        if(secondNum == 0) throw new ArithmeticException("На ноль делить нельзя!");
        double result = firstNum/secondNum;
        System.out.printf("Результат деления %f равен %d. \n", firstNum, secondNum, result);

    }
    public static void printValueByIndex(int[]array, int index){
        if(index > array.length-1) throw new ArrayIndexOutOfBoundsException("Элемент под таким индексом не существует");
        else System.out.printf("Элемент %d равен %d.\n", index, array[index]);
    }
    public static void printStringArray(String[] sArray){
        for (String item: sArray){
            if(item == null) throw new NullPointerException("Элемент отсутствует!");
            System.out.println(item);
        }
    }
}