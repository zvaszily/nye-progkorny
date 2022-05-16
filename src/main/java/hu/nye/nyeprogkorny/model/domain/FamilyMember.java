package hu.nye.nyeprogkorny.model.domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class FamilyMember {

    @Id
    @GeneratedValue
    private Long id;

    private Long user_id;

    private String first_name;

    private String last_name;

    private String member_image;

    private String city;

    private String gender;

    private Date birth_date;

    private String birth_place;

    private Date death_date;
    @GeneratedValue
    private Timestamp created;







}
