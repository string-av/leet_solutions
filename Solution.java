import java.util.Arrays;

public class remElement {
    public static int removeElement(int[] ar, int val) {
        int count = 0, a = 0;
        int[] temp = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == val) {
                ar[i] = 0;
            } else {
                temp[a++] = ar[i];
                count++;
            }
        }
        System.arraycopy(temp, 0, ar, 0, a);
        return count;
    }

    public static void main(String[] args) {
        int[] ar = {3, 2, 2, 3};
        int count = removeElement(ar, 3);
        for(int i = 0; i < ar.length - count; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println(count);
    }
}
