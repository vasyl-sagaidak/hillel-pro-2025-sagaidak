package examples.lambdas;

public class LambdasMain {
    public static void main(String[] args) {

    }

    interface TestInterface {

    }

    abstract class AbstractTestClass {
        abstract void testMethod();
    }

    class TestClass {

        TestInterface test = new TestInterface() {
            //Anonymous inner class implementation
        };

        AbstractTestClass abstractTestRealisation = new AbstractTestClass() {

            @Override
            void testMethod() {
                System.out.println("AbstractTestClass.testMethod Implementation invoked");
            }
        };

    }
}
