/*
 * Copyright (c) 2023. vnlemanhthanh.com
 */

package com.vnlemanhthanh.spring6webapp.services;

import com.vnlemanhthanh.spring6webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
