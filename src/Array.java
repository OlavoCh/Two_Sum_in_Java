public class Array {
    int[] ar1 = {1, 2, 3, 4, 5};
    //int[] ar2 = {1,2,3,4,5};
    int sum = 0;

    public static void main(String[] agrs) {
        Array ar = new Array();
        for (int i = 0; i <= ar.ar1.length - 1; i++) {
            int n1 = ar.ar1[i];

            for (int j = 0; j <= ar.ar1.length - 1; j++) {
                int n2 = ar.ar1[j];

                ar.sum = n1 + n2;
                if (ar.sum == 7) {
                    System.out.print(ar.sum + " = " + n1 + " + " + n2);
                    System.out.println(" [" + j + "," + i + "]");
                    return;
                }
            }
        }
    }

}
