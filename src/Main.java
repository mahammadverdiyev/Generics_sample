import com.mverdiyev.*;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        SchoolStudent student3n1 = new SchoolStudent("Toghrul",10);
        SchoolStudent student3n2 = new SchoolStudent("Umid",15);
        SchoolStudent student3n3 = new SchoolStudent("Farid", 8);
        SchoolClass<SchoolStudent> school3n =
                  new SchoolClass<>("Zeka", Arrays.asList(student3n1, student3n2, student3n3));


        SchoolStudent student7n1 = new SchoolStudent("Tural",7);
        SchoolStudent student7n2 = new SchoolStudent("Eli",18);
        SchoolStudent student7n3 = new SchoolStudent("Murad", 4);
        SchoolClass<SchoolStudent> school7n =
                new SchoolClass<>("Bilik", Arrays.asList(student7n1, student7n2, student7n3));


        List<SchoolClass<SchoolStudent>> schoolClasses = new ArrayList<>();


        schoolClasses.add(school3n);
        schoolClasses.add(school7n);

        schoolClasses.sort(Comparator.naturalOrder());

        System.out.println(schoolClasses);

        System.out.println(school3n.getName() + " = " + school3n.getClassRank());
        System.out.println(school7n.getName() + " = " + school7n.getClassRank());
    }
}
