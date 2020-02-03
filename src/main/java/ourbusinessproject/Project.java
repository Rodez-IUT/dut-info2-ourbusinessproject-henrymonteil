package ourbusinessproject;

import com.sun.istack.NotNull;

import javax.validation.constraints.NotBlank;

public class Project {

    @NotNull
    @NotBlank
    private String title;

    @NotNull
    @NotBlank
    private String description;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
