package com.ufkunl.workshop.repository;

import com.ufkunl.workshop.entity.Place;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @developer -- ufukunal
 */

@Repository
public interface PlaceRepository extends JpaRepository<Place,String> {

}
