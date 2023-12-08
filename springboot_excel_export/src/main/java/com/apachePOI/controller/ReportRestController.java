package com.apachePOI.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apachePOI.service.ReportService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class ReportRestController {
	
	@Autowired
	private ReportService reportService;
	
	@GetMapping("/excel")
	public void generateExcelReport(HttpServletResponse response) throws Exception{
		
		response.setContentType("application/octet-stream");
		
		String headerKey="content-Disposition";
		String headerValue="attachment;filename=courses.xls";
		
		response.setHeader(headerKey, headerValue);
		
		reportService.generateExcel(response);
		
	}	
	
}
