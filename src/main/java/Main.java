import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            University blgu = new University("БелГУ",8800, "ул. Победы");

            Departament fm = blgu.add_departament ("Факультет физики", blgu);
            Departament it = blgu.add_departament("Факультет Информационных технологий", blgu);
            System.out.println();

            Instructor koly_galkin = fm.add_instructor("Николай Галкин",fm);
            Instructor liza_chumakova = fm.add_instructor("Елизавета  Чумакова", fm);
            Instructor gordon_ramzy = it.add_instructor("Гордон Рамзи", it);
            Instructor robbert_dauni = it.add_instructor("Роберт Дауни", it);
            System.out.println();

            blgu.get_departament(it);
            System.out.println();

            blgu.get_all_departament(blgu);
            System.out.println();

            blgu.remove_departament(fm, blgu);
            blgu.get_all_departament(blgu);
            System.out.println();

            fm.get_instructor(koly_galkin);
            System.out.println();

            it.get_all_instructor(it);
            System.out.println();

            it.remove_instructor(robbert_dauni,it);
            it.get_all_instructor(it);
            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите имя преподователя:  ");
            System.out.println();
                String instructor_name = sc.nextLine();// если не указать Line то восприниматься будет только 1 слово
            Instructor instructor_new = it.add_instructor(instructor_name, it);

            it.get_all_instructor(it);
            System.out.println();


    }

}
