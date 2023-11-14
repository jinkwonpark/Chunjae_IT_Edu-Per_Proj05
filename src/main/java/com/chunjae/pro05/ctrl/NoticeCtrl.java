package com.chunjae.pro05.ctrl;

import com.chunjae.pro05.entity.Notice;
import com.chunjae.pro05.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/notice/*")
public class NoticeCtrl {

    @Autowired
    private NoticeService noticeService;

    // 공지사항 목록
    @GetMapping("noticeList")
    public String noticeList(Model model) {
        List<Notice> noticeList = noticeService.noticeList();
        model.addAttribute("noticeList", noticeList);
        return "notice/noticeList";
    }

    // 공지사항 상세보기
    @GetMapping("noticeDetail")
    public String noticeDetail(HttpServletRequest request, Model model) {
        Integer nno = Integer.parseInt(request.getParameter("nno"));
        // 조회수 증가 넣기
        Notice noticeDetail = noticeService.noticeDetail(nno);
        model.addAttribute("nd", noticeDetail);
        return "notice/noticeDetail";
    }

    // 공지사항 글 삭제하기
    @GetMapping("noticeDelete")
    public String noticeDelete(HttpServletRequest request, Model model) {
        Integer nno = Integer.parseInt(request.getParameter("nno"));
        noticeService.noticeDelete(nno);
        return "redirect:noticeList";
    }

    // 공지사항 글쓰기
    @GetMapping("noticeInsert")
    public String noticeInsertForm(HttpServletRequest request, Model model) {
        return "notice/noticeInsert";
    }

    @PostMapping("noticeInsert")
    public String noticeInsert(HttpServletRequest request, Model model) {
        Notice noticeInsert = new Notice();
        noticeInsert.setTitle(request.getParameter("title"));
        noticeInsert.setContent(request.getParameter("content"));
        noticeService.noticeInsert(noticeInsert);
        return "redirect:noticeList";
    }

    // 공지사항 수정하기
    @GetMapping("noticeEdit")
    public String noticeEditForm(HttpServletRequest request, Model model) {
        Integer nno = Integer.parseInt(request.getParameter("nno"));
        Notice noticeEdit = noticeService.noticeDetail(nno);
        model.addAttribute("noticeEdit", noticeEdit);
        return "notice/noticeEdit";
    }

    @PostMapping("noticeEdit")
    public String noticeEdit(HttpServletRequest request, Model model) {
        Integer nno = Integer.parseInt(request.getParameter("nno"));
        Notice noticeEdit = new Notice();
        noticeEdit.setNno(nno);
        noticeEdit.setTitle(request.getParameter("title"));
        noticeEdit.setContent(request.getParameter("content"));
        noticeService.noticeEdit(noticeEdit);
        return "redirect:noticeList";
    }
}