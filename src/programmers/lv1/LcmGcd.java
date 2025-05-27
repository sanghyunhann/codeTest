package programmers.lv1;

//두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요.
//배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다.
//예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.

public class LcmGcd {
    public int[] solution(int n, int m) {
        int[] answer;
        int min;
        int gcd = 1;
        int nQuota = 0;
        int mQuota = 0;

        min = Math.min(n, m);

        for (int i=1; i<=min; i++) {
            if (n%i==0 && m%i==0) {
                gcd = i;
                nQuota = n/i;
                mQuota = m/i;
            }
        }
        answer = new int[]{gcd, gcd * nQuota * mQuota};
        return answer;
    }
}
