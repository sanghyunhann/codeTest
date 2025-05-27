package programmers.lv1;

//자연수 n이 매개변수로 주어집니다.
//n을 3진법 상에서 앞뒤로 뒤집은 후, 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.

public class TernaryScale {
    public int solution(int n) {
        int answer = 0;
        int remainder;
        String result = "";
        Double sum = 0.0;

        while (n>=3) {
            remainder = n%3;
            result += remainder;
            n = n/3;
        }
        result += n;

        Integer.parseInt(String.valueOf(result.charAt(0)));
        for (int i=0; i<result.length(); i++) {
            Double j = Double.parseDouble(String.valueOf(result.charAt(result.length()-1-i)));
            sum += Math.pow(3, i) * j;
        }

        return answer = (int) Math.round(sum);
    }
}
