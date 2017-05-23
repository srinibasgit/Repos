package test;

/**
 * An interface with exactly one abstract method becomes Functional Interface.
 * We don’t need to use @FunctionalInterface annotation to mark an interface as
 * Functional Interface. @FunctionalInterface annotation is a facility to avoid
 * accidental addition of abstract methods in the functional interfaces.
 * 
 * @author spanda
 *
 */
@FunctionalInterface
public interface Interface1 {
	void method1(String str);

	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}

	static void print(String str) {
		System.out.println("Printing " + str);
	}

	// trying to override Object method gives compile time error as
	// "A default method cannot override a method from java.lang.Object"

	// default String toString(){
	// return "i1";
	// }
}
