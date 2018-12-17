<%--
  Created by IntelliJ IDEA.
  User: 章文翔
  Date: 2018/12/12
  Time: 14:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="doRegister">    <%--握手链接名: register--%>
    用户名:<input type="text" name="username" id="uname" class="a"><span id="message" ></span><br>
    <br>
    密码: <input type="password" name="pwd" id="pwd"  placeholder="6~18 数字和字母">
    <br>
    确认密码: <input type="password" name="pwds"  id="pwds" class="a" placeholder="6~18 数字和字母"><span id="pmes" ></span>
    <br>
    手机: <<input type="text" name="tele" id="tele"  placeholder="手机号码">
    <br>
    <input type="button" value="注册" disabled="disabled" id="btn">
</form>
<script type="text/javascript" src="jquery/jquery-3.3.1.min.js"> </script>
<script>


        $(function (){

            /*使用ajax*/
            var un;
            var ps;
            var p;
            var tele;
            $(".a").blur(function () {
                un= $("#uname").val();
                p= $("#pwd").val();                                          //input标签,所以这里可以获取val值
                   ps= $("#pwds").val();                         //span标签,所以这里只能获取text值
                tele=$("#tele").val();
                $.ajax({
                    url:"doRegister",
                    type:"get",
                    data:{"names":un,"p":p,"ps":ps,"tele":tele},
                    success:function (data) {         //回调函数,当事件触发时,会返回一个值
                      // if (data=="1"){
                      //     $("#btn").css({"disablea":true});
                      // } else{
                      //     $("#message").text("有错误消息")
                      }
                    }
                });
            });



        })
</script>
</body>
</html>
