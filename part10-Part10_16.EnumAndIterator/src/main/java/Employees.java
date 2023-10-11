import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    ArrayList<Person> employeesList;

    public Employees(){
        this.employeesList = new ArrayList<>();
    }

    public void add(Person personToAdd){
        this.employeesList.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd){
        this.employeesList.addAll(peopleToAdd);
    }

    public void print(){
        this.employeesList.forEach(System.out::println);
    }

    public void print(Education education){
       // this.employeesList.stream().filter(p -> p.getEducation() == education).forEach(p -> System.out.println(p));
        Iterator<Person> iterator = this.employeesList.iterator();

        while (iterator.hasNext()) {
            Person nextPerson = iterator.next(); // important for printing can't used iterator.next() to print obj needs to be a var
            if (nextPerson.getEducation() == education) {
                System.out.println(nextPerson);

            }}
    }

    public void fire(Education education){
        Iterator<Person> iteratorEmployees = this.employeesList.iterator();
        while(iteratorEmployees.hasNext()){
            if(iteratorEmployees.next().getEducation() == education){
                iteratorEmployees.remove();
            }
        }
    }
}
