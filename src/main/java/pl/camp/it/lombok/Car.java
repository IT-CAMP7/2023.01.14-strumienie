package pl.camp.it.lombok;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Builder
@Accessors(fluent = true)
public class Car {
    private int id;
    private String brand;
    private String model;
    private String plate;
    private int year;
}
