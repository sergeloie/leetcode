package matrix;

public class FlippingAnImage_832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] arr : image) {
            flip(arr);
            invert(arr);
        }
        return image;
    }

    public void flip(int[] arr) {
        int lastIndex = arr.length / 2 - 1;
        for (int i = 0; i <= lastIndex; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public void invert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (arr[i] + 1) % 2;
        }
    }
}
