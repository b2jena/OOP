package TutortAcademy;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int n = 5;
        int l = arr[0], h = arr[n - 1], mid = arr[n / 2];
        int key = 4;
        // binary search
        while (l < h) {
            if (arr[mid] == key) {
                System.out.print("found it: " + mid + " index has the key " + key);
                return;
            } else if (arr[mid] < key) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
    }
}
