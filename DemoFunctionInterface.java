
interface FunctionalInterface {
    void msg();
}

class DemoFunctionInterface implements FunctionalInterface {
    public void msg() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        DemoFunctionInterface df = new DemoFunctionInterface();
        df.msg();
    }
}
