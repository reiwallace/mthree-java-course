public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.println(arr[i]);
        }
    }
}