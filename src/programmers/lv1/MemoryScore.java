package programmers.lv1;

public class MemoryScore {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        for (int i=0; i< photo.length; i++) {
            int score = 0;
            for (String photoName : photo[i]) {
                for (int j=0; j< name.length; j++) {
                    if (photoName.equals(name[j])) {
                        score += yearning[j];
                    }
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}
