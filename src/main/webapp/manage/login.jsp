<%--
  Created by IntelliJ IDEA.
  User: BZhao
  Date: 2017/3/10
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>简借-借书从未如此简单</title>
    <meta name="viewport" content="maximum-scale=1.0,minimum-scale=1.0,user-scalable=0,width=device-width,initial-scale=1.0"/>
    <meta name="format-detection" content="telephone=no,email=no,date=no,address=no">
    <link rel="stylesheet" type="text/css" href="../css/public/aui.css">
    <link rel="stylesheet" type="text/css" href="../css/manage/login.css">
    <script type="text/javascript" src="../js/public/jquery-3.1.1.min.js"></script>

</head>
<body>
    <div class="index-main">
        <div class="index-main-body">
            <div class="index-header">
                <h1 class="logo hide-text">简借</h1>
                <h2 class="subtitle">借书从未如此简单</h2>
            </div>
            <form id="register" class="hidden">
                <div class="aui-content aui-margin-b-15">
                    <ul class="aui-list aui-form-list">
                        <li class="aui-list-item">
                            <div class="aui-list-item-inner">
                                <div class="aui-list-item-input">
                                    <input type="text" placeholder="手机号" name="tel">
                                </div>
                            </div>
                        </li>
                        <li class="aui-list-item">
                            <div class="aui-list-item-inner">
                                <div class="aui-list-item-input">
                                    <input type="password" placeholder="密码" name="tel">
                                </div>
                            </div>
                        </li>
                        <li class="aui-list-item">
                            <div class="aui-list-item-inner">
                                <div class="aui-list-item-input">
                                    <input type="text" placeholder="姓名" name="tel">
                                </div>
                            </div>
                        </li>
                        <li class="aui-list-item">
                            <div class="aui-list-item-inner">
                                <div class="aui-list-item-input">
                                    <input type="text" placeholder="身份证号码" name="tel">
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
                <div>
                    <p><div class="aui-btn aui-btn-info aui-btn-block">注册</div></p>
                    <p><div class="aui-btn" id="toSignin" style="float: right;background-color: #f7fafc;margin-top: 5%">已有账户?</div></p>
                </div>
            </form>
            <form id="login" class="display">
                <div class="aui-content aui-margin-b-15">
                    <ul class="aui-list aui-form-list">
                        <li class="aui-list-item">
                            <div class="aui-list-item-inner">
                                <div class="aui-list-item-input">
                                    <input type="text" placeholder="手机号" name="tel">
                                </div>
                            </div>
                        </li>
                        <li class="aui-list-item">
                            <div class="aui-list-item-inner">
                                <div class="aui-list-item-input">
                                    <input type="password" placeholder="密码" name="tel">
                                </div>
                            </div>
                        </li>
                    </ul>
                </div>
                <div>

                </div>
                <p><div class="aui-btn aui-btn-info aui-btn-block">登录</div></p>
                <div class="aui-col-xs-3 aui-btn" style="background-color: #f7fafc;margin-top: 5%">
                    <a class="Wx-sgin">微信登录:</a>
                    <i class="aui-iconfont aui-icon-wechat"></i>
                </div>
                <p><div class="aui-btn" id="toSignup" style="float: right;background-color: #f7fafc;margin-top: 5%">没有账户?</div></p>
            </form>
        </div>
    </div>
    <script>
        $("#toSignin").click(function () {
            $("#register").removeClass("display");
            $("#register").addClass("hidden");
            $("#login").removeClass("hidden");
            $("#login").addClass("display");
        })
        $("#toSignup").click(function () {
            $("#login").removeClass("display");
            $("#login").addClass("hidden");
            $("#register").removeClass("hidden");
            $("#register").addClass("display");
        })
    </script>
</body>
</html>
