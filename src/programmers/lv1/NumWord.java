package programmers.lv1;

//네오와 프로도가 숫자놀이를 하고 있습니다.
//네오가 프로도에게 숫자를 건넬 때 일부 자릿수를 영단어로 바꾼 카드를 건네주면 프로도는 원래 숫자를 찾는 게임입니다.
//
//다음은 숫자의 일부 자릿수를 영단어로 바꾸는 예시입니다.
//
//1478 → "one4seveneight"
//234567 → "23four5six7"
//10203 → "1zerotwozero3"
//이렇게 숫자의 일부 자릿수가 영단어로 바뀌어졌거나, 혹은 바뀌지 않고 그대로인 문자열 s가 매개변수로 주어집니다.
//s가 의미하는 원래 숫자를 return 하도록 solution 함수를 완성해주세요.

import java.util.HashMap;

public class NumWord {
    public int solution(String s) {
        int answer = 0;
        HashMap<String, String> numList = new HashMap<String, String >();
        numList.put("zero", "0");
        numList.put("one", "1");
        numList.put("two", "2");
        numList.put("three", "3");
        numList.put("four", "4");
        numList.put("five", "5");
        numList.put("six", "6");
        numList.put("seven", "7");
        numList.put("eight", "8");
        numList.put("nine", "9");

        for (String key : numList.keySet()) {
            if (s.contains(key)) {
                s = s.replaceAll(key, numList.get(key));
            }
        }
        answer = Integer.parseInt(s);
        return answer;
    }
}
