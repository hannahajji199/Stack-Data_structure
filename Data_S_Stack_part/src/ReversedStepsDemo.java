public class ReversedStepsDemo {
    static void print(String label, Node<String> head) {
        System.out.print(label);
        Node<String> cur = head;
        for (int i = 0; i < 5 && cur != null; i++) {
            System.out.print(cur.getElement() + " -> ");
            cur = cur.getNext();
        }
        System.out.println(cur == null ? "null" : "...");
    }

    public static void main(String[] args) {
        // Correct order
        Node<String> head = new Node<>("B");
        Node<String> newNode = new Node<>("A");
        newNode.setNext(head);
        head = newNode;
        print("Correct: ", head);

        // Swapped order
        head = new Node<>("B");
        newNode = head;
        newNode.setNext(head);
        newNode = new Node<>("A");
        print("Swapped: ", head);
    }
}
