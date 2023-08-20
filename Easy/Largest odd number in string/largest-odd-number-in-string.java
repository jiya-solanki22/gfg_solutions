//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            String s = br.readLine();
            Solution obj = new Solution();
            System.out.println(obj.maxOdd(s));
        }
    }
}
// } Driver Code Ends


class Solution {

    String maxOdd(String S) {
        // code here
        String ans = "", res = "";
        int n = 0;
        char s[]=S.toCharArray();

        for(int i=0; i<s.length; i++){
            ans += s[i];
            n = s[i] - '0';

            if(n % 2 !=0)
                res = ans;
        }
        return res;
    }
}