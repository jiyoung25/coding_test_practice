package test.practice.programmers.Level0;

import java.util.Stack;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120853
 * 
 * 숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다. 문자열에 있는 숫자를 차례대로 더하려고 합니다. 이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다. 숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.
 */
public class Level0_CtrlZ {
	// 나의 solution
    public int my_solution(String s) {
        int answer = 0;
        //s를 공백문자로 나눈 배열을 구한다.
        String[] sArr = s.split(" ");
        //배열을 돌면서 Z가 아니면 숫자를 더하고 Z면 전의 숫자를 뺀다.
        for(int i=0; i<sArr.length; i++){
            answer += sArr[i].equals("Z") ? -(Integer.parseInt(sArr[i-1])) : Integer.parseInt(sArr[i]);
        }
        return answer;
    }
    
    // 추천이 가장 많은 solution
    // Stack 활용
    public int best_solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (String w : s.split(" ")) {
            if (w.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(w));
            }
        }
        for (int i : stack) {
            answer += i;
        }
        return answer;
    }
}
