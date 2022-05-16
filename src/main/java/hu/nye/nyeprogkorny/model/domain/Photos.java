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
public class Photos {
    @Id
    @GeneratedValue
    private Long id;

    private String title;

    private String description;

    private String location;

    private String image;

    private Long galleryId;
}
