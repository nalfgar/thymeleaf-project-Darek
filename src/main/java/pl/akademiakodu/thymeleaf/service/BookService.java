package pl.akademiakodu.thymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.akademiakodu.thymeleaf.model.BookCRUDrepository;

@Service
public class BookService {

    @Autowired
    BookCRUDrepository bookCRUDrepository;
}
