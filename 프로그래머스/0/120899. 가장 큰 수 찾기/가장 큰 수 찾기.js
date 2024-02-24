function solution(array) {
    let max = array[0];
    let count = 0;
    for(let i = 1; i <= array.length; i++){
        if(max < array[i]){
            max = array[i];
            count = i;
        }
    }
    var answer = [max, count];
    return answer;
}