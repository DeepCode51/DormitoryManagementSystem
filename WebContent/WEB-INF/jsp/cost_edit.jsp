<%--
  Created by IntelliJ IDEA.
  User: hkw
  Date: 2018/11/14
  Time: 16:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>修改信息</title>
    <link rel="icon" href="/images/favicon.ico" sizes="32x32" />
    <link rel="stylesheet" href="/css/font.css">
    <link rel="stylesheet" href="/css/xadmin.css">
    <link rel="stylesheet" href="/css/pg_btn.css">
    <script type="text/javascript" src="./js/jquery-1.3.2.min.js"></script>
    <script src="lib/layui/layui.js"></script>
    <script type="text/javascript" src="./js/xadmin.js"></script>
</head>

<body>

<div class="x-body">
    <form class="layui-form" action="/updateCost" method="post"  id="f_auto" accept-charset="UTF-8">
        <input type="hidden" value="${sessionScope.s.id}" name="id" id="id"/>
        <div class="layui-form-item">
             <label class="layui-form-label">寝室编号：</label>
             <div class="layui-input-block">
                 <input type="text" lay-verify="required" value="${sessionScope.s.dormitoryid}" name="dormitoryid"  class="layui-input" placeholder="请输入寝室编号">
             </div>
         </div>

         <div class="layui-form-item">
             <label class="layui-form-label">水费：</label>
             <div class="layui-input-block">
                 <input type="text" lay-verify="required" value="${sessionScope.s.waterprice}" name="waterprice"  class="layui-input" placeholder="请输入水费">
             </div>
         </div>
         
           <div class="layui-form-item">
             <label class="layui-form-label">电费：</label>
             <div class="layui-input-block">
                 <input type="text" lay-verify="required" value="${sessionScope.s.electricityprice}" name="electricityprice" class="layui-input" i placeholder="请输入电费">
             </div>
         </div>

         <div class="layui-form-item">
             <label class="layui-form-label">缴纳状态</label>
             <div class="layui-input-block">
                 <input type="radio" name="status" value="未缴纳" title="未缴纳" checked="">
                 <input type="radio" name="status" value="已缴纳" title="已缴纳">
             </div>
         </div>

         <div class="layui-form-item">
             <label class="layui-form-label">备注：</label>
             <div class="layui-input-block">
                 <input type="text"  name="remark" value="${sessionScope.s.remark}" class="layui-input" placeholder="请输入备注">
             </div>
         </div>

        <div class="layui-form-item" id="btn_xg">
            <button  class="layui-btn"  id="btn_on" lay-filter="updateForm" lay-submit="">
                修改
            </button>
        </div>
    </form>
</div>

</body>
</html>
