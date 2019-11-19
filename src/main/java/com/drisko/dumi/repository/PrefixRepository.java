package com.drisko.dumi.repository;

import com.drisko.dumi.model.Prefix;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrefixRepository extends JpaRepository<Prefix, Integer> {

    Prefix findById(int id);
}
