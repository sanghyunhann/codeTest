import programmers.lv2.Min;
import programmers.lv2.MinMax;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        MinMax minMax = new MinMax();
        System.out.println(minMax.solution("-1 -1"));

        Min min = new Min();
        int [] A = {1, 4, 2};
        int [] B = {5, 4, 4};
        System.out.println(min.solution(A, B));
//        System.out.print("test");
    }

}