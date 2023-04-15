package test.practice.programmers.Level0;

public class Level0_RectangleArea {
    public int my_solution(int[][] dots) {
        int answer = 0;
        // 1. row의 개수 = 4개(꼭지점 수)이므로 각 row의 최소 x, 최대x, 최소y, 최대y를 순서대로 배열에 저장한다.
        int[] xy = new int[4];
        // dots에 0열에 있는 x와 y좌표를 xy배열의 0,2번째 방에 저장한다.
        xy[0] = dots[0][0];
        xy[2] = dots[0][1];
        // dots의 1, 2, 3열과 0열을 비교하여 최소 x, 최대x, 최소y, 최대 y를 구한다.
        for(int i=1; i<4; i++){
            int x = dots[i][0];
            int y = dots[i][1];
            if(x>xy[0]) xy[1] = x;
            if(x<xy[0]){
                xy[1] = xy[0];
                xy[0] = x;
            }
            if(y>xy[2]) xy[3] = y;
            if(y<xy[2]){
                xy[3] = xy[2];
                xy[2] = y;
            }
        }
        //2. 직사각형의 넓이를 구한다.
        answer = (xy[3]-xy[2]) * (xy[1]-xy[0]);
        return answer;
    }
    public int best_solution(int[][] dots) {
        int answer = 0;
        //1. dots 0열의 x좌표를 구한다. 
        int tmp = dots[0][0];
        //2. 직사각형의 가로의 길이(tmp2)와 세로의 길이(tmp3)을 담을 변수를 미리 선언해둔다.
        int tmp2 = 0;
        int tmp3 = 0;
        for(int i = 1; i<dots.length; i++){
        	//i열의 x좌표가 0열의 x좌표(tmp)와 같으면 세로의 길이(tmp3)를 알 수 있다.(y좌표가 다르다.)
            if(dots[i][0] == tmp){
                tmp2 = Math.abs(dots[i][1] - dots[0][1]);
            //i열의 x좌표가 0열의 x좌표(tmp)와 다르면 가로의 길이(tmp2)를 알 수 있다. (x좌표가 다르다.)
            }else{
                tmp3 = Math.abs(dots[i][0] - dots[0][0]);
            }
        }
        //가로의 길이 * 세로의 길이 = 직사각형의 넓이
        answer = tmp2 * tmp3;
        return answer;
    }
}