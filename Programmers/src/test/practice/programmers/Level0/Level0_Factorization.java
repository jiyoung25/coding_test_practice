package test.practice.programmers.Level0;

import java.util.ArrayList;
import java.util.List;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120852
 * 
 * 소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
 * 예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
 * 따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때 n의 소인수를 오름차순으로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class Level0_Factorization {
    public int[] solution(int n) {
        List<Integer> numList = new ArrayList<>();
        //for문을 돌면서 인수인지 확인한다.
        for(int i=2; i<=n; i++){
            //나머지가 0이면 인수이다.
            if(n%i==0){
                numList.add(i);
                n/=i;
                //중복되는 인수는 생략한다.
                while(n%i==0){
                    n/=i;
                }
                //n이 1이 되면 for문을 빠져나간다.
                if(n==1){
                    break;
                }
            }
        }
        // arrayList를 배열로 만든다.
        int[] answer = new int[numList.size()];
        for(int i=0; i<numList.size(); i++){
            answer[i] = numList.get(i);
        }
        return answer;
    }
}
