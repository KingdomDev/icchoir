package fr.icchoirlyon.document;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {
    @Query(value = "SELECT doc FROM Document doc " +
            "ORDER BY doc.creationDate DESC")
    Page<Document> findAllTop10(Pageable pageable);

    List<Document> findAll();

    List<Document> findAllByType(String type);
}
