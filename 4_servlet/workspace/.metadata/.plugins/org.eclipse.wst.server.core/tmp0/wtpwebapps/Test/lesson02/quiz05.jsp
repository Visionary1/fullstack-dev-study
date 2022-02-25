<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

    <div class="container">
		<h1>길이 변환</h1>
        
        <form method="get" action="/lesson02/quiz05_01.jsp">
            <div class="form-group d-flex">
                <input type="text" class="form-control" name="length">
                <span class="mt-3">cm</span>
            </div>
            
            <div class="btn-group mt-2" role="group">
                <input type="radio" class="btn-check" name="btnradio" id="inch" autocomplete="off" checked>
                <label class="btn btn-outline-primary" for="inch">인치</label>
                
                <input type="radio" class="btn-check" name="btnradio" id="feet" autocomplete="off">
                <label class="btn btn-outline-primary" for="feet">피트</label>
                
                <input type="radio" class="btn-check" name="btnradio" id="meter" autocomplete="off">
                <label class="btn btn-outline-primary" for="meter">미터</label>
            </div>
            
            <br>
            <button type="submit" class="btn btn-primary">버튼</button>
        </form>
    </div>
</body>
</html>