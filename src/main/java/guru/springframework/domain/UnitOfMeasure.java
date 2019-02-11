package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by oaryukov on 06.02.2019.
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String unit;
    private String description;

}
