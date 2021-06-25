package com.guru.msscbrewery.web.mappers;

import com.guru.msscbrewery.domain.Customer;
import com.guru.msscbrewery.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);

    Customer customerDtoToCustomer(CustomerDto customerDto);
}
