import java.util.HashMap;

public class Task {

    private String name;
    private String description;
    private Integer id;
    private String status;

    public Task(String name, String description, Integer id, String status) {
        this.name = name;
        this.description = description;
        this.id = id;
        this.status = status;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(String status) {
        this.status = status;
    }



    /* Для каждой подзадачи известно, в рамках какого эпика она выполняется.
Каждый эпик знает, какие подзадачи в него входят.
Завершение всех подзадач эпика считается завершением эпика. */
}
