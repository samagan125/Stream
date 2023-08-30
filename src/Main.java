public class Main {
    public static void main(String[] args) {
        int[] num = {54,5,48,8,55};

        int maxS = findMaxSquare(num);

        System.out.println("Самое большое значение: " + maxS);
    }

    public static int findMaxSquare(int[] array) {
        int maxS = Integer.MIN_VALUE;

        for (int num : array) {
            if (num % 2 == 0) {
                int square = num * num;
                if (square > maxS) {
                    maxS = square;
                }
            }
        }

        return maxS;
    }
}