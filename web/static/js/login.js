$(document).ready(function () {
    $("#login").click(function () {
        var user_username=$("#username").val();
        var user_password=$("#password").val()

        // $.ajax({
        //     url:"/ssm01/user/login",
        //     data:{"user_username":user_username,"user_password":user_password},
        //     dataType:"text",
        //     type:"POST",
        //     success:function (data) {
        //         alert(data);
        //     },
        //     error:function () {
        //         alert("失败")
        //     }
        // })
    })
q