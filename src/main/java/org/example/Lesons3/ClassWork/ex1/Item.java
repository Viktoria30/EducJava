package org.example.Lesons3.ClassWork.ex1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    public String name;
    public String country;
    public Integer volume;
}
