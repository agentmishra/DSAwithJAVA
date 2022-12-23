import java.util.Arrays;
import java.util.Scanner;

public class D_Triplets {
     public static void main(String[] args) {
          try (Scanner sc = new Scanner(System.in)) {
               int n = sc.nextInt();
               int p = sc.nextInt();
               int arr[] = new int[n];

               for (int i = 0; i < n; i++) {
                    arr[i] = sc.nextInt();
               }
               Arrays.sort(arr);
               int i = 0, j = 2;
               long count = 0;
               while (j < n) {
                    if (i == j - 1) {
                         j++;
                         continue;
                    } else if ((arr[j] - arr[i]) <= p) {
                         int diff = j - i;
                         count = count + (((diff) * (diff - 1)) / 2);
                         j++;
                    } else {
                         i++;
                    }
               }
               System.out.println(count);
          }
     }
}
