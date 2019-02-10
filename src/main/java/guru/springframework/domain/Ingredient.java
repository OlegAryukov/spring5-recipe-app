package guru.springframework.domain;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by oaryukov on 06.02.2019.
 */
@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure uom;

    @ManyToOne
    private Recipe recipe;
}
