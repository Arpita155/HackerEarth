package HackerEarth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class CostOfBalloons {
    public static void main(String []args ) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0) {
            int greenPrice = sc.nextInt();
            int purplePrice = sc.nextInt();

            int participants = sc.nextInt();

            int firstQuestion = 0;
            int secondQuestion = 0;
            while(participants-- > 0) {
                int q1 = sc.nextInt();
                int q2 = sc.nextInt();

                if(q1 == 1) {
                    firstQuestion++;
                }
                if(q2 == 1) {
                    secondQuestion++;
                }
            }
            int situation1 = greenPrice * firstQuestion + purplePrice * secondQuestion;

            int situation2 = purplePrice * firstQuestion + greenPrice * secondQuestion;

            if (situation1 > situation2) {
                System.out.print(situation2 + "\n");
            } else {
                System.out.print(situation1 + "\n");
            }
        }
    }
}

