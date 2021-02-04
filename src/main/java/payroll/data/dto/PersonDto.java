package payroll.data.dto;

import java.util.Objects;

public class PersonDto {
    private Long id;
    private String namePerson;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonDto personDto = (PersonDto) o;
        if (id != null ? ! id.equals(personDto.id) : personDto.id != null) return false;
        return namePerson != null ? namePerson.equals(personDto.namePerson) : personDto.namePerson == null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, namePerson);
    }
}
