package programmers.lv2;

// 피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다.
//
// 예를들어
//
// F(2) = F(0) + F(1) = 0 + 1 = 1
// F(3) = F(1) + F(2) = 1 + 1 = 2
// F(4) = F(2) + F(3) = 1 + 2 = 3
// F(5) = F(3) + F(4) = 2 + 3 = 5
// 와 같이 이어집니다.
//
// 2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.

public class Fibonacci {
    public int solution(int n) {
        int answer = 0;
        int[] result = new int [n+1];
        result[0] = 0;
        result[1] = 1;

        for(int i = 2; i <= n; i++) {
            result[i] = (result[i-1] + result[i-2]) % 1234567;
        }
        return result[n];
    }

//    public int solution(int n) {
//        int answer = 0;
//        long sequence [] = new long[n+1];
//
//        for (int i=0; i<=n; i++) {
//            if (i==0) {
//                sequence[0] = 0;
//            } else if (i==1) {
//                sequence[1] = 1;
//            } else {
//                sequence[i] = sequence[i-2] + sequence[i-1];
//            }
//            answer = (int) (sequence[i]%1234567L);
//        }
//        return answer;
//    }
}
