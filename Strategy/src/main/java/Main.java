public class Main {
    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };

        Context context = new Context();

        context.setSortStrategy(new BubbleSort());
        context.search(arr, 22);
        context.setSortStrategy(new MergeSort());
        context.search(arr, 90);
    }
}
