package TutortAcademy;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = new int[12];
        arr = new int[]{2, 13, 15, 17, 9, 5, 12, 8, 16, 19, 18, 19};
        // 2 pass solution
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i = 0; i < 12; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } // second < arr[i] < first
            else if (arr[i] > second && arr[i] < first) {
                second = arr[i];
            }
        }
        System.out.println(first + " " + second);
    }
}
