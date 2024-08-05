package com.niit.WebDemo.services;


import org.springframework.stereotype.Service;

@Service
public class MessageService {
    public String goodDay()
    {
        return "Good Day to You!";
    }
}
