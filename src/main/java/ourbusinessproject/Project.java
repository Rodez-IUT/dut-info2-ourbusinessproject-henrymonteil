package ourbusinessproject;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotEmpty
    private String title;
    private String description;
    @ManyToOne(cascade=CascadeType.ALL)
    private Enterprise enterprise;
    public Project() {
    }

    public Project(Enterprise enterprise) {
        this.enterprise = enterprise;
        this.enterprise.addProject(this);
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Long getId() {
        return id;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
        this.enterprise.addProject(this);
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }
}