package defaultandstaticmethodininterface;

public class class1 implements Interface1, Interface2{

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}

	//MyClass won't compile without having it's own log() implementation
	@Override
	public void log(String str) {
		// TODO Auto-generated method stub
		Interface1.super.log(str);
		Interface2.super.log(str);
	}



	public static void main(String[] args) {
		class1 obj = new class1();
		obj.log("Srinibas");
		
	}

}
