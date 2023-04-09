package test.practice.programmers.Level2;

import java.util.Arrays;

public class Level2_MakeMinValue {
    public int solution(int []A, int []B)
    {
        int answer = 0;
        // A와 B를 정렬한다.
        Arrays.sort(A);
        Arrays.sort(B);
        // A의 최솟값과 B의 최댓값을 곱한여 더한다.
        for(int i=0; i<A.length; i++){
            answer += A[i]*B[A.length-i-1];
        }
        return answer;
    }
}
