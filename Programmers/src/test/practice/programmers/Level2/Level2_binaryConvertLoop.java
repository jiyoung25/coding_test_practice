package test.practice.programmers.Level2;
/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/70129
 * 
 * 0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.
 *	1.x의 모든 0을 제거합니다.
 *	2. x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
 * 0과 1로 이루어진 문자열 s가 매개변수로 주어집니다. s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때, 이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아 return 하도록 solution 함수를 완성해주세요.
 */
public class Level2_binaryConvertLoop {
    public int[] solution(String s) {
        int[] answer = new int[2];
        // 반복 횟수와 제거한 0의 개수를 저장할 변수 선언
        int loopCount = 0;
        int zeroCount = 0;
        // s가 "1"이 될 때까지 반복한다.
        while(true){
        	// sb와 sArr은 while문이 반복될 때마다 초기화되도록 이 곳에 선언한다.
            StringBuilder sb = new StringBuilder();
            String[] sArr = s.split("");
            // sb를 이용해 0을 제거한 새로운 s를 만든다.
            for(int i=0; i<s.length(); i++){
                if(!sArr[i].equals("0")){
                    sb.append("1");
                } else {
                	// 제거한 0의 개수를 추가한다.
                    zeroCount++;
                }
            }
            // while문의 반복 횟수를 센다.
            loopCount++;
            s=sb.toString();
            System.out.println(s);
            //새로 만들어진 s의 길이를 구해 2진수를 만든다.
            int length = s.length();
            s= Integer.toString(length,2);
            System.out.println(s);
            if(s.equals("1")) break;
        }
        answer[0] = loopCount;
        answer[1] = zeroCount;
        return answer;
    }
}
