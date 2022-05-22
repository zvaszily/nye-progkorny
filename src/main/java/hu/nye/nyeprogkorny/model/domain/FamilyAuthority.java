package hu.nye.nyeprogkorny.model.domain;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Entity for FamilyAuthority.
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
public class FamilyAuthority {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Integer id;

  private String role;

  @ManyToMany(mappedBy = "authorities")
  private Set<FamilyUser> users;
}
