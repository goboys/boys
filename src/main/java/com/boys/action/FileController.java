package com.boys.action;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/file")
public class FileController {
	
	
	
	@RequestMapping("/init")
	public String test(HttpServletRequest request,HttpServletResponse response){
		System.out.println("下载什么东西？");
		return "file/file";
	}
	
	@RequestMapping("/download")
	public  void download(String path, HttpServletResponse response) throws Exception {   
		
		InputStream fis = null;
		OutputStream toClient = null;
	    try {   
	    	System.out.println("开始下载......");
	            File file = new File(path);   
	              if (file.exists()) {   
	                 String filename = file.getName();   
	                 fis = new BufferedInputStream(new FileInputStream( file));   
	                  response.reset();   
	                  response.setContentType("application/x-download");
	                  response.addHeader("Content-Disposition","attachment;filename="+ new String(filename.getBytes(),"iso-8859-1"));
	                  response.addHeader("Content-Length", "" + file.length());   
	                  toClient = new BufferedOutputStream(response.getOutputStream());   
	                response.setContentType("application/octet-stream");   
	                  byte[] buffer = new byte[1024 * 1024 * 4];   
	                  int i = -1;   
	                  while ((i = fis.read(buffer)) != -1) {   
	                      toClient.write(buffer, 0, i);  
	                      
	                  }   
	                  
	                  try {
	                	  response.wait();
			            } catch (InterruptedException e) {
			            	e.printStackTrace();
			            }  
	              } else {   
	                 PrintWriter out = response.getWriter();   
	                 out.print("<script>");   
	                 out.print("alert(\"not find the file\")");   
	                 out.print("</script>");  
	                 out.close();
	              }  
	              System.out.println("下载......");
	          } catch (IOException ex) {   
	             PrintWriter out = response.getWriter();   
	                 out.print("<script>");   
	                 out.print("alert(\"not find the file\")");   
	                 out.print("</script>");   
	                 out.close();
	          }finally{
		    	  if(fis!=null){
		    		  fis.close();  
		    	  }
		    	  if(toClient!=null){
		              toClient.flush();   
		              toClient.close();  
		    	  }
		      }  
	     
	}

}
