import java.util.Arrays;
import java.util.Random;

public class Lottery {
    public static void main(String[] args) {
        Random rand = new Random();

        int[] first = new int[7];
        for (int i = 0; i < first.length; i++) {
            first[i] = rand.nextInt(10);
        }

        int[] second = new int[7];
        for (int i = 0; i < second.length; i++) {
            second[i] = rand.nextInt(10);
        }

        Arrays.sort(first);
        Arrays.sort(second);

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        int matches = 0;
        for (int i = 0; i < first.length && i < second.length; i++) {
            if (first[i] == second[i]) {
                matches++;
            }
        }

        System.out.println("Number of coincidences: " + matches);
    }
}