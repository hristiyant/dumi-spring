package com.drisko.dumi.repository;

import com.drisko.dumi.model.Word;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WordRepository extends JpaRepository<Word, Integer> {

    List<Word> findAll();

    List<Word> findAllByPrefixId(int id);
}
