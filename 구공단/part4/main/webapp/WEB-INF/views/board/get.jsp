<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%@include file="../includes/header.jsp" %>

   <div class="row">
                <div class="col-lg-12">
                    <h1 class="page-header">Tables</h1>
                </div>
                <!-- /.col-lg-12 -->
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default">
                      <div class="panel-heading">
                            Board Read Page
                        </div>
                        <!-- /.panel-heading -->
                        <div class="panel-body">
                        		
                        		<div class="form-group">
                        			<label>bno</label>
                        			<input class="form-control" name='bno'
                        			value='<c:out value="${board.bno}"/>' readonly="readonly">
                        		</div>
                        		
                        		<div class="form-group">
                        			<label>title</label>
                        			<input class="form-control" name='title'
                        			value='<c:out value="${board.title}"/>' readonly="readonly">
                        		</div>
                        		
                        		<div class="form-group">
                        			<label>text area</label>
                        			<input class="form-control" name='content'
                        			value='<c:out value="${board.content}"/>' readonly="readonly">
                        		</div>
                        		
                        		<div class="form-group">
                        			<label>writer</label>
                        			<input class="form-control" name='writer'
                        			value='<c:out value="${board.writer}"/>' readonly="readonly">
                        		</div>
                        		
                        	<%-- 	<button data-oper='modify' class="btn btn-default"
                        		onclick="location.href='/board/modify?bno=<c:out value="${board.bno}"/>'"
                        		>modify</button>
                        		<button data-oper='list'
                        		 class="btn btn-info"
                        		 onclick="location.href='/board/list'"
                        		 >list</button> --%>
                        	
                        		
                        		<button data-oper='modify' class="btn btn-default">modify@</button>
                        		<button data-oper='list' class="btn btn-info">list</button>
                        		
                        		<form id='operForm' action="/board/modify" method="get">
                        			<input type="hidden" id='bno' name='bno' value='<c:out value="${board.bno}"/>'>
                        			<input type='hidden' name='pageNum' value='<c:out value="${cri.pageNum }"/>'>
                        			<input type='hidden' name='amount' value='<c:out value="${cri.amount}"/>'>
                        		</form>
                        		
                        	
                        	
                        </div>
                        </div>
                        </div>
                        </div>
                        
                        
                        
<script type="text/javascript">
	$(document).ready(function() {


	  var formObj = $("form");

	  $('button').on("click", function(e){
	    
	    e.preventDefault(); 
	    
	    var operation = $(this).data("oper");
	    
	    console.log(operation);
	    
	    if(operation === 'remove'){
	      formObj.attr("action", "/board/remove");
	      
	    }else if(operation === 'list'){
	      //move to list
	      formObj.attr("action", "/board/list").attr("method","get");
	      
	      var pageNumTag = $("input[name='pageNum']").clone();
	      var amountTag = $("input[name='amount']").clone();
	      var keywordTag = $("input[name='keyword']").clone();
	      var typeTag = $("input[name='type']").clone();      
	      
	      formObj.empty();
	      
	      formObj.append(pageNumTag);
	      formObj.append(amountTag);
	      formObj.append(keywordTag);
	      formObj.append(typeTag);	       
	    }
	    
	    formObj.submit();
	  });

});
</script>
  
                        
                        
                        
                        <%@include file ="../includes/footer.jsp" %>
                        
                        
                       <!--  <script type="text/javascript">
                        	#(document).ready(function(){
                        		var operForm = $("#operForm");
                        		$("button[data-oper='modify']").on("click",function(e){
                        			operForm.attr("action","/board/modify").submit();
                        			
                        		});
                        		
                        		$("button[data-oper='list']").on("click",function(e){
                        			operForm.find("#bno").remove();
                        			operForm.attr("action","/board/list")
                        			operForm.submit();
                        		});
                        	});
                        </script> -->