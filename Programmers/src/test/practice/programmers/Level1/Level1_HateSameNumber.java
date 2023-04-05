package test.practice.programmers.Level1;

import java.util.ArrayList;
import java.util.Stack;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 * 
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 
 */
public class Level1_HateSameNumber {
    public int[] my_solution(int []arr) {
    	//arr배열을 거꾸로 뒤집어서 중복되지 않는 숫자를 순서대로 Stack객체에 쌓는다.
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            if(i==arr.length-1){
                stack.push(arr[arr.length-1]);
            } else {
                if(arr[i+1]!=arr[i]){
                    stack.push(arr[i]);
                }
            }
        }
        //Stack객체를 차례대로 꺼내어 answer을 구한다.
        int[] answer = new int[stack.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = stack.pop();
        }
        return answer;
    }
    // MEMO>> stack사용법 기억하기
    
    public int[] best_solution(int []arr) {
    	//이전의 숫자와 현재 숫자가 같지 않으면 tempList에 숫자를 추가한다.
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }
        //배열을 돌면서 answer array에 tempList를 추가한다.
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
