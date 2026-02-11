public class prefix {
    public static void main(String[] args) {
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int n = arr.length;

        int[] pf = new int[n];
        pf[0] = arr[0];
        for (int i = 0; i < n; i++) {
            pf[i] = arr[i] + pf[i - 1];
        }
        int count = 0;
        int LS;
        int RS;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                LS = 0;
            } else {
                LS = pf[i - 1];
            }
            RS = pf[n - 1] - pf[i];
            if (LS == RS) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}