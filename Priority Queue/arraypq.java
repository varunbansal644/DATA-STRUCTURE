import java.util.*;
class PriorityQ{
    int arr[]=new int[10];
    int nItems=0;
    public int size(){
        return nItems;
    }
    public boolean isEmpty(){
      //  if(nItems==0) return true;
      //  return false;
      return nItems==0;
    }
    public int getPeek(){ //Highest priority element whisch is at arr[n-1]
        return arr[nItems-1];
    }
    public int remove(){    //poll function
       // int val=arr[nItems];
       // nItems--;
       // return val;
       return arr[--nItems];// arr[phele value v return ho jayegi and decremment v ho jayaga]
    }
    public void insert(int val){
        if(nItems==0){
            arr[0]=val;
            nItems++;
            return;
        }
        int i;
        for(i=nItems-1;i>=0;i--){
            if(val<arr[i]){    //max heap to min heap we will change the sign of arrow
                arr[i+1]=arr[i];
            }
            else{
                break;
            }
        }
        arr[i+1]=val;
        nItems++;
    }
    public void print(){
        for(int i=0;i<nItems;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class arraypq{
    public static void main(String[] args){
    PriorityQ a=new PriorityQ();
    a.insert(5);
    a.insert(2);
    a.insert(7);
    a.insert(9);
    a.print();
    System.out.println(a.size());
    System.out.println(a.getPeek());
    System.out.println(a.remove());
    a.print();
    }
}