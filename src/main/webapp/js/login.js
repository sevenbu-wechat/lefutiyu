$(function(){

    $('#loginSubmit').click(function () {
        var studentName = $('#studentName').val().trim();
        var studentTime = $('#studentTime').val();
        var studentHeight = $('#studentHeight').val().trim();

        var studentAge = $('#studentAge').val().trim();

        var phoneNum = $('#phoneNum').val().trim();
        var parentsMessage = $('#parentsMessage').val();
        var originFrom = $("input[name='originFrom']:checked").val();

        var studentLocate = $("#studentLocate").val();



        // $("#select_id").change(function(){//code...}); //为Select添加事件，当选择其中一项时触发
        //
        // })

        if(!studentName || !studentTime || !studentHeight || !phoneNum || !originFrom || !studentLocate){
            alert("请完整填写报名信息！")
            return;
        }

        var regix = /^[1-9]+[0-9]*]*$/;
        if (!regix.test(studentHeight)) {
            alert("请正确填写身高");
            return;
        }

        if(!regix.test(studentAge)){
            alert("请正确填写年龄");
            return;
        }

        var regix2 = /^0?1[3|4|5|6|7|8][0-9]\d{8}$/;
        if(!regix2.test(phoneNum)){
            alert("请填写11位正确手机号");
            return;
        }

        var domain = location.host;

        //var url= domain + "/loveSports/customer/signUp";
        var url = "../customer/signUp";

        var param = {};
        param.userName = studentName;
        param.trainBase = studentLocate;
        param.schedule = studentTime;
        param.mobile = phoneNum;
        param.age = studentAge;
        param.height = studentHeight;
        param.channel = originFrom;
        param.remark = parentsMessage;

        $.ajax({
            url: '../customer/signUp',
            type: 'POST',
            dataType: 'json',
            contentType: 'application/json',
            data: JSON.stringify(param),
            success: function(data) {
                alert("success")
            }
        })

    })

});

