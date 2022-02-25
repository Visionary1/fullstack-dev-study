<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>quiz03</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>

<div class="container">
    <h2>체격 조건 입력</h2>

    <form method="get" action="/lesson02/quiz03_1.jsp">
        <div class="d-flex">
            <div class="form-floating">
                <input type="text" class="form-control" id="height" placeholder="height" name="height">
                <label for="height">키를 입력하세요</label>
            </div>
            <div class="form-floating">
                <input type="text" class="form-control" id="weight" placeholder="weight" name="weight">
                <label for="weight">몸무게를 입력하세요</label>
            </div>
            
            <button type="submit" class="btn btn-primary ms-3">계산</button>
        </div>
    </form>
</div>

</body>
</html>