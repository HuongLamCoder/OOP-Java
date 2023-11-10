import data.Cabinet;

public class Main {
//    public static void main(String[] args) {
//        Cabinet se = new Cabinet();
//        Cabinet ia = new Cabinet();
//
//        System.out.println("INPUT SE STUDENT(S):");
//        se.addAStudent();
//
//        System.out.println("INPUT IA STUDENT(S):");
//        ia.addAStudent();
//        ia.addAStudent();
//
//        System.out.println("SE MAJOR");
//        se.printStudentList();
//
//        System.out.println("IA MAJOR");
//        ia.printStudentList();
//    }

    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        se.addAStudent();
        se.addAStudent();

        se.printStudentList();

        se.updateAStudent();
        System.out.println("The student list after updating:");
        se.printStudentList();

//        //search không thấy
//        se.searchAStudent();
//        //search thấy
//        se.searchAStudent();
    }
}