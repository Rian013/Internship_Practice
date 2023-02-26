import java.util.Scanner;
class StrongNumBetw{  
  public static void main(String args[]){    
    Scanner sc=new Scanner(System.in);    
    System.out.println("Enter range :");    
    int start=sc.nextInt();    
     int end=sc.nextInt(); 
    int fact=1;    
    int r=0,sum=0; 
    int temp =0;
    for(int i=start;i<=end;i++) { 
    temp=i;
     sum=0;
     r=0;
  while(temp>0)    //1!+2!+3!
    {      
      r=temp%10;      
      fact=1;      
      for(int j=1;j<=r;j++){        
        fact=fact*j;      
      }      
      sum=sum+fact;      
      temp=temp/10;    
    // System.out.println(sum);
    }    
    
     if(sum==i)    { 
     System.out.println(sum);      
    }
   }
  }
}