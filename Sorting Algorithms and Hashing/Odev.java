//s26016
//Melis Toksoy



public class Odev {

    public static void ToplamiBul_Siralama(int[] arr, int n, int toplam) {
        quickSort(arr, 0, n - 1);
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == toplam) {
                System.out.println(arr[i] + " " + arr[j]);
                return;
            } else if (sum < toplam) {
                i++;
            } else {
                j--;
            }
        }
      
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pivot = arr[r];
            int i = l - 1;
            for (int j = l; j < r; j++) {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i + 1, r);
            int pi = i + 1;
            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, r);
        }
    }

    public static void ToplamiBul_Dograma(int[] arr, int n, int toplam) {
        IdeaHash hash = new IdeaHash(n);

        for (int i = 0; i < n; i++) {
            int complement = toplam - arr[i];
            HashElement elem = hash.find(complement);
            if (elem != null) {
                System.out.println( elem.elem + " " +  arr[i]);
                return;
            }
            hash.insert(arr[i]);
        }
    }
public static void AradakiSayilariBul(int[] arr, int n, int alt, int ust) {

    IdeaHash my_hash = new IdeaHash(n);

 
    for (int i = 0; i < n; i++) {
        my_hash.insert(arr[i]);
        
       
    }

    for (int i = alt + 1; i < ust; i++) {
        HashElement elem = my_hash.find(i);
        if (elem != null) {
            my_hash.insert(-i); 
        }
    }

    
    for (int i = alt + 1; i < ust; i++) {
        HashElement elem = my_hash.find(i);
        if (elem == null || elem.elem < 0) {
            System.out.println(i);
        }
    }
}

 
}
