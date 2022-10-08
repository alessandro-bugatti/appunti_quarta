public class Main {
    public static int partition(int v[], int inizio, int fine){
        int pivot = fine;
        int i = inizio, j = fine - 1;
        while (true){
            while(v[i] < v[pivot]) i++;
            while(v[j] > v[pivot]){
                j--;
                if (j <= 0) break;
            }
            if (i > j)
                break;
            int temp = v[i];
            v[i] = v[j];
            v[j] = temp;
            i++;
            j--;
         }
        int temp = v[i];
        v[i] = v[pivot];
        v[pivot] = temp;
        return i;
    }

    public static void quickSort(int v[], int inizio, int fine){
        if (inizio >= fine)
            return;
        int i = partition(v, inizio, fine);
        quickSort(v, inizio, i - 1);
        quickSort(v, i + 1, fine);
    }

    public static void main(String[] args) {
        int v[] = {2,6,34,22,12,45,3, 92, 39, 101, 23};
        for (int i :
             v) {
            System.out.print(i + " ");
        }
        quickSort(v, 0, v.length - 1);
        System.out.println("\nOrdinato");
        for (int i :
                v) {
            System.out.print(i + " ");
        }
    }
}