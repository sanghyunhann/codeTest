package programmers.lv1;

//정수 배열 numbers가 주어집니다.
//numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에
//오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

import java.util.HashSet;
import java.util.Set;

public class TwoAdd {
    public int[] solution(int[] numbers) {
        Set<Integer> ans = new HashSet();
        int[] answer = {};

        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                ans.add(numbers[i] + numbers[j]);
            }
        }
        answer = ans
                .stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
