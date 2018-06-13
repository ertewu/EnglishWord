function  startRequest(){

    var frm;
    console.log("ZYStudio document ready occured");
    frm = $("#uploadword_form");
    frm.submit(function(ev){
        console.log("ZYStudio frm sumbmit upload occured");
        $.ajax({
            type:frm.attr('method'),
            url:frm.attr('action'),
            //这个serialize 是序列表格为字符串, 就像get请求的参数一样,跟thymeleaf的object构造并不一样.可能这还不是这么玩的,但先试试会是什么样的结果- 额竟然是行的
            data: frm.serialize(),
            success: function(data){
//                        alert('ok');
                alert(data);
                requestData();
            },
            error:function(e) {
                alert("Err !");
            },
        });
        //location.reload就可以刷新网页
//                location.reload();
        ev.preventDefault();
    });
})
function requestData(){
    console.log("requestData method occured");
    $.ajax({
        type: "GET" ,
        url: "getwords2",
        headers:{
            Accept:"application/json;charset=utf-8"
        },
        success : function(data) {
            alert("GetWord2 success renderJson!");
            //这样子就可以拿到json转成的字符串形式的数据了
            console.log(data);
            console.log(data[0].word);
            renderJson(data);
        },
//                error:function(e){
//                    alert("GetWord2 err!:"+ e.toString()+"|"+ $.ajax.status);
//                },
        error: function(jqXHR, textStatus ,errorThrown){
            alert("GetWord2 err!");
            //这个就是http的状态码,现在返回的是406
            alert("jqXHR:"+jqXHR.status);
            alert("responseText:"+jqXHR.responseText);
        }
    })
}

function renderJson(data){
    //返回的是个数组对象,可以用stringify打回成字符串,但是这个动作完全没意义
//            var str=JSON.stringify(data);
//            $("#word_list_area").html(str);
//            var firstElement=data[0].word;
//            $("#word_list_area").html(firstElement);

    console.log(data.length);
    var node= $("#word_list");
    node.empty();
    node.append("<table>")

    for(var i=0; i<data.length; i++){
        console.log(i+":"+data[i].word);
        node.append("<tr><td>"+ data[i].word+ "</td></tr>")
    }
    node.append("</table>")
//            $("#word_list_area").html();

}
