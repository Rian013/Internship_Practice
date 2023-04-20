import java.util.Scanner;
class ArraySearch{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of an array");
    int  n=sc.nextInt();
    int arr[]={1,2,3,4,5};
    System.out.println("enter the element to be searched");
    int searchElement=sc.nextInt();
    for(int i=0;i<n;i++){
      if(arr[i]==searchElement){
        System.out.println("element found"+arr[i]);
      }
     
    }
  }
}


// import java.util.Scanner;

 

// class LinearSearchDemo {
//   public static void main(String args[]) {
//     Scanner s = new Scanner(System.in);
//     System.out.println("enter array size");
//     int n = s.nextInt();
//     int arr[] = new int[n];
//     System.out.println("enter array elements");
//     for (int i = 0; i < n; i++) {
//       arr[i] = s.nextInt();
//     }

 

//     System.out.println("enter element to search");
//     int key = s.nextInt();
//     int count = 0;
//     for (int i = 0; i < n; i++) {
//       if (arr[i] == key) {
//         count = 1;
//         System.out.println("Yes it is found in index number " + i);
//         break;
//       }
//     }
//     if (count == 0) {
//       System.out.println("Not Found");
//     }
//   }
// }