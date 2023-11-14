package com.chunjae.pro05.persis;

import com.chunjae.pro05.entity.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NoticeMapper {
    // 공지사항 목록
    @Select("select * from notice")
    public List<Notice> noticeList();
    // 공지사항 상세보기
    @Select("select * from notice where nno = #{nno}")
    public Notice noticeDetail(Integer nno);
    // 공지사항 글쓰기
    @Insert("insert into notice(title, content, author) values(#{title}, #{content}, #{author}) ")
    public void noticeInsert(Notice notice);
    // 공지사항 글 수정하기
    @Update("update notice set title = #{title}, content = #{content} where nno = #{nno}")
    public void noticeEdit(Notice notice);
    // 공지사항 글 삭제하기
    @Delete("delete from notice where nno = #{nno}")
    public void noticeDelete(Integer nno);
}