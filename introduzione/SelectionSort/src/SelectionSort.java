public class SelectionSort {
    private static void SelectionSort(int []v){
        //Selection Sort
        for (int i = 0; i < v.length-1; i++) {
            int PosMin = i;
            for (int j = i+1; j < v.length; j++) {
                if(v[j]<v[PosMin]){
                    PosMin =j;
                }
            }
            int temp = v[i];
            v[i]=v[PosMin];
            v[PosMin]=temp;
        }
    }
    public static void main (String [] strings){
        int []v;
        v = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = (int)(Math.random()*100);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + v[i]);
        }
        System.out.println();
        SelectionSort(v);
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + v[i]);
        }
    }
}
