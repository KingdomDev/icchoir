package fr.icchoirlyon.media;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MediaRepository extends CrudRepository<Media, Long> {
    @Query(value = "SELECT m FROM Media m " +
            "ORDER BY m.creationDate DESC")
    Page<Media> findAllTop10(Pageable pageable);

    List<Media> findAllByType(String type);
}
