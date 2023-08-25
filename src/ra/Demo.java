package ra;

import javafx.print.Collation;
import sun.text.resources.sk.CollationData_sk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn B", 22);
        Student student2 = new Student("SV002", "Nguyễn Văn C", 20);
        Student student3 = new Student("SV003", "Nguyễn Văn A", 24);
        Student student4 = new Student("SV004", "Nguyễn Văn D", 22);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 22);
        listStudent.add(student1);
        listStudent.add(student2);
        listStudent.add(student3);
        listStudent.add(student4);
        listStudent.add(student5);
        //Sắp xếp sinh viên theo tuổi
//        Collections.sort(listStudent, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge()-o2.getAge();
//            }
//        });
        //Sắp xếp sinh viên theo tuổi với biểu thức Lambda
        //Collections.sort(listStudent,(Student o1, Student o2)->o1.getAge()-o2.getAge());
        //Student::getAge: Method Reference
        //comparing: ASC
        Collections.sort(listStudent, Comparator.comparing(Student::getAge).reversed().thenComparing(Student::getStudentName).reversed());
        listStudent.forEach(student -> System.out.println(student));
        //In ra các sinh viên có tuổi bằng 22
        System.out.println("Các sinh viên có tuổi 22:");
        listStudent.stream().filter(student -> student.getAge() == 22).forEach(System.out::println);
        //In ra tối đa 2 sinh viên có tuổi bằng 22
        System.out.println("Tối đa 2 sinh viên có tuổi 22: ");
        listStudent.stream().filter(student -> student.getAge() == 22).limit(2).forEach(System.out::println);
        //Tạo danh sách mới chứa các đối tượng sinh viên như listStudent nhưng tên sinh viên được viết hoa
        List<Student> listStudentNew = listStudent.stream().map(student -> {
            student.setStudentName(student.getStudentName().toUpperCase());
            return student;
        }).collect(Collectors.toList());
        System.out.println("Danh sách sinh viên mới: ");
        listStudentNew.forEach(System.out::println);
        System.out.println("Danh sách sinh viên cũ:");
        listStudent.forEach(System.out::println);
        //In ra danh sách sinh viên sắp xếp theo tuổi giảm dần và tên tăng dần
        System.out.println("Danh sách sinh viên sau khi sắp xếp: ");
        listStudent.stream().sorted(Comparator.comparing(Student::getAge).reversed()
                        .thenComparing(Student::getStudentName))
                .forEach(System.out::println);
        //Kiểm tra trong listStudent có tồn tại sinh viên có tên là Nguyễn Văn A hay không
        boolean isExist = listStudent.stream().anyMatch(student -> student.getStudentName()
                .equalsIgnoreCase("Nguyễn Văn A"));
        System.out.println("Kết quả tìm kiếm: " + isExist);
        //Thống kê trong listStudent có bao nhiêu sinh viên có độ tuổi từ 20 đến 22
        int cnt = (int) listStudent.stream()
                .filter(student -> student.getAge() >= 20 && student.getAge() <= 22)
                .count();
        System.out.println("Số sinh viên có tuổi từ 20-22 là: "+cnt);
        //Lấy tuổi cao nhất của sinh viên
        int max = listStudent.stream().max(Comparator.comparing(Student::getAge)).get().getAge();
        System.out.println("Tuổi sinh viên cao nhất: "+max);
        int min = listStudent.stream().min(Comparator.comparing(Student::getAge)).get().getAge();
        System.out.println("Tuổi sinh viên thấp nhât: "+min);

    }
}
