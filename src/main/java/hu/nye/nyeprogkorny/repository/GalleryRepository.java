package hu.nye.nyeprogkorny.repository;

import hu.nye.nyeprogkorny.model.domain.Galleries;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GalleryRepository extends JpaRepository<Galleries, Long> {

}
