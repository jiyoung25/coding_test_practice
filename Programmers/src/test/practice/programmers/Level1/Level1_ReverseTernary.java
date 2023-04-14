package test.practice.programmers.Level1;

public class Level1_ReverseTernary {
	/*
	 * https://school.programmers.co.kr/learn/courses/30/lessons/68935
	 * 
	 * 자연수 n이 매개변수로 주어집니다. n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
	 */
    public int my_solution(int n) {
        //n을 3진법으로 만든다.
        String transN = Integer.toString(n,3);
        //StringBuffer를 이용하여 transN을 뒤집는다.
        System.out.println(transN);
        StringBuffer sb = new StringBuffer(transN);
        String reverseTransN = sb.reverse().toString();
        System.out.println(reverseTransN);
        // 3진수를 10진수로 바꾼다.
        int answer = Integer.valueOf(reverseTransN,3);
        System.out.println(answer);
        return answer;
    }
    /* MEMO>>
     * 
     * * 10진법 -> n진법
     *  Integer.toString(int a, n);
     * * n진법 -> 10진법
     *  Integer.valueOf(String b, n);
     * * 문자열 뒤집기
     *  StringBuffer sb = new StringBuffer(String c);
     *  sb.reverse().toString();
     */   
}
