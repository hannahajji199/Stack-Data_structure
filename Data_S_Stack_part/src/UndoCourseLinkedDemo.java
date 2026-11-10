class RegistrationLinked {
    private LinkedStack<String> courses = new LinkedStack<>();

    public void addCourse(String code) {
        courses.push(code);
        System.out.println("Added " + code + " | top: " + courses.peek() + " | size: " + courses.size());
    }

    public void undoLastCourse() {
        if (courses.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }
        String removed = courses.pop();
        System.out.println("Removed " + removed + " | size: " + courses.size());
    }
}

public class UndoCourseLinkedDemo {
    public static void main(String[] args) {
        RegistrationLinked reg = new RegistrationLinked();
        reg.addCourse("CA314");
        reg.addCourse("CA301");
        reg.addCourse("MA210");
        reg.undoLastCourse();
        reg.undoLastCourse();
    }
}
