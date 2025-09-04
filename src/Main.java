import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();
        StudentList studentList = new StudentList();
        for(int i = 0; i < numberOfStudents; i++){
            Student s = new Student();

            System.out.print("Nhập id: ");
            s.setId(sc.nextInt());
            sc.nextLine(); // đọc bỏ dòng newline

            System.out.print("Nhập tên: ");
            s.setName(sc.nextLine());

            System.out.print("Nhập điểm: ");
            s.setScore(sc.nextFloat());

            studentList.addStudent(s);
        }
        System.out.println("\nDanh sách sinh viên:");
        System.out.println(studentList);

        // thử tìm kiếm
        System.out.print("\nNhập điểm cần tìm (linear search): ");
        float target = sc.nextFloat();
        System.out.println(studentList.linerSearch(target));

        System.out.print("\nNhập điểm cần tìm (binary search): ");
        target = sc.nextFloat();
        System.out.println(studentList.binarySearch(target));
    }
}