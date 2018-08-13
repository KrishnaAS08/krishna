package com.customerservice.basic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerBean,Integer>
{

}

