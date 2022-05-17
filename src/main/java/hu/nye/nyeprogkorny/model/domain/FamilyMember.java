package hu.nye.nyeprogkorny.model.domain;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Entity for FamilyMember.
 */
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

  private Long userId;

  private String firstName;

  private String lastName;

  private String memberImage;

  private String city;

  private String gender;

  private Date birthDate;

  private String birthPlace;

  private Date deathDate;
  @GeneratedValue
  private Timestamp created;


}
