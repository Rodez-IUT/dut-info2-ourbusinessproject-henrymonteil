package ourbusinessproject;

import com.sun.istack.NotNull;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class Enterprise {

    @NotNull
    @NotBlank
    private String name;


    @NotBlank
    @NotNull
    @Size(min = 10)
    private String description;

    @NotNull
    @NotBlank
    private String contactName;

    @NotNull
    @NotBlank
    @Email
    private String contactEmail;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}
