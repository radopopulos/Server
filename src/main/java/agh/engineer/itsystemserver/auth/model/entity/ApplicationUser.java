package agh.engineer.itsystemserver.auth.model.entity;

import javax.persistence.*;

@Entity
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String surname;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(length = 60)
    private String password;

    public ApplicationUser() {

    }

    public ApplicationUser(ApplicationUser applicationUser) {
        this.name = applicationUser.getName();
        this.surname = applicationUser.getSurname();
        this.email = applicationUser.getEmail();
        this.password = applicationUser.getPassword();
        this.id = applicationUser.getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
