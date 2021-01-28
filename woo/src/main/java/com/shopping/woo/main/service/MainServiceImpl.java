package com.shopping.woo.main.service;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shopping.woo.main.mapper.MainMapper;

@Service
public class MainServiceImpl implements MainService{
    
    @Autowired
    private MainMapper mainMapper;

    @Override
    public List<Map<String, String>> getTest() {
        System.out.println("hihi "+mainMapper.getTest());
        return null;
    }
}
