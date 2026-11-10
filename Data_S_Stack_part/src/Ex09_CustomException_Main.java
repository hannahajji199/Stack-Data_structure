public class Ex09_CustomException_Main {
    public static void main(String[] args) {
        try {
            throw new EmptyCollectionException("stack");
        } catch (EmptyCollectionException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
