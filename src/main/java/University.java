import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class University {

    public String name;
    public int number;
    public String address;

    public ArrayList<Departament> list_departament = new ArrayList<>();
    public ArrayList<Student> list_student = new ArrayList<>();

    public University(String name,  int number, String address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public Student add_student(String name, int student_id) {
        Student student = new Student(name, student_id);
        list_student.add(student);

        return student;
    }

        public Student remove_student(String student) {
        list_student.remove(student);
            return null;
        }

        public void get_student (Student student){
            System.out.println("Имя: " + student.name + "Id студента: " + student.student_id);
        }

        public Departament add_departament (String name, University university){
            Departament departament = new Departament(name);
            list_departament.add(departament);
            System.out.println("В универе" + university.name + "появился " + departament.name);
            return departament;
        }
        public  void remove_departament (Departament departament, University university){
            list_departament.remove(departament);
            System.out.println("В универе " + university.name + " расформировали " + departament.name);
        }
        public void get_departament (Departament departament){
            System.out.println(departament.name);
            }

            public void get_all_departament (University university){
                int id = 0;
                System.out.println("Сприсок факультетов университета: " + university.name );
                for (Departament departament : list_departament){
                    id++;
                    System.out.println(id + ".  " + departament.name);
                }
                    System.out.println("Всего факультетов: " + id);
            }

}
