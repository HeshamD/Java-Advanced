package platinumMind.example.employerManager.Models;

import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phoneNumber;
    private String imageUrl;
    private Date dateOfBirth;
    @Column(nullable = false,updatable = false)
    private String employeeCode;

    @Override
    public String toString(){
        return "Employee { " + " id = " + id
                + ", name = " + name
                + ", email = " + email
                + ", jobTitle = " + jobTitle
                + ", imageUrl = " + imageUrl
                + ", employeeCode = " + employeeCode;
    }

}
