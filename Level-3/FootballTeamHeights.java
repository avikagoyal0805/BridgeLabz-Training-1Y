public class FootballTeamHeights {

    // Generate random heights between 150 and 250
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int)(Math.random() * 101) + 150; 
        }
        return heights;
    }

    // Find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights)
            sum += h;
        return sum;
    }

    // Find mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Find shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights)
            if (h < min)
                min = h;
        return min;
    }

    // Find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights)
            if (h > max)
                max = h;
        return max;
    }

    public static void main(String[] args) {

        int[] heights = generateHeights(11);

        System.out.println("Player Heights:");
        for (int h : heights)
            System.out.print(h + " ");

        System.out.println("\n\nShortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        System.out.println("Mean Height: " + findMean(heights));
    }
}
