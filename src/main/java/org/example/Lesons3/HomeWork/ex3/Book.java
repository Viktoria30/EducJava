package org.example.Lesons3.HomeWork.ex3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String name;
    private String surname;
    private Integer price;
    private Integer year;
    private Integer page;
}
