import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] array = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            array[i] = Character.toLowerCase(my_string.charAt(i));
        }
        Arrays.sort(array);
        for(char c : array){
            answer += c +"";
        }
        return answer;
    }
}