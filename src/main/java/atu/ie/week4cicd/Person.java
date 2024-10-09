package atu.ie.week4cicd;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Person {
    @NotBlank(message =" you must enter a name")
    private String name;
    @Min(value=1, message="Must be greater or equal to 1")
    private int id;
}
