package lk.ijse.gdse.aad.posusingspring.util;


import lk.ijse.gdse.aad.posusingspring.dto.CustomerDto;
import lk.ijse.gdse.aad.posusingspring.dto.ItemDto;
import lk.ijse.gdse.aad.posusingspring.entity.Customer;
import lk.ijse.gdse.aad.posusingspring.entity.Item;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Mapping {
    @Autowired
    private ModelMapper modelMapper;

    public Customer convertToEntity(CustomerDto customerDto){
        return modelMapper.map(customerDto, Customer.class);
    }

    public CustomerDto convertToDto(Customer customer){
        return modelMapper.map(customer, CustomerDto.class);
    }

    public List<CustomerDto> convertToDtos(List<Customer> customerList){
        return modelMapper.map(customerList, new TypeToken<List<CustomerDto>>(){}.getType());
    }

    public Item convertToEntity(ItemDto itemDto){
        return modelMapper.map(itemDto, Item.class);
    }

    public ItemDto convertToDto(Item item){
        return modelMapper.map(item, ItemDto.class);
    }

    public List<ItemDto> convertToItemDtos(List<Item> itemList){
        return modelMapper.map(itemList, new TypeToken<List<ItemDto>>(){}.getType());
    }
}
