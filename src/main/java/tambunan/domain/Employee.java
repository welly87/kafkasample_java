package tambunan.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private boolean hasAccessDoor;

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

    public void join(Date date) {
        hasAccessDoor = true;
    }

    public void receiveSalary(double i) {

    }

    public void resign() {
        hasAccessDoor = false;
    }

    public boolean hasAccessDoor() {
        return hasAccessDoor;
    }
}
