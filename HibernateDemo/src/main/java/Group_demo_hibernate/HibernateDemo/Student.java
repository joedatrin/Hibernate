package Group_demo_hibernate.HibernateDemo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
*/
@Entity
public class Student {
@Id
@Column(name="id")
private int id;
@Column(name="name")
private String name;
@Column(name="email")
private String email;
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
}
