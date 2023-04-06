package test.practice.programmers.Level1;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/12950
 * 
 * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다.
 * 2개의 행렬 arr1과 arr2를 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
 */
public class Level1_MatrixAddition {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // row의 개수를 구한다.
        int arrRowLength = arr1.length;
        System.out.println(arrRowLength);
        //각 row의 column의 개수를 구한다.
        int columnLength =0;
        columnLength = arr1[0].length;
        //answer의 이차원 배열 객체를 만든다.
        int[][] answer = new int[arrRowLength][columnLength];
        //for문을 돌아 답을 구한다.
        for(int i=0; i<arrRowLength; i++){
            for(int j=0; j<columnLength; j++){
                answer[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return answer;
    }
}
