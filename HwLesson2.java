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
        /*1. ������ ������������� ������, ��������� �� ��������� 0 � 1.
        ��������: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. � ������� ����� � ������� �������� 0 �� 1, 1 �� 0;*/
        //������ ������ �� 0 � 1
        int[] bits = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println("������ bits " + Arrays.toString(bits));
        //���� ��������� �������� �������
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
        //������� ���������
        System.out.println("������ bits " + Arrays.toString(bits));
    }

    public static void fillArray() {
            /*2. ������ ������ ������������� ������ �������� 8.
            � ������� ����� ��������� ��� ���������� 0 3 6 9 12 15 18 21; */
        //������ ������ ������ �������� 8
        int[] eight = new int[8];
        //���������,��� ������ ������
        System.out.println("������ eight " + Arrays.toString(eight));
        //�������� ������ eight � ������� �����
        for (int i = 0, j = 0; i < eight.length; i++, j += 3) {
            eight[i] = j;
        }
        //���������,��� �������� ������
        System.out.println("������ eight " + Arrays.toString(eight));
    }

    public static void changeArray() {
            /*3. ������ ������ [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
            ������ �� ���� ������, � ����� ������� 6 �������� �� 2; */
        //������ ������
        int[] six = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //��������� �������� �������
        System.out.println("������ six " + Arrays.toString(six));
        //������� �������� ������� six ��� �������
            /*for (int i : six) - ����� ������ �������������� i �� �������� ������� �������� �������
            � ������������� ������� ���������� �� � ������� ��������. ???? */
        for (int i = 0; i < six.length; i++) {
            if (six[i] < 6) {
                six[i] = six[i] * 2;
            }
        }
        //��������� ���������
        System.out.println("������ six " + Arrays.toString(six));
    }

    public static void fillDiagonal() {
            /*4. ������� ���������� ��������� ������������� ������
            (���������� ����� � �������� ����������), � � ������� �����(-��)
            ��������� ��� ������������ �������� ���������;*/
        //������� ������ �� �������
        int[][] square = new int[5][5];
        //��������� �� ������
        System.out.println(Arrays.deepToString(square));
        //���������� ����
        for (int i = 0; i < square[0].length; i++) {
            //���������� �������
            for (int j = 0; j < square[1].length; j++) {
                //��������� (1*1 - n*n) ������ �������� ����
                //��������� (1*n - n*1) ����� ��������� ����� ����������� +1, �� ���������� ����� � -1 ?????
                if (i + j == square.length - 1 || i == j) {
                    square[i][j] = 1;
                }
            }
        }
        //��������� �� ������
        System.out.println(Arrays.deepToString(square));
    }

    public static void checkMinMax() {
            /*5. ** ������ ���������� ������ � ����� � ��� ����������� �
             ������������ �������� (��� ������ ���������); */
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
        System.out.println("������������ ������� ������� any " + max);
        System.out.println("����������� ������� ������� any " + min);
    }
}

