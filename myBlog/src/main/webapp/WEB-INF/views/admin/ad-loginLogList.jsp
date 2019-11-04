<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
    
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" media="screen" href="${ conextPath }/resources/css/jquery-ui.css" />
    <link rel="stylesheet" type="text/css" media="screen" href="${ conextPath }/resources/css/ui.jqgrid.css" />
	    
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="${ conextPath }/resources/js/i18n/grid.locale-kr.js"></script>
    <script type="text/javascript" src="${ conextPath }/resources/js/jquery.jqGrid.min.js"></script>
<style>
	#jqGridContent{
		margin-top : 80px;
	}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="wrapper">
		<jsp:include page="common/ad-nav.jsp"/>
		<div id="content">
			<div class="container-fluid">
				<div id="jqGridContent">
					<table id="jqGrid">
					
					</table>
					<div id="jqGridPager">
				
					</div>
				</div>
			</div>
		</div>
	</div>


	
	<script type="text/javascript"> 
        $(document).ready(function () {
            $("#jqGrid").jqGrid({
                url: 'selectLoginLogList.ad',
                loadtext: 'loading..',
                mtype: "GET",
                datatype : "json",
                postData : {
                    pageIndex : 1,
                    pageUnit : 10,
                    pageSize : 10,
                },
                colNames:['아이디','성공여부','IP','UA','실패사유','시간',],
                colModel: [
	                 { name: 'mllMid', width:75},
	                 { name: 'mllSuccess', width:35},
	                 { name: 'clIp', width:105},
	                 { name: 'clUserAgent', width:200},
	                 { name: 'mllReason', width:150},
	                 { name: 'clDateTime', width:80}
                ],
                height: 500,
                width:1500,
                rowNum: 20,
                rowList : [10,30,50,100,200],
                pager: "#jqGridPager",
                
                jsonReader: {
                	repeatitems : false,
                	root: "loginList"
            	}
            

            });
        });
        $(window).on('resize.jqGrid', function () {

       		$("#jqGrid").jqGrid( 'setGridWidth', $("#jqGridContent").width());
        });
        
	</script>
	
	
</body>
</html>