import java.util.*;
class Solution {
    static int answer = 1;
    public int solution(String before, String after) {
        char[] afterAry = after.toCharArray();
        char[] beforeAry = before.toCharArray();
        getResult(afterAry, beforeAry);
        return answer;
    }
    static void getResult(char[] aary, char[] bary){
        Arrays.sort(aary);
        Arrays.sort(bary);
        for(int i = 0; i < aary.length; i ++){
            if(aary[i] != bary[i]){
                answer = 0;
                break;
            }
        }
    }
}