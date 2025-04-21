package programmers.lv2;

import java.util.Arrays;

public class Min {

    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);

        if (A.length == B.length) {
            for (int i=0; i<A.length; i++) {
                answer += A[i] * B[B.length-i-1];
            }
        }
        return answer;
    }
}
