

//iterative--------- 

public int getcount()
{ 
node temp=head;
int count =0;
while(temp!=null)
{
count++;
temp=temp.next;
}
return count;
}

//recursive-------

int getcount(struct node* head)
{

//base case
if(head==null)
return 0;


//count is 1+ count of remaining list
return 1+getcount(head.next);
}
} 



