package TutortAcademy;

public class LeaderInAnArray {
    public static void main(String[] args) {
        int[] arr = new int[]{16, 17, 4, 3, 5, 2};
        for (int i = 0; i < 6; i++) {
            int l = arr[i];
            for (int j = i + 1; j < 6; j++) {
                if (l <= arr[j]) {

                }
            }
        }
    }
}
