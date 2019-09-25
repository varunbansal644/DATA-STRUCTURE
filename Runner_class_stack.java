import java.util.*;
class Stack
{
    int top,sie,data,capacity;
    int arr[];
    public Stack(int size)
    {
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    public boolean isFull()
    {
        return top==capacity-1;
    }
    public void push(int data)
    {
        if(isFull()==(size-1))
        {
            System.out.println("Stack is full");
        }
        else
        {
            top=top+1;
            arr[top]=data;
            System.out.println("value"+arr[top]);
        }
    }
    public int pop(int data)
    {
        return data;
    }
}
public class Runner_class_stack
{
    public static void main(String[] args)
    {
        Stack sk=new Stack(5);
        sk.push(10);
    }
}