package pl.pjatk.tech_support;

public class Ticket {
    private int id;
    private String assignee;
    private String reporter;
    private String status;//czy enumem
    private String taskDescription;

    public Ticket(int id, String assignee, String reporter, String status, String taskDescription) {
        this.id = id;
        this.assignee = assignee;
        this.reporter = reporter;
        this.status = status;
        this.taskDescription = taskDescription;
    }

    public int getId() {
        return id;
    }
    public String getAssignee() {
        return assignee;
    }
    public String getReporter() {
        return reporter;
    }
    public String getStatus() {
        return status;
    }
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }
    public void setReporter(String reporter) {
        this.reporter = reporter;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public void setId(int id) {
        this.id = id;// czy do tego robić setter skoro id nie powinno się zmienic
    }

    public void ticketToString() {
        System.out.println("ID: " + id + "\nAssignee: " + assignee + "\nReporter: " + reporter + "\nStatus: "
                + status + "\nTask Description: " + taskDescription);
    }
}


