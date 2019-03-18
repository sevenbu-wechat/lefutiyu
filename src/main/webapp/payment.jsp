<%--
  Created by IntelliJ IDEA.
  User: jackiechan
  Date: 2018/2/28
  Time: 下午8:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript">
        var websocket=null;//websocket 的变量
        function load() {//初始化 websocket
            //获取订单号
            var oid = document.getElementById("oid").innerHTML;
                //建立连接
             if('WebSocket' in window){//支持 websocket
                websocket=new WebSocket("ws://"+document.location.host+"/payment/websocket/"+oid);
                
                websocket.onopen=function () {
                    fillData("建立连接了")
                }
                websocket.onclose=function () {
                    fillData("连接关闭了")
                }
                websocket.onerror=function () {
                    fillData("出现错误了")
                }
                websocket.onmessage=function (event) {
                    fillData(event.data);
                    location.href="http://www.baidu.com";
                }
                
             }else{
                 alert("浏览器不支持 websocket")
             }
            //设置监听,当有消息来的时候的监听
           
        }
        
        function fillData(data) {
            document.getElementById("message").innerHTML=data;
        }
        
        
        
      // window.onload=load();//页面加载完成后执行 load 方法

        
    </script>
</head>
<body onload="load()">
当前是支付页面,正在支付的订单号是:<span id="oid">${oid}</span><br>
请扫描支付
<img src="/payment/image">
<br>
<br>
<br>
<br>
<br>
<br>
<span id="message"></span>
</body>
</html>
