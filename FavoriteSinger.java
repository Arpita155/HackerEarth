package HackerEarth;
import java.util.HashMap;
import java.util.Scanner;
public class FavoriteSinger {
    public static void main(String []args ) {

        Scanner sc = new Scanner(System.in);

        HashMap<Long, Integer> map = new HashMap<>();
        System.out.println("Enter the number:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            long singer = sc.nextLong();
            map.put(singer, map.getOrDefault(singer, 0) + 1);
        }

        int maxFreq = 0;
        for (int count : map.values()) {
            if (count > maxFreq) {
                maxFreq = count;
            }
        }

        int ans = 0;
        for (int count : map.values()) {
            if (count == maxFreq){
                ans++;
            }
        }

        System.out.println(ans);

        sc.close();
    }
}
