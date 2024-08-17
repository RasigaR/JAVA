package Aug12;

public class Source {
	public int getSecondSmallest(int[] arr) {
        if (arr == null || arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }

        int firstSmallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = num;
            } else if (num < secondSmallest && num != firstSmallest) {
                secondSmallest = num;
            }
        }

        return secondSmallest;
    }

    public static void main(String[] args) {
        Source source = new Source();
        int[] arr = {23, 45, 32, 22, 20, 96};
        System.out.println(source.getSecondSmallest(arr)); // Output should be 22
    }
}

