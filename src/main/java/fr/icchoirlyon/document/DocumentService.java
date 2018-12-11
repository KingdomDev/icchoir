package fr.icchoirlyon.document;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service
public class DocumentService {
    @Inject
    DocumentRepository documentRepository;

    /*@Transactional
    Page<Document> getAllDocuments() {
        return documentRepository.findAllTop10(new PageRequest(0, 10));
    }*/

    @Transactional
    Document getDocument(Long id) {
        return documentRepository.findOne(id);
    }

    @Transactional
    List<Document> getAllDocuments() {
        return documentRepository.findAll();
    }

    @Transactional
    List<Document> getAllDocumentsByType(String type) {
        return documentRepository.findAllByType(type);
    }
}
