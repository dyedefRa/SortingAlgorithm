public class SelectionSorting {

    public static void main(String[] args) {
       
    int dizi[] = {2, 65, 12, 30, 55, 6, 46 };

    selectionSort(dizi);

    for(int i = 0; i< dizi.length; i++)
        System.out.print(dizi[i]+ "\n");
    }
    
    public static void selectionSort(int[] a) {

        int hold,min_index;

        for(int i=0; i<a.length-1; i++)
        {
             min_index = i;

             for(int j=i+1; j<a.length; j++)
             {
                if(a[j] < a[min_index])
                   min_index = j;
             }

             hold = a[i];
             a[i] = a[min_index];
             a[min_index] = hold;
        }
    }
}