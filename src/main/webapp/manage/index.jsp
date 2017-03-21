<%--
  Created by IntelliJ IDEA.
  User: BZhao
  Date: 2017/3/10
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
    <meta name="viewport" content="maximum-scale=1.0,minimum-scale=1.0,user-scalable=0,width=device-width,initial-scale=1.0"/>
    <meta name="format-detection" content="telephone=no,email=no,date=no,address=no">
    <link rel="stylesheet" type="text/css" href="css/public/aui.css">
    <%--<link rel="stylesheet" type="text/css" href="css/public/bootstrap.min.css">--%>
    <link rel="stylesheet" type="text/css" href="css/public/aui-slide.css">
    <script type="text/javascript" src="js/public/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" src="js/public/angular.min.js"></script>
    <script type="text/javascript" src="js/public/aui-tab.js"></script>
    <script type="text/javascript" src="js/public/aui-slide.js"></script>
    <style>
        .img-responsive{
            display: block;
            max-width: 80%;
            height: auto;
        }
    </style>
</head>
<body>
<header class="aui-bar aui-bar-nav aui-bar-light">
    <div class="aui-searchbar" id="searchTow">
        <i class="aui-iconfont aui-icon-left"></i>
        <div class="aui-searchbar-input aui-border-radius">
            <i class="aui-iconfont aui-icon-search"></i>
            <form action="javascript:search;">
                <input type="search" placeholder="请输入搜索内容" id="search-input">
            </form>
        </div>
    </div>
</header>
<div id="aui-slide">
    <div class="aui-slide-wrap">
        <div class="aui-slide-node bg-dark">
            <img src="images/img1.jpg">
        </div>
        <div class="aui-slide-node bg-dark">
            <img src="images/img2.jpg">
        </div>
        <div class="aui-slide-node bg-dark">
            <img src="images/img3.jpg">
        </div>
    </div>
    <div class="aui-slide-page-wrap"><!--分页容器--></div>
</div>
<section class="aui-grid aui-margin-b-15">
    <div class="aui-row">
        <div class="aui-col-xs-4">
            <img src="images/book1.jpg" class="img-responsive">
        </div>
        <div class="aui-col-xs-4">
            <img src="images/book2.jpg" class="img-responsive">
        </div>
        <div class="aui-col-xs-4">
            <img src="images/book3.jpg" class="img-responsive">
        </div>
        <div class="aui-col-xs-4">
            <img src="images/book2.jpg" class="img-responsive">
        </div>
        <div class="aui-col-xs-4">
            <img src="images/book3.jpg" class="img-responsive">
        </div>
        <div class="aui-col-xs-4">
            <img src="images/book1.jpg" class="img-responsive">
        </div>
    </div>
</section>
<%--<div class="aui-card-list">--%>
    <%--<div class="aui-card-list-content">--%>
        <%--<ul class="aui-list aui-media-list">--%>
            <%--<li class="aui-list-item aui-list-item-middle">--%>
                <%--<div class="aui-media-list-item-inner">--%>
                    <%--<div class="aui-list-item-media">--%>
                        <%--&lt;%&ndash;<img src="" class="aui-img-round aui-list-img-sm">&ndash;%&gt;--%>
                    <%--</div>--%>
                    <%--<div class="aui-list-item-inner aui-list-item-arrow">--%>
                        <%--<div class="aui-list-item-text">--%>
                            <%--<div class="aui-list-item-title aui-font-size-18">JavaWeb王者归来</div>--%>
                        <%--</div>--%>
                        <%--<div class="aui-list-item-text">--%>
                            <%--<div class="aui-list-item-text aui-font-size-16">刘京华</div>--%>
                            <%--<div class="aui-list-item-right aui-font-size-14">馆藏量：3</div>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</li>--%>
        <%--</ul>--%>
    <%--</div>--%>
<%--</div>--%>
<footer class="aui-bar aui-bar-tab" id="footer">
    <div class="aui-bar-tab-item aui-active" tapmode>
        <i class="aui-iconfont aui-icon-home"></i>
        <div class="aui-bar-tab-label">首页</div>
    </div>
    <div class="aui-bar-tab-item" tapmode>
        <i class="aui-iconfont aui-icon-cart"></i>
        <div class="aui-bar-tab-label">借书栏</div>
    </div>
    <div class="aui-bar-tab-item" tapmode>
        <i class="aui-iconfont aui-icon-my"></i>
        <div class="aui-bar-tab-label">个人中心</div>
    </div>
</footer>
<script>
    $("#search-input").bind('input propertychange',function () {
        if($(this).val().length > 0){
            var bookName = $(this).val();
            console.log(bookName);
            $.ajax({
                url:'selectBooks',
                type:'post',
                dataType:'JSON',
                data:{"bookName":bookName},
                success:function (result) {
                    if(result.key = "success"){

                    }
                    if(result.key = "error"){
                        console.log(result.error);
                    }
                },
                error:function () {
                    
                }
            });
        }
    })
    var tab = new auiTab({
        element:document.getElementById("footer"),
        index:1,
        repeatClick:false
    },function(ret){
        console.log(ret);
    });
    var slide = new auiSlide({
        container:document.getElementById("aui-slide"),
        // "width":300,
        "height":150,
        "speed":600,
        "pageShow":true,
        "autoPlay":3000,
        "pageStyle":'dot',
        "loop":true,
        'dotPosition':'center',
//        currentPage:currentFun
    })
</script>
</body>
</html>
