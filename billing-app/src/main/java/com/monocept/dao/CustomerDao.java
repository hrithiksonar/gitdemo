package com.monocept.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.monocept.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer> {

}
