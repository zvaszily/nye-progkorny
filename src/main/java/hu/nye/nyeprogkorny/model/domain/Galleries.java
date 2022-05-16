package hu.nye.nyeprogkorny.model.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class Galleries {
    @Id
    @GeneratedValue
    private Long id;

    private String galleryName;

    private String description;

    private String coverImage;

}
