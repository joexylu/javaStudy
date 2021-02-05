public class Max {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int maxNum = -99999;
        int i = 0;
        while (i < m.length) { //termination
            if(maxNum < m[i]){
                maxNum = m[i];
            }
            i = i + 1; //increment
        }
        return maxNum;
    }
    public static void main(String[] args) {
       int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
       System.out.println(max(numbers));
      
    }
}