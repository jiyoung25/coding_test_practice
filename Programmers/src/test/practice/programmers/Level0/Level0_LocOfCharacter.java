package test.practice.programmers.Level0;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/120861
 * 머쓱이는 RPG게임을 하고 있습니다.
 * 게임에는 up, down, left, right 방향키가 있으며 각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
 * 예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1], down을 누른다면 [0, -1], left를 누른다면 [-1, 0], right를 누른다면 [1, 0]입니다.
 * 머쓱이가 입력한 방향키의 배열 keyinput와 맵의 크기 board이 매개변수로 주어집니다.
 * 캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에 캐릭터의 좌표 [x, y]를 return하도록 solution 함수를 완성해주세요.
 */
public class Level0_LocOfCharacter {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];
        int boardX = board[0]/2;
        int boardY = board[1]/2;
        int x = 0;
        int y = 0;
        // x와 y좌표를 구한다.
        for(String tmp:keyinput){
            if(tmp.equals("left") && (Math.abs(x)<=boardX && x!=-boardX)){
                x -= 1;
            } else if(tmp.equals("right") && (Math.abs(x)<=boardX && x!=boardX)){
                x += 1;
                System.out.println(x);
            } else if(tmp.equals("up") && (Math.abs(y)<=boardY && y!=boardY)){
                y += 1;
            } else if(tmp.equals("down") && (Math.abs(y)<=boardY && y!=-boardY)){
                y -= 1;
            }
        }
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
    // MEMO>> 경우의 수를 항상 잘 생각하자.
    // 각 케이스에 x!=boardX 같은 경우를 넣지 않아서 좌표 끝에서 반대로 갈 때는 값이 더해지거나 빼지지 않았었다.
}
