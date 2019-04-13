$(function(){

    $("#studentLocate").change(function(){
        var studentLocate = $("#studentLocate").val();
        if(studentLocate){
            var url = "../customer/getShcedule";

            var param = {};
            param.trainBaseCode = studentLocate;

            $.ajax({
                url: url,
                type: 'POST',
                dataType: 'json',
                contentType: 'application/json',
                data: JSON.stringify(param),
                success: function(data) {
                    var dataJson = eval("("+data+")");
                    if(dataJson.resultCode == '00'){
                        var res = dataJson.data;
                        for(var i=0; i < res.length; i++){
                            var schedule = res[i];
                            $("#studentTime").append("<option value='"+ schedule.timeScheduleCode+"'>"+schedule.timeSchedule+"</option>");
                        }
                    }
                }
            })

        }else {

        }

    }); //为Select添加事件，当选择其中一项时触发


    $('#loginSubmit').click(function () {
        var studentName = $('#studentName').val().trim();
        var studentTime = $('#studentTime').val();
        var studentHeight = $('#studentHeight').val().trim();

        var studentAge = $('#studentAge').val().trim();

        var phoneNum = $('#phoneNum').val().trim();
        var parentsMessage = $('#parentsMessage').val();
        var originFrom = $("input[name='originFrom']:checked").val();

        var studentLocate = $("#studentLocate").val();
        var studentTime = $("#studentTime").val();

        if(!studentName || !studentTime || !studentHeight || !phoneNum || !originFrom || !studentLocate ||!studentTime){
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
        param.trainBaseCode = studentLocate;
        param.timeScheduleCode = studentTime
        param.mobile = phoneNum;
        param.age = studentAge;
        param.height = studentHeight;
        param.channel = originFrom;
        param.remark = parentsMessage;

        $.ajax({
            url: url,
            type: 'POST',
            dataType: 'json',
            contentType: 'application/json',
            data: JSON.stringify(param),
            success: function(data) {
                var dataJson = eval("("+data+")");

                if(dataJson.resultCode == '00'){
                    window.location.href = '../success.html';
                }else {
                    window.location.href = '../fail.html';
                }
            }
        })

    })

});

