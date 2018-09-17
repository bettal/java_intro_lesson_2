import java.util.Arrays;

/**
 * Java.1.Lesson.2.Homework
 *
 * @autor Stanislav Lyashov
 */
public class HwLesson2 {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        checkMinMax();
    }

    public static void invertArray() {
        /*1. Задать целочисленный массив, состоящий из элементов 0 и 1
        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        //Задаем массив из 0 и 1
        int[] bits = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("Массив bits " + Arrays.toString(bits));
        //Цикл изменений значений массива
        for (int i = 0; i < bits.length; i++) {
            switch (bits[i]) {
                case 0:
                    bits[i] = 1;
                    break;
                case 1:
                    bits[i] = 0;
                    break;
            }
        }
        //Смотрим результат
        System.out.println("Массив bits " + Arrays.toString(bits));
    }

    public static void fillArray() {
            /*2. Задать пустой целочисленный массив размером 8.
            С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21; */
        //Задаем пустой массив размером 8
        int[] eight = new int[8];
        //Проверяем,что массив пустой
        System.out.println("Массив eight " + Arrays.toString(eight));
        //Заполним массив eight с помощью цикла
        for (int i = 0, j = 0; i < eight.length; i++, j += 3) {
            eight[i] = j;
        }
        //Проверяем,что заполнен пустой
        System.out.println("Массив eight " + Arrays.toString(eight));
    }

    public static void changeArray() {
            /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
            пройти по нему циклом, и числа меньшие 6 умножить на 2; */
        //Задаем массив
        int[] six = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //Проверяем элементы массива
        System.out.println("Массив six " + Arrays.toString(six));
        //Изменим элементы массива six при условии
            /*for (int i : six) - такая запись инициализирует i по значение первого элемента массива
            и соответсвенно перебор начинается не с первого элемента. ???? */
        for (int i = 0; i < six.length; i++) {
            if (six[i] < 6) {
                six[i] = six[i] * 2;
            }
        }
        //Проверяем изменения
        System.out.println("Массив six " + Arrays.toString(six));
    }

    public static void fillDiagonal() {
            /*4. Создать квадратный двумерный целочисленный массив
            (количество строк и столбцов одинаковое), и с помощью цикла(-ов)
            заполнить его диагональные элементы единицами;*/
        //Создаем массив по условию
        int[][] square = new int[5][5];
        //Посмотрим на массив
        System.out.println(Arrays.deepToString(square));
        //перебираем рады
        for (int i = 0; i < square[0].length; i++) {
            //перебираем колонку
            for (int j = 0; j < square[1].length; j++) {
                //Диагональ (1*1 - n*n) равные колонкии рады
                //Диагональ (1*n - n*1) сумма координат равна размерность +1, но отработала вернр с -1 ?????
                if (i + j == square.length - 1 || i == j) {
                    square[i][j] = 1;
                }
            }
        }
        //Посмотрим на массив
        System.out.println(Arrays.deepToString(square));
    }

    public static void checkMinMax() {
            /*5. ** Задать одномерный массив и найти в нем минимальный и
             максимальный элементы (без помощи интернета); */
        int[] any = {3, 4, 3, 2, 4, 5, 11, 9, 1};
        int min = any[0], max = any[0];
        for (int i = 0; i < any.length; i++) {
            if (any[i] < min) {
                min = any[i];
            }
            if (any[i] > max) {
                max = any[i];
            }
        }
        System.out.println("Максимальный элемент массива any " + max);
        System.out.println("Минимальный элемент массива any " + min);
    }
}

