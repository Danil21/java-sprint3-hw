import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class TaskManager {

    ArrayList<Objects> typeTask = new ArrayList<>();
    private  Epic epic;
    private  Subtask subtask;
    HashMap<Integer, Task> mapTask = new HashMap<>();
    HashMap<Integer, Subtask> mapSubtask = new HashMap<>();
    HashMap<Integer, ArrayList<Subtask>> mapEpic = new HashMap<>();

    public void addSubTask(){

    }

    public void addEpic(Subtask subtask){
        mapEpic.put(epic.getId() + 1,subtask.subtasksList);
    }

    public void deleteSubTask(){

    }

    public void getIdSubtask(){

    }

    public void deleteEpic(Epic epic){
        mapSubtask.remove(epic.getId());
    }

    public void deleteAllTask(){

    }

    public void getNumberCompletedTasks(){
        if (mapSubtask.isEmpty()){deleteEpic(epic);}
    }


    // тут надо подумать
    public void updateEpicTask(Epic epicTask){
        // mapEpic.put(epicTask.getId(), epicTask);
    }

    /* Возможность хранить задачи всех типов. Для этого вам нужно выбрать подходящую коллекцию.
Методы для каждого из типа задач(Задача/Эпик/Подзадача):
Получение списка всех задач.
Удаление всех задач.
Получение по идентификатору.
Создание. Сам объект должен передаваться в качестве параметра.
Обновление. Новая версия объекта с верным идентификатором передаётся в виде параметра.
Удаление по идентификатору.
Дополнительные методы:
Получение списка всех подзадач определённого эпика.
Управление статусами осуществляется по следующему правилу:
Менеджер сам не выбирает статус для задачи. Информация о нём приходит менеджеру вместе с информацией о самой задаче. По этим данным в одних случаях он будет сохранять статус, в других будет рассчитывать.
Для эпиков:
если у эпика нет подзадач или все они имеют статус NEW, то статус должен быть NEW.
если все подзадачи имеют статус DONE, то и эпик считается завершённым — со статусом DONE.
во всех остальных случаях статус должен быть IN_PROGRESS.*/
}
