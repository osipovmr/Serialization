import java.io.IOException;
import java.io.Serializable;

import java.util.Arrays;

public class Main implements Serializable {

    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");

        //��������� - 50 �����
        int[] randomFifty = new int[50];
        for (int i = 0; i < 50; i++) {
            randomFifty[i] = Random.getRandomInt(1, 300);
        }

        //������ ������ � ����
        System.out.println(WriteFile.writeStringInFile(Arrays.toString(randomFifty), "randomFiftyString"));
        System.out.println(WriteFile.writeByteInFile(Arrays.toString(randomFifty), "randomFiftyStringInByte"));

        //c�������� - 100 �����
        int[] randomOneHundred = new int[100];
        for (int i = 0; i < 100; i++) {
            randomOneHundred[i] = Random.getRandomInt(1, 300);
        }
        //������ ������ � ����
        System.out.println(WriteFile.writeStringInFile(Arrays.toString(randomOneHundred), "randomOneHundred"));
        System.out.println(WriteFile.writeByteInFile(Arrays.toString(randomOneHundred), "randomOneHundredInByte"));

        //c�������� - 500 �����
        int[] randomFiveHundred = new int[500];
        for (int i = 0; i < 500; i++) {
            randomFiveHundred[i] = Random.getRandomInt(1, 300);
        }
        System.out.println(WriteFile.writeStringInFile(Arrays.toString(randomFiveHundred), "randomFiveHundred"));
        System.out.println(WriteFile.writeByteInFile(Arrays.toString(randomFiveHundred), "randomFiveHundredInByte"));

        //c�������� - 1000 �����
        int[] randomOneThousand = new int[1000];
        for (int i = 0; i < 1000; i++) {
            randomOneThousand[i] = Random.getRandomInt(1, 300);
        }
        System.out.println(WriteFile.writeStringInFile(Arrays.toString(randomOneThousand), "randomOneThousand"));
        System.out.println(WriteFile.writeByteInFile(Arrays.toString(randomOneThousand), "randomOneThousandInByte"));
    }
}
