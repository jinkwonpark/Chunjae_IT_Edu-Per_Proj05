package com.chunjae.pro05.persis;

import com.chunjae.pro05.entity.Faq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface FaqMapper {
    @Select("select * from faq")
    public List<Faq> faqList();
}
