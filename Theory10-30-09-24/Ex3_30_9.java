import java.util.Scanner;

public class Ex3_30_9 {
    public static String smallestWindow(String s, String p) {
        if (s.length() < p.length()) {
            return "-1";
        }

        int[] pCnt = new int[26];
        for (char c : p.toCharArray()) {
            pCnt[c - 'a']++;
        }

        int[] windowCnts = new int[26];
        int required = 0;
        for (int count : pCnt) {
            if (count > 0) required++;
        }

        int l = 0, r = 0, formed = 0;
        int minLen = 100001;
        int minLeft = 0;

        while (r < s.length()) {
            char c = s.charAt(r);
            windowCnts[c - 'a']++;

            if (pCnt[c - 'a'] > 0 && windowCnts[c - 'a'] == pCnt[c - 'a']) {
                formed++;
            }

            while (l <= r && formed == required) {
                c = s.charAt(l);
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    minLeft = l;
                }

                windowCnts[c - 'a']--;
                if (pCnt[c - 'a'] > 0 && windowCnts[c - 'a'] < pCnt[c - 'a']) {
                    formed--;
                }
                l++;
            }
            r++;
        }

        return minLen == Integer.MAX_VALUE ? "-1" : s.substring(minLeft, minLeft + minLen);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s1 = input.next();
        String p1 = input.next();
        input.close();
        System.out.println(smallestWindow(s1, p1));
    }
}
