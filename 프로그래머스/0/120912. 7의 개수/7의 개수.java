class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String[] sary = new String[array.length];
        for(int i = 0; i < sary.length; i++){
            sary[i] = String.valueOf(array[i]); 
            for(int j = 0; j < sary[i].length(); j++){
                char c = sary[i].charAt(j);
                if(c - '0' == 7) answer ++;
            }
        } 
        return answer;
    }
}