import java.util.ArrayList;

public class Subtask extends Epic{
    public Subtask(String name, String description, int id, String status) {
        super(name, description, id, status);
    }

    ArrayList<Subtask> subtasksList;
}
