package com.boys.util;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.lionsoul.ip2region.DataBlock;
import org.lionsoul.ip2region.DbConfig;
import org.lionsoul.ip2region.DbMakerConfigException;
import org.lionsoul.ip2region.DbSearcher;
/**
 * 
 * 项目名称：boys   
 * 类名称：IpToRegionUtil   
 * 类描述： 
 * 创建人：boys  
 * 创建时间：2017年11月24日 下午4:28:45
 */

public class IpToRegionUtil {

	
//	private static  DbSearcher searcher;
//	
//	static{
//		
//		 try {
//			searcher = new DbSearcher(new DbConfig(), "D:/job/apache-tomcat-7.0.54/webapps/boys/WEB-INF/classes/com/boys/action/data/ip2region.db");
//			
//		} catch (IOException e) {
//				
//				e.printStackTrace();
//		}  catch (DbMakerConfigException e) {
//				
//			e.printStackTrace();
//		}
//
//	}
	
	public static String ipToRegion(String ip){
		
		 if(ip==null||"".equals(ip.trim())){
			 return "ip为空！";
		 }
		
		
		 String region = "未知";
		 try {
			 DbSearcher searcher = new DbSearcher(new DbConfig(), "D:/job/apache-tomcat-7.0.54/webapps/boys/WEB-INF/classes/com/boys/action/data/ip2region.db");
		     DataBlock fdata = searcher.binarySearch(ip);
		     region = fdata.getRegion();
		     
		 }catch(Exception e){
			 e.printStackTrace();
		 }
		 
		 
		
		return region;
	}
	
	
	
    public static void main(String[] args) throws DbMakerConfigException {
    	
    	
    	System.out.println("结果："+IpToRegionUtil.ipToRegion("58.61.49.126"));
    	
    }

}

