package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;
@Service
public class ContactServiceImpl implements ContactService{


    List<Contact> list = List.of(
            new Contact(1L, "lalu@gmail.com", "lalu", 1311L),
            new Contact(2L, "ritesh@gmail.com", "ritesh yadao", 1311L),
            new Contact(3L, "vijay@gmail.com", "vijay kumar", 1312L),
            new Contact(4L, "asharani@gmail.com", "asharani", 1314L)
    );


    @Override
    public List<Contact> getContactsOfUser(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    

	}

}
