$(document).ready(function () {

    var a = false;
    var $username =  $("#username");
    $username.blur(function () {
        if($username.val() == null || $username.val() == ''){
            alert("请输入用户名");
            a = false;
        }else{
            a = true;
        }
    });

    var $password = $("#password");
    $password.blur(function () {
        if($password.val() == null || $password.val() == ''){
            alert("请输入密码");
            a = false;
        }else{
            a = true;
        }
    });

    $("#login").click(function () {
        if(a == true){
            var username = $username.val();
            var password = $password.val();

            $.ajax({
                url:"/spring03/login",
                data:{"username":username,"password":password},
                type:"GET",
                dataType:"text",
                success:function (data) {
                    alert(data);
                    if(data == "登陆成功"){
                        self.location.href = "http://www.baidu.com";
                    }
                },
                error:function () {
                    alert("请求失败");
                }
            });
        }else{
            alert("请输入用户名和密码");
        }

    });
});