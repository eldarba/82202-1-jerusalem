package b.dataTypes;

public class Demo1 {

	public static void main(String[] args) {

		{

			System.out.println(5);
			System.out.println(5F);
			System.out.println(5D);

			System.out.println(3.33333333333333333333333333333333333333D);
			System.out.println(3.33333333333333333333333333333333333333F);

			float f1 = 5.32F;
			long x = 999999999999999999L;

			/////////////////////////////
			int a = 2;
			int b = 5;
			a++;
			a = a + 1;
			a = a + b;
			System.out.println(a);
		}

		{
			int a = 5;
			int b = 2;
			boolean x = a==b;
			System.out.println(x);
			System.out.println(a==b);
		}
		
		{
			char c1 = 'A';
			char c2 = 'à';
			
			System.out.println(c1);
			System.out.println(c2);
			
		}

	}

}
