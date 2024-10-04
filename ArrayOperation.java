package in.nit.workshop;

public class ArrayOperation {

	public static void main(String[] args) {
	    int numbers[] = {2,3,6,8,9};
	    int sum = 0;
	    for(int index = 0; index< numbers.length;index++) {
	    	sum = sum + numbers[index];
	    }
	    System.out.println("sum is:"+sum);
	    for(int index=0; index<numbers.length;index++) {
	    	if(numbers[index]%2==0) {
	    		System.out.println("it is a even number:"+numbers[index]);
	    	}else {
	    		System.out.println("it is a odd number:"+numbers[index]);    	}
	    }
	}

}
