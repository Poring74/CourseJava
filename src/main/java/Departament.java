import java.util.ArrayList;

public class Departament {
    public String name;
    public ArrayList<Instructor> list_instructor = new ArrayList<>();// создаем список указывая какой класс

    public Departament(String name) {
        this.name = name;
    }// присваиваем

    public Instructor add_instructor(String name, Departament departament) {
        Instructor instructor = new Instructor(name);
        list_instructor.add(instructor);// добавление
        System.out.println( "Преподдаватель " + instructor.name + " теперь работает на " + departament.name); // что будет выводиться в консоль

        return instructor; // возвращение
    }   // добавление препода


    public void remove_instructor(Instructor instructor, Departament departament) {
        list_instructor.remove(instructor); //удаление
        System.out.println(instructor.name + " больше не работает на  " + departament.name );// что будет выводиться в консоль

    }

    public void get_instructor(Instructor instructor) {
        System.out.println(instructor.name);// получение по name
    }

    public void get_all_instructor(Departament departament) {
        int id = 0;
        System.out.println("Перечень преподавателей:");
        for (Instructor instructor : list_instructor) {
            id++;
            System.out.println(id + ". " + instructor.name); // вывод препода и его id
        }
        System.out.println(departament.name + " имеет " + id + " преподавателей"); // вывод общего числа преподавателей
    }
}
