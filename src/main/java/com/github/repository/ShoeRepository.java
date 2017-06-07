package com.github.repository;

import com.github.entity.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by tham on 6/7/17.
 */
@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Integer> {

}
