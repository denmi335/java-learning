public class Task {
    private int id;
    private String title;
    private boolean isDone;
    private int priority;

    public Task(int id, String title, int priority){
        this.id = id;
        this.title = title;
        this.isDone = false;
        this.priority = priority;
    }

    public void setCompleted(boolean isDone) {
        this.isDone = isDone;
    }
    @Override
    public String toString() {
        String status = isDone ? "✓" : " ";
        return "[" + status + "] " + title + " (приоритет: " + priority + ")";
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }

    public String getTitle() {
        return title;
    }

    public boolean isDone() {
        return isDone;
    }
}
