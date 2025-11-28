import java.util.Random;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Массив из 100 элементов
        int[] arr = new int[100];
        arr[0] = 79;

        // Инициализируем генератор случайных чисел
        Random random = new Random();
        // Инициализируем ArrayList indices
        ArrayList<Integer> indices = new ArrayList<>();

        // Заполняем массив сгенерированными значениями
        for (int i = 1; i < arr.length; i++) {
            // Случайное число от 75 до 83 включительно
            int box = random.nextInt(9) + 75;
            arr[i] = box;
            indices.add(box);
        }

        // Печатаем сгенерированный массив
        System.out.println("Все значения массива: " + indices);
        // Очищаем ArrayList indices
        indices.clear();

        // Находим индексы ячеек, где хранится 79
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 79) {
                indices.add(i);
            }
        }

        // Индексы можно вывести
        System.out.println("Индексы ячеек, где хранится 79: " + indices);
    }
}
