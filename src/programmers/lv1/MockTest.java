package programmers.lv1;

//수포자는 수학을 포기한 사람의 준말입니다.
//수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다.
//수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
//
//1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
//2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
//3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
//
//1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때,
//가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.

import java.util.ArrayList;

public class MockTest {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = {0, 0, 0};
        int max = 0;
        int cnt = 0;

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == first[i%5]) {
                score[0]++;
            }
            if (answers[i] == second[i%8]) {
                score[1]++;
            }
            if (answers[i] == third[i%10]) {
                score[2]++;
            }
        }

        max = Math.max(Math.max(score[0], score[1]), score[2]);

        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++){
            if (max == score[i]) {
                result.add(i+1);
            }
        }

        int[] answer = new int [result.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
