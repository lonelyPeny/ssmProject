<%--
  Created by IntelliJ IDEA.
  User: peny
  Date: 2019/3/15
  Time: 13:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% String path=request.getContextPath();
String basePath=request.getScheme()+"://"+request.getServerName()+":"+request.getServletPath();
%>
<html>
<head>
    <title>登录</title>
    <link rel="icon" href="<%=path%>/static/images/favicon.ico" type="image/x-icon"/>
    <link rel="shortcut icon" href="<%=path%>/static/images/favicon.ico" type="image/x-icon"/>
    <link href="<%=path%>/static/css/default.css" rel="stylesheet" type="text/css" />
    <!--必要样式-->
    <link href="<%=path%>/static/css/styles.css" rel="stylesheet" type="text/css" />
    <link href="<%=path%>/static/css/demo.css" rel="stylesheet" type="text/css" />
    <link href="<%=path%>/static/css/loaders.css" rel="stylesheet" type="text/css" />
    <script src="<%=path%>/static/js/jquery-2.1.1.min.js"></script>
</head>
<body>
<div class='login'>

    <!--<img class="MyLogo" src="/loginSpecial/images/logo01.png" alt="   LOGO">-->
    <div class='login_title'>
        <span>管理员登录</span>
    </div>
    <div class='login_fields'>
        <div class='login_fields__user'>
            <div class='icon'>

                <img alt="" src="<%=path%>/static/img/user_icon_copy.png">
            </div>
            <input name="login" placeholder='用户名' maxlength="16" class="username" type='text' autocomplete="off" value="admin"/>
            <div class='validation'>
                <img alt="" src="<%=path%>/static/img/tick.png">
            </div>
        </div>
        <div class='login_fields__password'>
            <div class='icon'>
                <img alt="" src='<%=path%>/static/img/lock_icon_copy.png'>
            </div>
            <input name="pwd" class="passwordNumder" placeholder='密码' maxlength="16" type='text' autocomplete="off">
            <div class='validation'>
                <img alt="" src='<%=path%>/static/img/tick.png' >
            </div>
        </div>
        <div class='login_fields__password'>
            <div class='icon'>
                <img alt="" src='<%=path%>/static/img/key.png'>
            </div>
            <input name="code" placeholder='验证码' maxlength="4"  class="ValidateNum" type='text' name="ValidateNum" autocomplete="off">
            <div class='validation' style="opacity: 1; right: -5px;top: -3px;">
                <canvas class="J_codeimg" id="myCanvas" onclick="Code();">对不起，您的浏览器不支持canvas，请下载最新版浏览器!</canvas>
            </div>
        </div>
        <div class='login_fields__submit'>
            <input type='button' value='登录'>
        </div>
    </div>
    <div class='success'>
    </div>
    <div class='disclaimer'>
        <p>欢迎登陆接入平台</p>
    </div>
</div>
<div class='authent'>
    <div class="loader" style="height: 60px;width: 60px;margin-left: 28px;margin-top: 40px">
        <div class="loader-inner ball-clip-rotate-multiple">
            <div></div>
            <div></div>
            <div></div>
        </div>
    </div>
    <p>认证中...</p>
</div>
<div class="OverWindows"></div>
<link href="<%=path%>/static/layui/css/layui.css" rel="stylesheet" type="text/css" />
<!--<script src="http://www.jq22.com/jquery/jquery-1.10.2.js"></script>-->
<script type="text/javascript" src="<%=path%>/static/js/jquery-ui.min.js"></script>
<script type="text/javascript" src='<%=path%>/static/js/stopExecutionOnTimeout.js?t=1'></script>
<script src="<%=path%>/static/layui/layui.js" type="text/javascript"></script>
<script src="<%=path%>/static/js/Particleground.js" type="text/javascript"></script>
<script src="<%=path%>/static/js/Treatment.js" type="text/javascript"></script>
<script src="<%=path%>/static/js/jquery.mockjax.js" type="text/javascript"></script>
<script src="<%=path%>/static/js/controlLogin.js" type="text/javascript"></script>
</body>
</html>
