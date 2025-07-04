package com.library.librarymanagement;

public class BookService {
    private BookRepository bookRepository;

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBook() {
        System.out.println("Book Title: " + bookRepository.getBookTitle());
    }
}
