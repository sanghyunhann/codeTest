package programmers.lv1;

//자연수 n이 매개변수로 주어집니다.
//n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

public class TernaryScale2 {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();

        while (n>=3) {
            sb.append(n%3);
            n = n/3;
        }
        sb.append(n);

        for (int i=0; i<sb.length(); i++) {
            answer += (sb.charAt(i)-'0') * Math.pow(3, sb.length()-1-i);
        }
        return answer;
    }
}
