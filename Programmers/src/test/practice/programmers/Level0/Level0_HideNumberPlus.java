package test.practice.programmers.Level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120864
 * 
 * 문자열 my_string이 매개변수로 주어집니다. my_string은 소문자, 대문자, 자연수로만 구성되어있습니다. my_string안의 자연수들의 합을 return하도록 solution 함수를 완성해주세요.
 */
public class Level0_HideNumberPlus {
	//나의 해설
    public int my_solution(String my_string) {
        int answer = 0;
        //배열을 돌아서 문자의 char값이 숫자가 아니면 해당 문자를 공백문자로, 숫자면 숫자로하여 StringBuilder로 쌓는다.
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            char my_char = my_string.charAt(i);
            if(('a'<=my_char && my_char<='z')||('A'<=my_char && my_char<='Z')){
                sb.append(" ");    
            } else {
                sb.append(my_char);
            }
        }
        //StringBuilder를 String으로 바꾼다.
        String build_str = sb.toString();
        System.out.println(build_str);
        //공백문자를 기준으로하여 string을 나눈다.
        String[] build_arr = build_str.split("\\s+");
        //숫자를 더한다.
        for(String tmp:build_arr){
            System.out.println(tmp);
            //build_str이 공백문자열로 시작하면 build_arr[0] = ""이다.
            if(!tmp.equals("")){
                answer+=Integer.parseInt(tmp);
            }
        }
        return answer;
    }
    // MEMO>> str.split("\\s+"); --> 하나 이상의 공백 문자열을 기준으로 split한다.
    
    // 추천이 가장 많은 solution
    public int best_solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");

        for(String s : str){
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}
