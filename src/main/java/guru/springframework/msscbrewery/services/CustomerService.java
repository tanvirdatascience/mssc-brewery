package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerByID(UUID customerId);

    CustomerDto saveCustomer(CustomerDto customerrDto);

    void updateCustomer(UUID customerId, CustomerDto customerrDto);

    void deleteById(UUID beerId);


}
