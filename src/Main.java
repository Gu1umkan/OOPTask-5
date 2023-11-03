import java.time.LocalDate;
import java.time.Period;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass("Gulumkan", LocalDate.of(2002,4,25));
        LocalDate startDate = myClass.dateOfBirth;
        LocalDate endDate = LocalDate.of(2023,11,3);
        Period period = Period.between(startDate,endDate);
        System.out.println("Учурда "+period.getYears()+" жашта");
    }
}