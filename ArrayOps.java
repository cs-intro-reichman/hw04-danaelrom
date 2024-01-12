public class ArrayOps {
    public static void main(String[] args) {
        System.out.println(isSorted(new int[] {1,1,500}));
    }
    
    public static int findMissingInt (int [] array) {
        int n = array.length;
        int sumNums = 0 ;
        int sumArray = 0 ;  
        for(int j = 0; j < n; j++){
            sumArray = sumArray + array[j];
        }
        for(int i = 1; i <= n; i++){
            sumNums = sumNums + i;
        }
       
        return sumNums - sumArray;
    }

    public static int secondMaxValue(int [] array) {
        int max = 0;
       for(int i = 0; i < array.length; i++){
           if (max < array[i]){
               max = array[i];
           }
       }
       int gap = max;
       for(int j = 0; j < array.length; j++){
           if (max - array[j] < gap && max - array[j] != 0){
               gap = max - array[j];
           }
       }
        return max - gap;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean first = true;
        boolean second = true;
        
        for(int i = 0; i < array1.length; i++){
            int count = 0;
            for(int j = 0; j < array2.length; j++){
                if(array1[i] == array2[j]){
                    count++;
                }
            }
            if(count == 0){
                first = false;
                break;
            }
        }
       
        for(int m = 0; m < array2.length; m++) {
            int count = 0;
            for (int n = 0; n < array1.length; n++) {
                if (array2[m] == array1[n]) {
                    count++;
                }
            }
            if (count == 0) {
                second = false;
                 break;
            }
        }

        return (first && second);
    }

    public static boolean isSorted (int [] array) {
        boolean up = true;
        boolean down = true;
        for(int i = 1; i < array.length; i++){
            if(array[i-1] > array[i]){
                up = false;
            }
        }
        for(int j = 1; j < array.length; j++){
            if(array[j-1] < array[j]){
                down = false;
            }
        }
        return (down || up);
    }

}
