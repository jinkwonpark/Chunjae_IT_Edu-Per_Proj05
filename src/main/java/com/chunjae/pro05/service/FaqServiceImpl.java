package com.chunjae.pro05.service;

import com.chunjae.pro05.entity.Faq;
import com.chunjae.pro05.persis.FaqMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaqServiceImpl implements FaqService{
    @Autowired
    private FaqMapper faqMapper;

    @Override
    public List<Faq> faqList() { return faqMapper.faqList(); }
}
