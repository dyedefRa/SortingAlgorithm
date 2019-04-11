public class SelectionSorting {

    public static void main(String[] args) {
       
    int dizi[] = {2, 65, 12, 30, 55, 6, 46 };

    insertionSort(dizi);

    for(int i = 0; i< dizi.length; i++)
        System.out.print(dizi[i]+ "\n");
    }
    
    public static void insertionSort(int[] a) {
        
       int insert; 
       int moveItem;

       for(int next=1; next<a.length; next++) 
       { 
            insert = a[next]; 
            moveItem = next; 

            while(moveItem > 0 && insert < a[moveItem-1])
            {
                a[moveItem] = a[moveItem-1]; 
                moveItem--;
            }

            a[moveItem] = insert;
       }
    }
}