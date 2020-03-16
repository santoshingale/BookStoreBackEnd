package com.bridgelabz.bookstore.Exception;

public class BookStoreException extends RuntimeException {

    public ExceptionType type;

    public enum ExceptionType {
        INVALID_DATA,
        NO_BOOK_FOUND,
        MAX_PAGE_LIMIT_REACHED,
        DIRECTORY_NOT_FOUND,
        INVALID_FILE_NAME,
        FILE_NOT_STORED,
        INVALID_BOOK_NAME
    }

    public BookStoreException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
