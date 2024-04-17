package a.Test;

public class stackExample1 {

    int maxSize;
	int top;
	int[] StackArray;

	public stackExample1(int size){
		this. maxSize=size;
		this. StackArray=new int[maxSize];
		this.top=-1;

	}

	public void push(int value){
		if(top<maxSize-1){
			StackArray[++top]=value;
			System.out.println("Pushed " + value +"to the Stack");
		}else{
			System.out.println("Stack OverFlow Cannot Push" + value);
		}
	}
		public int pop(){
			if(top>=0){
				int popedValue = StackArray[top--];
				System.out.println("Poped" + popedValue + "From the stack");
				return popedValue;
			}else{
				System.out.println("StackUnderFlow Cannot pop");
				return-1;

			}
		}
			public static void main(String args[]){
				stackExample1 stack = new stackExample1(5);
				stack.push(10);
				stack.push(20);
				stack.push(30);
				stack.push(40);
				stack.push(50);
				//more push
				stack.push(60);

				//pop
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();
				stack.pop();

				//pop from empty stack
				stack.pop();

			}
			}
