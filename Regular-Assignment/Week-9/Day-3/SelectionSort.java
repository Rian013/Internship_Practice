import java.util.Scanner;

 

class SelectionSort{
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println("enter array size");
    int n = s.nextInt();
    int arr[] = new int[n];
    System.out.println("enter array elements");
    for (int i = 0; i < n; i++) {
      arr[i] = s.nextInt();
    }

 

    System.out.println("Before Sort ");
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
  int temp=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]>arr[j]){
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
      }
    }
System.out.println("After Sort ");
    for(int i=0;i<n;i++){
      System.out.println(arr[i]);
    }
    
  }
}











// Bubble Sort:
// It is the simplest sort method which performs sorting by repeatedly moving the largest element to the highest index of the array. It comprises of comparing each element to its adjacent element and replace them accordingly.
 
// import java.util.*;
// class Bubble {
//   public static void main(String args[]) {
//     int i, n, t, j;
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter Array Size:");
//     n = sc.nextInt();
//     int a[] = new int[n];
//     System.out.println("Enter Elements to Array:");
//     for (i = 0; i < n; i++) {
//       a[i] = sc.nextInt();
//     }
//     System.out.println("The Elements Before Sorting is:");
//     for (i = 0; i < n; i++) {
//       System.out.print("\t" + a[i]);
//     }
//     // bubble sort
//     for (i = 0; i < n - 1; i++) {
//       for (j = 0; j < n - 1 - i; j++) {
//         if (a[j] > a[j + 1]) {
//           t = a[j];
//           a[j] = a[j + 1];
//           a[j + 1] = t;
//         }
//       }
//     }
//   System.out.println("\nThe Elements After Sorting is:");
//     for (i = 0; i < n; i++) {
//       System.out.print("\t" + a[i]);
//     }
 
// --------------------------------------------------------------------------------------------------
// Selection Sort:
// Selection sort finds the smallest element in the array and place it on the first place on the list, then it finds the second smallest element in the array and place it on the second place. This process continues until all the elements are moved to their correct ordering. It carries running time O(n2)
 
// import java.util.*;
// class Selection 
// {
//   public static void main(String args[]) 
//   {
//     int i, n, t, j;
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter Array Size:");
//     n=sc.nextInt();
//     int a[]=new int[n];
//     System.out.println("Enter Elements to Array:");
//     for(i=0;i<n;i++)
//       {
//         a[i]=sc.nextInt();
//       }
//    System.out.println("The Elements Before Sorting is:");
//     for(i=0;i<n;i++)
//       {
//         System.out.print("\t"+a[i]);
//       }
//     // Selections Sort
//      for(i=0;i<n-1;i++)
//        {
//          for(j=i+1;j<n;j++)
//            {
//              if(a[i]>a[j])
//              {
//                t=a[i];
//                a[i]=a[j];
//                a[j]=t;
//              }
//            }
//        }
 
// System.out.println("The Elements After Sorting is:");
//     for(i=0;i<n;i++)
//       {
//         System.out.print("\t"+a[i]);
//       }
 
//   }
// ------------------------------------------------------------------------------------------------
// Insertion Sort:
// As the name suggests, insertion sort inserts each element of the array to its proper place. It is a very simple sort method which is used to arrange the deck of cards while playing bridge.
 
// import java.util.*;
// class Insertion
//   {
//     public static void main(String args[])
//     {
//        int i,j,t,n;
//       Scanner sc=new Scanner(System.in);
//        System.out.println("Enter Array Size:");
//        n=sc.nextInt();
//       int a[]=new int[n];
 
 
 
//       System.out.println("Enter Array Size:");
//       for(i=0;i<a.length;i++)
//         {
//           a[i]=sc.nextInt(); 
//         }
//       System.out.println("The Elements Before Sorting is:");
//       for(i=0;i<a.length;i++)
//         {
//           System.out.println("\t"+a[i]);
//         }
//          //Insertion Sort  
//            for(i=1;i<=n-1;i++)
//                  {          
//               for(j=i;j>0 && a[j-1]>a[j];j--)
//                {
//                          t=a[j];
//                          a[j]=a[j-1];
//                          a[j-1]=t;
//                   }
//             }
//      System.out.println("The Elements After Sorting is:");
//       for(i=0;i<a.length;i++)
//         {
//           System.out.println("\t"+a[i]);
//         }
//     }
//   }