package hu.nye.nyeprogkorny.repository;

import hu.nye.nyeprogkorny.model.domain.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository for FamilyMember.
 */
public interface FamilyMemberRepository extends JpaRepository<FamilyMember, Long> {
}
