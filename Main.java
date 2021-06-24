

public class Main {
    public static void main(String[] args){
        
        int n=4;
        int x=6;
        int[]arr={5,8,10,12};
        //long arr[]=new long[n+1];
        System.out.println(exist(arr,x));   
       
    }
    public static boolean exist(int[]arr,int x){
        return indexOf(arr,x)!=-1;
    }
    public static long fibC(int n){
        long a=1;
        long b=1;
        long c=a+b;
        for(int i=2;i<n;i++){
            a=c;
            c=b+c;
            b=a;
        }
        return b;
    }    
    public static long fibB(int n){
        long[] arr=new long[n];
        arr[0]=1;
        if(n>=2)
            arr[1]=1;
        for (int i = 2; i < arr.length; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        } 
        return arr[n-1];       
    }



    public static int reverseDigit(int x,int temp){
        if(x==0)
            return temp;
        int lastDigit=x%10;
        
        return reverseDigit(x/10,temp*10+lastDigit);


    }
    public static boolean foo(int[]arr,int x){// תרגיל 3 ש"ב 27.05.21
        for (int i = 0; i < arr.length; i++){
            if(arr[i]==x)
            return true;
    } 
    return false; 
    
    }
    public static int latest(int []arr,int x){ // תרגיל 2
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==x)
                return i;        
        }
        return -1;
    }
    public static int index(int[]arr,int x,int y,int z){// תרגיל 1
        int left=y;
        int right=z;
        if(y>z){
            left=z;
            right=y;
        }
        for (int i = left; i <= right; i++) {
            if(arr[i]==x)
                return i; 
        }
        return -1;

    }
    public static int indexOf(int[]arr,int x){// תרגיל בכיתה 3
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==x)
                return i;
        }
        return -1;        
            
    }
    public static void printArray(int[]arr){// תרגיל 1 בכיתה
        System.out.print("{");
        for(int i=0;i<arr.length-1;i++){
            System.out.print(arr[i]+",");
        }
        if(arr.length!=0)
            System.out.print(arr[arr.length-1]);
    }
    public static int max(int[]arr){// תרגיל 2 בכיתה
        if(arr.length==0)
        return -1;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];    
        }
        return(max);
       
        
    }
              

}