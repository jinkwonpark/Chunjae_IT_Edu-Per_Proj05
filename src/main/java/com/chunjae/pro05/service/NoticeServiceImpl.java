package com.chunjae.pro05.service;

import com.chunjae.pro05.entity.Notice;
import com.chunjae.pro05.persis.NoticeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    private NoticeMapper noticeMapper;

    @Override
    public List<Notice> noticeList() {
        return noticeMapper.noticeList();
    }

    @Override
    public Notice noticeDetail(Integer nno) {
        return noticeMapper.noticeDetail(nno);
    }

    @Override
    public void noticeInsert(Notice notice) { noticeMapper.noticeInsert(notice); }

    @Override
    public void noticeEdit(Notice notice) {
        noticeMapper.noticeEdit(notice);
    }

    @Override
    public void noticeDelete(Integer nno) {
        noticeMapper.noticeDelete(nno);
    }
}
