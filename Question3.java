/*
Java program to implement two stacks in a single array.
[11 5                 10 15 7 40]
Note: Please check is required to be update in list and then define test case.
Input values :
push1(5); 
push2(10); 
push2(15); 
push1(11); 
push2(7); 
push2(40);
Output: (Required to be printed like this only)
Popped element from stack1 is 11
Popped element from stack2 is 40
*/
class Question3
{
	private int arr;
	private int top1;
	private int top2;
	private int size;
	Question2()
	{
		arr=new int[10];
		size=10;
		top1=size/2-+1;
		top2=size/2;
	}
	void push1(int data);
	{
		if(top1>0)
		{
			top1--;
			arr[top1]=data;
		}
		else
		{
			System.out.print("STACK IS FULL---OVERFLOW");
			return;
		}
	}
	
	void push2(int data);
	{
		if(top2>0)
		{
			top2++;
			arr[top2]=data;
		}
		else
		{
			System.out.print("STACK IS FULL---OVERFLOW");
		return;	
		}
	}
	int pop1()
	{
		if(size/2>=top1)
		{
			int data=arr[top1];
			top1++;
			return data;
		}
		else
		{
			System.out.println("STACK IS EMPTY----UNDERFLOW");
			return-1;
		}
		return 0;
	}
	int pop2()
	{
		if(size/2>=top2)
		{
			int data=arr[top2];
			top2++;
			return data;
		}
		else
		{
			System.out.println("STACK IS EMPTY----UNDERFLOW");
			return-1;
		}
		return 0;
	}
	void display()
	{
		for(int i=0;)
	}
	public static void main(String[] args)
	{
		Question3 q=new Question3();
			q.push1(5);
			q.push2(10);
			q.push2(15); 
			q.push1(11); 
			q.push2(7); 
			q.push2(40);
			q.pop();
			q.pop();
	}
}