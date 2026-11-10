public class TraverseDemo {
    public static void main(String[] args) {
        Node<Integer> head = new Node<>(17);
        Node<Integer> n2 = new Node<>(92);
        Node<Integer> n3 = new Node<>(63);
        Node<Integer> n4 = new Node<>(45);

        head.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        Node<Integer> current = head;
        while (current != null) {
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }
}
