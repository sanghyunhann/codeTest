package programmers.lv1;

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
