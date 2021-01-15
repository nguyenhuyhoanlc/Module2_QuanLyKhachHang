import java.util.*;

public class Manager {
    List<Person> personList = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void addNew(Person person){
        personList.add(person);
    }

    public void edit(String name,Person person){
        for (int i = 0; i < personList.size(); i++) {
            if (name.equals(personList.get(i).getName())){
                personList.set(i,person);
            }
        }
    }

    public void delete(String name){
        for (int i = 0; i < personList.size(); i++) {
            if (name.equals(personList.get(i).getName())){
                personList.remove(i);
            }
        }
    }

    public void showAll(){
        for (int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i));
        }
    }

    public void search(String name){
        for (int i = 0; i < personList.size(); i++) {
            if (name.equals(personList.get(i).getName())){
                System.out.println(personList.get(i));
            }
        }
    }

    public void sort(List<Person>personList){
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (Integer.parseInt(o1.getId()) < Integer.parseInt(o2.getId())){
                    return -1;
                }
                return 1;
            }
        });
    }
}
