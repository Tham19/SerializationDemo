package com.github.manager;

import com.github.entity.Shoe;

/**
 * Created by tham on 6/7/17.
 */
public interface ShoeManagerEntity {
    Shoe findById(Integer id);
    void save(Shoe shoe);
}
