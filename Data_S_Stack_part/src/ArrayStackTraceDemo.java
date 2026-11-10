public class ArrayStackTraceDemo {
    public static void main(String[] args) {
        ArrayStack<String> s = new ArrayStack<>();
        s.push("A");
        s.push("B");
        System.out.println("size " + s.size() + ", capacity " + s.capacity());

        s.push("C");
        System.out.println("size " + s.size() + ", capacity " + s.capacity());

        System.out.println("peek: " + s.peek());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
        System.out.println("pop: " + s.pop());
    }
}
