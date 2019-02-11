package guru.springframework.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by oaryukov on 06.02.2019.
 */
@Data
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
