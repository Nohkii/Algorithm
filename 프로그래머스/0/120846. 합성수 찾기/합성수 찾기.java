class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 1;
        for(int i = 4; i <= n; i++){
            count = 1;
            for(int j = 1; j <= i; j ++){
                if(count >= 3){
                    answer ++; 
                    break;
                } else if (i % j == 0) count ++;
            }
        }
        return answer;
    }
}