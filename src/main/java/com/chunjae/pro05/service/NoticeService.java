package com.chunjae.pro05.service;

import com.chunjae.pro05.entity.Notice;

import java.util.List;

public interface NoticeService {
    public List<Notice> noticeList();
    public Notice noticeDetail(Integer nno);
    public void noticeInsert(Notice notice);
    public void noticeEdit(Notice notice);
    public void noticeDelete(Integer bno);
}