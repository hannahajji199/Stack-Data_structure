public class UndoCourseDemo {
    public static void main(String[] args) {
        Registration reg = new Registration("Hodan");
        reg.addCourse("CA314");
        reg.addCourse("CA301");
        reg.addCourse("MA210");
        reg.undoLastCourse();
    }
}
