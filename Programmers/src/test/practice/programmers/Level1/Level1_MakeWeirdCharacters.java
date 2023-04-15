package test.practice.programmers.Level1;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/12930
 * 
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 */
public class Level1_MakeWeirdCharacters {
	class Solution {
	    public String solution(String s) {
	    	//답 문자열을 누적시킬StringBuilder와 index를 셀 변수 선언
	        StringBuilder sb = new StringBuilder();
	        int num = 0;
	        //s의 길이만큼 반복문을 돌면서
	        for(int i=0; i<s.length(); i++){
	            String str = ""+s.charAt(i);
	            //문자가 공백이 아니면 짝수번 째 문자이면 sb에 대문자를, 홀수번 째 문자이면 sb에 소문자를 누적시킨다.
	            if(!str.equals(" ")){
	                if(num%2 == 0){
	                    sb.append(str.toUpperCase());
	                } else{
	                    sb.append(str.toLowerCase());
	                }
	                //문자열이 짝수번 째인지 홀수번 째인지 count해주는 변수
	                num++;
	            //문자가 공백이면 count를 0으로 리셋시키고 sb에 공백문자를 누적시킨다.
	            } else{
	                num = 0;
	                sb.append(" ");
	            }
	        }
	        return sb.toString();
	    }
	}
}
