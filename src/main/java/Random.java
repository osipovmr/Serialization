public class Random {
    //��������� ������ ����� � ��������� �� 1 �� 300.
    public static int getRandomInt(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
