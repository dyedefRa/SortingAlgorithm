public class QuickSorting {

    public static void main(String[] args) {
       
    int dizi[] = {2, 65, 12, 30, 55, 6, 46 };
    QuickSorting qSorting = new QuickSorting();
    qSorting.sort(dizi, 0, dizi.length -1);

    for(int i = 0; i< dizi.length; i++)
        System.out.print(dizi[i]+ "\n");
    }
    
    int partition(int arr[], int low, int high) 
    { 
        int pivot = arr[high];  
        int i = (low-1); // index of smaller element 
        for (int j=low; j<high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] <= pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
  
  
    /* The main function that implements QuickSort() 
      arr[] --> Array to be sorted, 
      low  --> Starting index, 
      high  --> Ending index */
    void sort(int arr[], int low, int high) 
    { 
        if (low < high) 
        { 
            /* pi is partitioning index, arr[pi] is  
              now at right place */
            int pi = partition(arr, low, high); 
  

            sort(arr, low, pi-1); 
            sort(arr, pi+1, high); 
        } 
    } 
}