package com.mybookmanagement.book_management_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mybookmanagement.book_management_backend.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}