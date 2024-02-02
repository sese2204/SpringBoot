package com.example.memorydb.book.bookService;

import com.example.memorydb.book.db.entity.BookEntity;
import com.example.memorydb.book.db.repository.BookRepository;
import com.example.memorydb.user.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public BookEntity create(BookEntity book){
        return bookRepository.save(book);

    }

    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }

    //delete
    public void delete(BookEntity id){
        bookRepository.delete(id);
    }


}
