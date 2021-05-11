package com.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mindtree.bean.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
