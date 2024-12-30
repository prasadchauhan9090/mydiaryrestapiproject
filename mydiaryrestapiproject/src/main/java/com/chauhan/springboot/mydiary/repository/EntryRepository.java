package com.chauhan.springboot.mydiary.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.chauhan.springboot.mydiary.entity.Entry;

public interface EntryRepository extends JpaRepository<Entry, Long> {
}
