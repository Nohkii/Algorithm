import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        char[] afterAry = after.toCharArray();
        char[] beforeAry = before.toCharArray();
        Arrays.sort(afterAry);
        Arrays.sort(beforeAry);
        for(int i = 0; i < afterAry.length; i ++){
            if(afterAry[i] != beforeAry[i]) return 0;
        }
        return answer;
    }
}