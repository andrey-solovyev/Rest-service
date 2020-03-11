package payroll.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@Entity
public class Person {
    private @Id @GeneratedValue long
    id;
    private String namePerson;
    private String phone;
    private String email;

    public Person() {
    }

    public Person(Integer id, String namePerson, String phone, String email) {
        this.id = id;
        this.namePerson = namePerson;
        this.phone = phone;
        this.email = email;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
