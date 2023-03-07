package functionalprogram;

public class FunctionalProgrammingDemo {

	public static void main(String[] args) {
		
		//Any interface that has only one Abstract method ->Functional Interface
	
		
		//traditional way
		Calculator calc=new Calculator();
		calc.calculate(4, 5);
		
		//Anonymous inner class
		ICalculator multiplier =new ICalculator() {

			@Override
			public int calculate(int a, int b) {
				int result=a+b;
				System.out.println("Calculate "+ a + "+" + b + "=" +result );
				return result;
			}	
		};
		multiplier.calculate(7, 8);
		
		//lambda expressions(class having one method)
		int x=15;
		int y=3;
		ICalculator divider=(a,b) -> {return a/b ;};
		System.out.println("Calculate "+ x + "/" + y + "=" + divider.calculate(x, y) );
		
		Sum sum =(a,b)-> System.out.println("Sum is "+(a+b));
		sum.add(17, 4);
	}

}


interface ICalculator{
	int calculate(int a, int b);
}
class Calculator implements ICalculator{

	@Override
	public int calculate(int a, int b) {
		int result=a+b;
		System.out.println("Calculate "+ a + "+" + b + "=" +result );
		return result;
	}
	
}


interface Sum{
	void add(int a,int b);
}
