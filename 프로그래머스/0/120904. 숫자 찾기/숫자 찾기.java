class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String snum = num + "";
        if(snum.contains(k + "")){
            answer = snum.indexOf(k + "") + 1;
        }
        return answer;
    }
}