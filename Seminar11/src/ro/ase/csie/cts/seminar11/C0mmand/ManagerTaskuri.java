package ro.ase.csie.cts.seminar11.C0mmand;

import java.util.ArrayList;
import java.util.List;

public class ManagerTaskuri {
    List<InterfataTaskAsincron> taskuri = new ArrayList<>();

    public void adaugaTask(InterfataTaskAsincron taskAsincron){
        taskuri.add(taskAsincron);
    }

    public void executaUrmatorulTask(){
        if(taskuri.size() > 0){
            InterfataTaskAsincron task = taskuri.get(0);
            task.startTaskAsincron();
            taskuri.remove(0);
        }
    }
}
