package c.functionalComposition;

import java.util.function.Function;

public class Demo3 {

	public static void main(String[] args) {

		// composing Function
		Function<Integer, Integer> mul = x -> x * 2;
		Function<Integer, Integer> add = x -> x + 5;
		
		System.out.println(mul.apply(10));
		System.out.println(add.apply(10));
		System.out.println("==============");
		{
			Function<Integer, Integer> addAndThenMul = mul.compose(add);
			Function<Integer, Integer> mulAndThenAdd = add.compose(mul);
			System.out.println(addAndThenMul.apply(10));
			System.out.println(mulAndThenAdd.apply(10));
		}
		
		System.out.println("==============");
		{
			Function<Integer, Integer> addAndThenMul = add.andThen(mul);
			Function<Integer, Integer> mulAndThenAdd = mul.andThen(add);
			System.out.println(addAndThenMul.apply(10));
			System.out.println(mulAndThenAdd.apply(10));
		}
	}

}
