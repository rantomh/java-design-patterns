package com.rantomah.designpatterns.behavioral.chainofresponsabilty;

public abstract class AbstractWorker {

    protected Worker substitute;
    protected boolean available = true;
    protected String position;

    public AbstractWorker(String position) {
        this.position = position;
    }

    public void setSubstitute(Worker substitute) {
        this.substitute = substitute;
    }

    public void handle(Task task) {
        if (isAvailable()) {
            System.out.println(
                    String.format("%s handling task: %s", position, task.getDescription()));
            task.setDone(true);
        } else if (substitute != null) {
            substitute.handle(task);
        } else {
            throw new RuntimeException("No worker available to handle this task");
        }
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }
}
