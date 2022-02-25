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
        <h3>사칙 연산 계산기</h3>

        <form method="get" action="/lesson02/quiz04_1.jsp">
            <div class="d-flex">
                <div class="form-floating">
                    <input type="text" class="form-control" id="x" placeholder="x" name="x">
                    <label for="x">x</label>
                </div>
				
				<div class="form-floating ms-3 col-2">
				  <select class="form-select" id="formula" name="formula">
				    <option value="plus" selected>+</option>
				    <option value="minus">-</option>
				    <option value="multiply">*</option>
				    <option value="divide">/</option>
				  </select>
				  <label for="formula">Params</label>
				</div>


                <div class="form-floating ms-3">
                    <input type="text" class="form-control" id="y" placeholder="y" name="y">
                    <label for="y">y</label>
                </div>
                
                <button type="submit" class="btn btn-primary ms-3">계산</button>
            </div>
        </form>

    </div>

</body>
</html>