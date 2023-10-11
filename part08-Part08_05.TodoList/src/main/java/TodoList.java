import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> list;

    public TodoList(){
        this.list = new ArrayList<>();
    }

    public void add(String task){
        list.add(task);
    }

    public void print(){
        int index = 1;
        for(String task : list){
            System.out.println(index + ": " + task);
            index++;
        }
    }

    public void remove(int index){
        list.remove(index - 1);
    }
}
