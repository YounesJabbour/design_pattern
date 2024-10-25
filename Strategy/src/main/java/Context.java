public class Context {
    private ISort sortStrategy;
    public void search(int[] arr, int val) {
        sortStrategy.sort(arr, val);
    }

    public void setSortStrategy(ISort sortStrategy) {
        this.sortStrategy = sortStrategy;
    }
    public ISort getSortStrategy() {
        return sortStrategy;
    }
}
