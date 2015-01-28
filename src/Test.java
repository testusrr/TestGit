/*
 * class comment
 */
public class Test {
	int data[] = {0, 1, 5, 8, 763276, -9};
	
	public void display(){
		System.out.println("My test data:");
		
		// some comment
		int sum = 0;
		for(int dat : data){
			
			System.out.println("Data value: " + dat);
			sum += dat;
		}
		System.out.println("Sum is: " + sum);
		System.out.println("comment print");
	}
}
