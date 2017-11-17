<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>validate</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="<%=basePath%>/js/comm/jquery-1.7.2.js"></script>
	<script type="text/javascript" src="<%=basePath%>js/comm/validate/jquery.validate.js"></script>
	<script type="text/javascript" src="<%=basePath%>/js/comm/validate/localization/messages_cn.js"></script>

	<script type="text/javascript">
	
	$(function(){
        var validate = $("#myForm").validate({
            debug: true, //调试模式取消submit的默认提交功能   
            //errorClass: "label.error", //默认为错误的样式类为：error   
            focusInvalid: false, //当为false时，验证无效时，没有焦点响应  
            onkeyup: false,   
            submitHandler: function(form){   //表单提交句柄,为一回调函数，带一个参数：form   
                alert("提交表单");     
            },   
            
            rules:{
            	name:{
                    required:true
                },
                age:{
                    required:true,
                },
                pass:{
                    required:true,
                    rangelength:[3,10]
                },
                confirm_pass:{
                    equalTo:"#password"
                }                    
            },
            messages:{
            	name:{
                    required:"必填"
                },
                age:{
                    required:"必填"
                },
                pass:{
                    required: "不能为空",
                    rangelength: $.format("密码最小长度:{0}, 最大长度:{1}。")
                },
                confirm_pass:{
                    equalTo:"两次密码输入不一致"
                }                                    
            }
                      
        });    

    });
	
	
	
	
	</script>

  </head>
  
  <body>
  	<form action="" id="myForm" name="myForm">
	    <input type="text" name="name" id="name" value=""><br>
	    <input type="text" name="age" id="age" value=""><br>
	    <input type="password" name="pass" id="pass" value=""><br>
	    <input type="password" name="confirm_pass" id="confirm_pass" value=""><br>
	    <input type="submit" value="提交">
    </form>
  </body>
</html>
