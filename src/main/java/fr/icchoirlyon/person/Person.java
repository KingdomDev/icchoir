package fr.icchoirlyon.person;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "firstname", nullable = false)
    private String firstName;

    @Column(name = "name", nullable = false)
    private String lastName;

    @Column(name = "birthdate")
    private Date birthdate;

    @Column(name = "address")
    private String address;

    @Column(name = "gender", nullable = false)
    private char gender;

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFisrtName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getbirthdate() {
        return birthdate;
    }

    public void setbirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Person person = (Person) o;

        if (id != null ? !id.equals(person.id) : person.id != null)
            return false;
        if (firstName != null ? !firstName.equals(person.firstName) : person.firstName != null)
            return false;
        if (lastName != null ? !lastName.equals(person.lastName) : person.lastName != null)
            return false;
        if (birthdate != null ? !birthdate.equals(person.birthdate) : person.birthdate != null)
            return false;
        if (address != null ? !address.equals(person.address) : person.address != null)
            return false;
        if (gender != ' ' ? (gender != person.gender) : person.gender != ' ')
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 7 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 7 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 7 * result + (birthdate != null ? birthdate.hashCode() : 0);
        result = 7 * result + (address != null ? address.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "-------Person-------{" +
                "id :  " + id +
                "\nfirstName :  " + firstName +
                "\nlastName :  " + lastName +
                "\nbirthdate :  " + birthdate +
                "\naddress :  " + address +
                "\ngender :  " + gender +
                "\n}---------------------";
    }
}
