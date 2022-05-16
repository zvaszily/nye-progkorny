package hu.nye.nyeprogkorny.repository;

import hu.nye.nyeprogkorny.model.domain.FamilyMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FamilyMemberRepository extends JpaRepository <FamilyMember, Long> {
}
