package binary_search;

public class BinarySearch {
  public static int binarySearch(int[] list, int item){
    int low = 0;
    int high = list.length - 1;

    while(low <= high){
      int mid = (low + high) / 2;
      int kick = list[mid];
      if(kick == item){
        return mid;
      }if(kick > item){
        high = mid - 1;
      }else {
        low = mid + 1;
      }
    }
    return low;
  }

  public static void main(String[] args) {
      int[] list = {1, 3, 5, 7};
      int item = 5;

      int index = binarySearch(list,item); 
      System.out.println(index);
  }
}
