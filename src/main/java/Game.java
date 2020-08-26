public class Game {

    public static int makeNumber(int[] tall) {
        return countThis(tall, 1);
    }

    public static int checkForTwos(int[] twos) {
        return countThis(twos, 2);
    }


    public static int countThrees(int[] tall) {
        return countThis(tall, 3);
    }

    public static int countFours(int[] fours) {
        return countThis(fours, 4);

    }

    public static int countFives(int[] fives) {
        return -1;

    }


    public static int countThis(int[] kast, int checkNumber) {
        int counter = 0;
        for (int number : kast) {
            if (number == checkNumber) {
                counter++;
            }
        }
        return counter;
    }
}
