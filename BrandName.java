package in.nit.workshop;

public class BrandName {

	public static void main(String[] args) {
		String BrandNames[] = {"Gwagon","Benz","Porsche","RangeRover"};
		for (int index = 0; index < BrandNames.length; index++) {
			System.out.println(BrandNames[index]);
		}
		System.out.println("reverse in array elements");
		for(int index = BrandNames.length-4; index>0;index--) {
			System.out.println(BrandNames[index]);
		}
		int[] numbers = {1,2,3,4,};
      	char []ch = {'A','B','C','D'};
      	System.out.println("BrandNames:"+BrandNames.length);
      	System.out.println("numbers:"+numbers.length);
      	System.out.println("ch:"+ch.length);
      	System.out.println("displaying array elements");
      	System.out.println(BrandNames[0]);
      	System.out.println(BrandNames[1]);
      	System.out.println(BrandNames[2]);
      	System.out.println(BrandNames[3]);
      	

	}

}
