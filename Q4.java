public class Q4 {
    public static boolean isEqual(int []x,int []y)
    {
        if (x.length!= y.length) return false;

        for (int i = 0; i < x.length; i++) {
            if (x[i]!=y[i]) return false;
        }
        return true;
    }



    public static void main(String[] args) {
        int[] x = {1,2,3};
        int[] y = {1,2,3};

        if (isEqual(x,y))
            System.out.println("The arrays are equal!");
        else
            System.out.println("The arrays are not equal!");
    }
}
