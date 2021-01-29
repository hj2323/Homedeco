package com.mysecurity.dto;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;
@Data
public class Board {
	private int num;
	private String title;
	private String writer;
	private String content;
	private MultipartFile  uploadFile;
	private String bimg;

}
























