package fr.icchoirlyon.document;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DocumentController {
    @Autowired
    DocumentService documentService;

    @GetMapping("/documents")
    //public Page<Document> getAllDocuments()
    public List<Document> getAllDocuments() {
        return documentService.getAllDocuments();
    }

    @GetMapping("/documents/{type}")
    public List<Document> getAllDocumentsByType(@PathVariable String type) {
        return documentService.getAllDocumentsByType(type);
    }

    @GetMapping("/documents/piece/{id}")
    public Document getDocument(@PathVariable Long id) {
        return documentService.getDocument(id);
    }
}
