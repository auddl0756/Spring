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
                        	<form role="form" action="/board/modify" method="post">
                        		<input type='hidden' name='pageNum' value='<c:out value="${cri.pageNum}"/>'>
                        		<input type='hidden' name='pageNum' value='<c:out value="${cri.amount }"/>'>
                        	
                        		<div class="form-group">
                        			<label>bno</label>
                        			<input class="form-control" name='bno'
                        			value='<c:out value="${board.bno}"/>' readonly="readonly">
                        		</div>
                        		
                        		<div class="form-group">
                        			<label>title</label>
                        			<input class="form-control" name='title'
                        			value='<c:out value="${board.title}"/>'>
                        		</div>
                        		
                        		<div class="form-group">
                        			<label>text area</label>
                        			<input class="form-control" name='content'
                        			value='<c:out value="${board.content}"/>'>
                        		</div>
                        		
                        		<div class="form-group">
                        			<label>writer</label>
                        			<input class="form-control" name='writer'
                        			value='<c:out value="${board.writer}"/>' readonly="readonly">
                        		</div>
                        		
                        		<button type="submit" data-oper='modify' class="btn btn-default">modify</button>
                        		<button type="submit" data-oper='remove' class="btn btn-default">remove</button>
                        		<button type="submit" data-oper='list' class="btn btn-default">list</button>
                        		
                        	</form>
                        </div>
                        </div>
                        </div>
                        </div>
                        
                        <%@include file ="../includes/footer.jsp" %>
                        
                    
                    <script type="text/javascript">
                    	$(document).ready(function(){
                    		var formObj =$("form");
                    		$('button').on("click",function(e){
                    			e.preventDefault();
                    			var operation = $(this).data("oper");
                    			
                    			console.log(operation);
                    			
                    			if(operation=='remove'){
                    				formObj.attr("action","/board/remove");
                    				
                    			}else if(operation=='list'){
                    				/* self.location="/board/list";
                    				return ; */
                    				formObj.attr("action","/board/list").attr("method","get");
                    				var pageNumTag = $("input[name='pageNum']").clone();
                    				var amountTag = $("input[name='amount']").clone();
                    				
                    				formObj.empty();
                    				formObj.append(pageNumTag);
                    				formObj.append(amountTag);
                    			}
                    			formObj.submit();
                    		});
                    	});
                    </script>    