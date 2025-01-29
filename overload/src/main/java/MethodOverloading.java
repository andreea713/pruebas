public class MethodOverloading {
    public static void main (String args []){
        Overload object = new Overload();
        double result;

        object.demo(10);
        object.demo(10, 20);
        result = object.demo(5.5);

        System.out.println("Result op: " + result);
    }
}
