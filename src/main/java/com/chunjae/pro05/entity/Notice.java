package com.chunjae.pro05.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice {
    private Integer nno;
    private String title;
    private String content;
    private String regdate;
    private Integer visited;
}