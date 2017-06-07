package com.github.managerImpl;

import com.github.entity.Shoe;
import com.github.manager.ShoeManagerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.github.repository.ShoeRepository;

/**
 * Created by tham on 6/7/17.
 */
@Service
public class ShoeManagerImpl implements ShoeManagerEntity {
    @Autowired
    private ShoeRepository shoeRepository;

    public Shoe findById(Integer id) {
        return shoeRepository.findOne(id);
    }

    public void save(Shoe shoe) {
        shoeRepository.save(shoe);
    }
}
