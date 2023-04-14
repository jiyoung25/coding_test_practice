package test.practice.programmers.Level1;

public class Level1_BinaryAdd {
    public String solution(String bin1, String bin2) {
        String answer = "";
        //bin1과 bin2를 10진법으로 바꾼다.
        int num1 = Integer.valueOf(bin1, 2);
        int num2 = Integer.valueOf(bin2, 2);
        //두 수를 합한다.
        int sum = num1+num2;
        //합한 수를 다시 2진법으로 바꾼다.
        answer = Integer.toString(sum, 2);
        return answer;
    }
}
