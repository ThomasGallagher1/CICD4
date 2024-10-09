package atu.ie.week4cicd;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    @NotBlank(message ="You must enter a name")
    private String name;
    @Min(value=1, message="Must be greater or equal to 1")
    private int id;
    @NotBlank(message ="You must enter a title")
    private String title;
    @Min(value=0, message="Must be greater or equal to 0")
    private int age;
    @Email(message ="You must enter a valid email")
    private String email;
    @NotBlank(message ="You must enter a position")
    private String position;
    @NotBlank(message ="You must enter a department")
    private String department;
}
