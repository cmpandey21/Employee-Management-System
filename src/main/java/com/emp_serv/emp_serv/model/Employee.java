package com.emp_serv.emp_serv.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;


@Entity
@Table(name="emp")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //Checking columns of database
    @Size(min=2, message="\"First Name should have atleast 2 characters")
    @Column(name="first_name")
    private String firstName;
    @Size(min=2, message="\"Last Name should have atleast 2 characters")
    @Column(name="last_name")
    private String lastName;
    @Size(min = 5, max = 50)
    @Email
    @Column(name="email")
    private String email;

    //Getter & setter method
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
