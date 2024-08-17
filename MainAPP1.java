package Aug08;
interface CalculatorInf{
	int k=10;
	void add();
	void sub();
	void multiple();
	void divide();
}
class Calculator implements CalculatorInf{
	@Override
	public void add() {
		int add=k+1;
		System.out.println("Addition method "+add);
	}
	@Override
	public void sub() {
		int sub=k-1;
		System.out.println("Subtraction method implementation "+sub);
	}
	@Override
	public void multiple() {
		int multiple=k*2;
		System.out.println("multiple method "+multiple);
	}
	@Override
	public void divide() {
		int divide=k/2;
		System.out.println("Divide method "+divide);
	}
}

public class MainAPP1 {
	public static void main(String[] args) {
		Calculator sob =new Calculator();
		sob.add();
		sob.sub();
		sob.multiple();
		sob.divide();
	}

}
