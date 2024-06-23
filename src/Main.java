import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String cuvant = scanner.next();


        int[] vocalConsoanaArray = new int[cuvant.length()];
        int count = 0;

        for (int i = 0; i < cuvant.length(); i++) {
            char litera = cuvant.charAt(i);
            switch (litera) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    vocalConsoanaArray[i] = 1;
                    break;
                default:
                    vocalConsoanaArray[i] = 0;
            }
        }

        for (int i = 0; i < vocalConsoanaArray.length - 2; i++) {
            if (vocalConsoanaArray[i] == vocalConsoanaArray[i + 1] &&
                    vocalConsoanaArray[i + 1] == vocalConsoanaArray[i + 2]) {
                vocalConsoanaArray[i] = vocalConsoanaArray[i + 1] = 2;
                count++;
            }
        }

        System.out.println(count);

    }
}