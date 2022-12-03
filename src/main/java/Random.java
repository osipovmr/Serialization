public class Random {
    //получение целого числа в диапазоне от 1 до 300.
    public static int getRandomInt(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
