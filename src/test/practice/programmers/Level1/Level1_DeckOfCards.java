package test.practice.programmers.Level1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * https://school.programmers.co.kr/learn/courses/30/lessons/159994?language=java
 * 
 * 코니는 영어 단어가 적힌 카드 뭉치 두 개를 선물로 받았습니다. 코니는 다음과 같은 규칙으로 카드에 적힌 단어들을 사용해 원하는 순서의 단어 배열을 만들 수 있는지 알고 싶습니다.
 * 원하는 카드 뭉치에서 카드를 순서대로 한 장씩 사용합니다.
 * 한 번 사용한 카드는 다시 사용할 수 없습니다.
 * 카드를 사용하지 않고 다음 카드로 넘어갈 수 없습니다.
 * 기존에 주어진 카드 뭉치의 단어 순서는 바꿀 수 없습니다.
 * 예를 들어 첫 번째 카드 뭉치에 순서대로 ["i", "drink", "water"], 두 번째 카드 뭉치에 순서대로 ["want", "to"]가 적혀있을 때 ["i", "want", "to", "drink", "water"] 순서의 단어 배열을 만들려고 한다면 첫 번째 카드 뭉치에서 "i"를 사용한 후 두 번째 카드 뭉치에서 "want"와 "to"를 사용하고 첫 번째 카드뭉치에 "drink"와 "water"를 차례대로 사용하면 원하는 순서의 단어 배열을 만들 수 있습니다.
 * 문자열로 이루어진 배열 cards1, cards2와 원하는 단어 배열 goal이 매개변수로 주어질 때, cards1과 cards2에 적힌 단어들로 goal를 만들 있다면 "Yes"를, 만들 수 없다면 "No"를 return하는 solution 함수를 완성해주세요.
 */

public class Level1_DeckOfCards {

    public String my_solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        //cards1과 cards2 각각의 단어에 순서를 부여한다.
        Map<String, Integer> cardMap1 = new HashMap<>();
        Map<String, Integer> cardMap2 = new HashMap<>();
        for(int i=0; i<cards1.length; i++){
            cardMap1.put(cards1[i], i);
        }
        for(int i=0; i<cards2.length; i++){
            cardMap2.put(cards2[i], i);
        }
        //goal의 단어를 cards1과 cards2로 분리하여 ArrayList type의 객체에 담는다.
        List<Integer> cardList1 = new ArrayList<>();
        List<Integer> cardList2 = new ArrayList<>();
        for(int i=0; i<goal.length; i++){
            if(cardMap1.get(goal[i])!=null){
                cardList1.add(cardMap1.get(goal[i]));
            } else if(cardMap2.get(goal[i])!=null){
                cardList2.add(cardMap2.get(goal[i]));
            } else {
                //cards1과 cards2에 해당되지 않는 단어가 goal에 있으면 return No
                return "No";
            }
        }
        //순서가 오름차순인지 cardList1과 cardList2를 각각 테스트해본다.
        //isSorted라는 변수를 선언하여 오름차순으로 정렬되어있지 않으면 false를 기억시킨다.
        boolean isSorted = true;
        for(int i=0; i<cardList1.size()-1; i++){
            if(cardList1.get(i)+1 != cardList1.get(i+1)){
                isSorted = false;
            }
        }
        for(int i=0; i<cardList2.size()-1; i++){
            if(cardList2.get(i)+1 != cardList2.get(i+1)){
                isSorted = false;
            }
        }
        //오름차순이면(isSorted = true) answer="Yes", 아니면(isSorted=false) answer="No"
        System.out.println(isSorted);
        answer = isSorted ? "Yes" : "No";
        return answer;
    }
    /* MEMO>>
     * 내 풀이는 너무 길다..
     */
    public String diffrent_solution1(String[] cards1, String[] cards2, String[] goal) {
        //cards1과 cards2 array의 index값을 저장할 int변수를 선언한다.
    	int cardIdx1 = 0;
        int cardIdx2 = 0;

        for(int i=0; i<goal.length; i++){
        	//target이라는 변수에 goal[i]를 담는다.
            String target = goal[i];
            /* cards1[cardIdx1]과 goal[i]가 일치하면 cardIdx1의 값을 높이고 같지 않다면
             * cards2[cardIdx]과 goal[i]가 일치하면 cardIdx2의 값을 높인다.
             * 둘 다 아니라면 cards1과 cards2를 순서대로 뽑지 않은 것이거나 중간에 한 번 건너뛴 것이다.
             */
            if(cardIdx1 < cards1.length && target.equals(cards1[cardIdx1]))
                cardIdx1 ++;
            else if (cardIdx2 < cards2.length && target.equals(cards2[cardIdx2]))
                cardIdx2++;
            else
                return "No";
        }


        return "Yes";
    }
}