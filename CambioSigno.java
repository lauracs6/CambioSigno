public class CambioSigno {
      
    public static int signChange(int [] arr) {
        int counter = 0;
        
        for (int i = 0; i < arr.length - 1; i++) {
          if ((arr[i] >= 0 && arr[i + 1] < 0) || (arr[i] < 0 && arr[i + 1] >= 0)) {
            counter++;
          }
        }
        return counter;
      }
      
    public static void main(String[] args) {
        int [] arr1 = {1,-3,-4,0,5};
        int [] arr2 = {-1,2,-3,4,-5};
        System.out.println(signChange(arr1));
        System.out.println(signChange(arr2));
    }    
}
