$(function () {
   //默认执行
})

function login() {
    var params = new Object();
    params.username = "admin";
    params.password = "123456";
    var url = path+"/login/userlogin";
    $.ajax({
        url: url,
        dataType: "json",
        async: true,
        data: params,
        type: "POST",
        beforeSend: function () {
            //请求前的处理
        },
        success: function (result) {
            //请求成功时处理
        },
        complete: function () {
            //请求完成的处理
        },
        error: function (XMLHttpRequest, textStatus, errorThrown) {
            alert("请求异常");
        }
    });

}