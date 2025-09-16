package HackerEarth;

import java.util.Scanner;

public class PalindromicString {
    public static void main(String []args ) throws Exception {
        //Scanner
        System.out.println("Enter the String: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String rev = "";
        for(int i=s.length()-1;i>=0;i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
