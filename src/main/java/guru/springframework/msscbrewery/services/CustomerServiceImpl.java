package guru.springframework.msscbrewery.services;

import guru.springframework.msscbrewery.web.model.CustomerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("adam")
                .build();
    }

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return CustomerDto.builder()
                .name(customerDto.getName())
                .id(customerDto.getId())
                .build();
    }

    @Override
    public void updateById(UUID customerId, CustomerDto customerDto) {
        log.debug("Updating customer ..");
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting customer ..");
    }
}
