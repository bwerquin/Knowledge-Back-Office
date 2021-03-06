package fr.insee.knowledge.git.access;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.insee.knowledge.domain.KnowledgeFile;
import fr.insee.knowledge.domain.Product;

import java.io.File;
import java.io.IOException;
import java.util.List;

@org.springframework.stereotype.Service
public class ProductDataAccess {

    public List<Product> serializeFromFile(KnowledgeFile resource) throws IOException {

       ObjectMapper objectMapper = new ObjectMapper();
       List<Product> products;
       products = objectMapper.readValue(new File(resource.getPath()), new TypeReference<List<Product>>() {});
       return products;

    }

}
