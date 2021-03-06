<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="java.util.ArrayList, java.util.HashMap, java.util.List, java.util.Map"%>

<!--아티스트 정보 & 아이유 노래 리스트 -->
<%
//아티스트 정보 
Map<String, Object> artistInfo = new HashMap<>();
artistInfo.put("name", "아이유");
artistInfo.put("debute", 2008);
artistInfo.put("agency", "EDAM엔터테인먼트");
artistInfo.put("photo", "http://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/081/867/444/81867444_1616662460652_1_600x600.JPG");

//아이유 노래 리스트 
List<Map<String, Object>> musicList = new ArrayList<>();

Map<String, Object> musicInfo = new HashMap<>();
musicInfo.put("id", 1);
musicInfo.put("title", "팔레트");
musicInfo.put("album", "Palette");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail", "https://upload.wikimedia.org/wikipedia/ko/b/b6/IU_Palette_final.jpg");
musicInfo.put("time", 217);
musicInfo.put("composer", "아이유");
musicInfo.put("lyricist", "아이유");
musicList.add(musicInfo);

musicInfo = new HashMap<>();
musicInfo.put("id", 2);
musicInfo.put("title", "좋은날");
musicInfo.put("album", "Real");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail", "https://upload.wikimedia.org/wikipedia/ko/3/3c/IU_-_Real.jpg");
musicInfo.put("time", 233);
musicInfo.put("composer", "이민수");
musicInfo.put("lyricist", "김이나");
musicList.add(musicInfo);

musicInfo = new HashMap<>();
musicInfo.put("id", 3);
musicInfo.put("title", "밤편지");
musicInfo.put("album", "palette");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail", "https://upload.wikimedia.org/wikipedia/ko/b/b6/IU_Palette_final.jpg");
musicInfo.put("time", 253);
musicInfo.put("composer", "제휘,김희원");
musicInfo.put("lyricist", "아이유");
musicList.add(musicInfo);

musicInfo = new HashMap<>();
musicInfo.put("id", 4);
musicInfo.put("title", "삐삐");
musicInfo.put("album", "삐삐");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail",
		"https://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/081/111/535/81111535_1539157728291_1_600x600.JPG");
musicInfo.put("time", 194);
musicInfo.put("composer", "이종훈");
musicInfo.put("lyricist", "아이유");
musicList.add(musicInfo);

musicInfo = new HashMap<>();
musicInfo.put("id", 5);
musicInfo.put("title", "스물셋");
musicInfo.put("album", "CHAT-SHIRE");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail",
		"https://image.genie.co.kr/Y/IMAGE/IMG_ALBUM/080/724/877/80724877_1445520704274_1_600x600.JPG");
musicInfo.put("time", 194);
musicInfo.put("composer", "아이유,이종훈,이채규");
musicInfo.put("lyricist", "아이유");
musicList.add(musicInfo);

musicInfo = new HashMap<>();
musicInfo.put("id", 6);
musicInfo.put("title", "Blueming");
musicInfo.put("album", "Love poem");
musicInfo.put("singer", "아이유");
musicInfo.put("thumbnail",
		"https://upload.wikimedia.org/wikipedia/ko/6/65/%EC%95%84%EC%9D%B4%EC%9C%A0_-_Love_poem.jpg");
musicInfo.put("time", 217);
musicInfo.put("composer", "아이유,이종훈,이채규");
musicInfo.put("lyricist", "아이유");
musicList.add(musicInfo);
%>

<!-- content -->
<!-- artist info -->
<div class="border border-success d-flex mt-3 artist-info">
	<!-- 사진 -->
	<div class="col-2 m-3 artist-photo">
		<img src="<%=artistInfo.get("photo")%>" alt="artist" class="img-fluid rounded">
	</div>

	<!-- 정보 -->
	<div class="m-3 artist-info">
		<span class="fs-3"><%=artistInfo.get("name")%></span><br> 
		<span><%=artistInfo.get("agency")%></span><br> 
		<span><%=artistInfo.get("debute")%> 데뷔</span>
	</div>
</div>

<!-- album list -->
<div class="mt-3">
	<span class="fs-5">곡 목록</span>
	<table class="table table-borderless table-hover">
		<thead>
			<tr>
				<th>no</th>
				<th>제목</th>
				<th>앨범</th>
			</tr>
		</thead>
		<tbody>
			<%
			for (Map<String, Object> item : musicList) {
				if (item.get("singer").equals(artistInfo.get("name"))) {
			%>
			<tr>
				<td><%=item.get("id")%></td>
				<!-- 이름이 중복되는 경우가 있을수도있으니, 정확하게 id값 쓰는게 좋음! -->
				<td><a href="./info_template.jsp?id=<%=item.get("id")%>" class=""><%=item.get("title")%></a></td>
				<td><%=item.get("album")%></td>
			</tr>
			<%
			}
			}
			%>
		</tbody>
	</table>
</div>

<%-- <!-- 곡 정보 화면 -->
<%
} else if (!song.isEmpty()) {

	/* 곡 존재 유무 확인 */
	boolean contains = musicList.stream().anyMatch((obj) -> song.equals(obj.get("title")));
	
	/* 곡 없으면 */
	if (!contains) {
	%>
	<span class="d-flex justify-content-center align-items-center fs-4">검색한 노래는 없어요</span>
	<%
	
	/* 곡 있으면 */
	} else {
		for (Map<String, Object> item : musicList) {
			/*  곡이랑 일치하는 부분 찾기 */
			if (song.equals(item.get("title"))) {
%>

<span class="fs-4">곡 정보</span>
<!-- 앨범 커버 -->
<div class="border border-success d-flex mt-3">
	<div class="col-2 m-3">
		<img src="<%=item.get("thumbnail")%>" alt="song" class="img-fluid rounded">
	</div>

	<!-- 곡 정보 -->
	<div class="col-2 m-3">
		<!-- 노래 제목 -->
		<div class="fs-1"><%=item.get("title")%></div>
		<!-- 가수 이름 -->
		<div class="fs-5 text-success"><%=item.get("singer")%></div>

		<!-- TA -->
		<div class="d-flex">
			<div class="ml-2">
				앨범<br>
				재생시간<br>
				작곡가<br>
				작사가<br>
			</div>
			
			<div class="fw-light">
				<%=item.get("album")%><br>
				<%
				/* 분, 초 */
				int minute = (int) item.get("time") / 60;
				int sec = (int) item.get("time") % 60;
				%>
				<%=minute%> : <%=sec%><br>
				<%=item.get("composer")%><br>
				<%=item.get("lyricist")%><br>
			</div>
		</div>

		
		<!-- 내가 했던 방식 -->
		<!-- 앨범 커버 -->
		<div class="d-flex justify-content-between fw-light">
			<div>앨범</div>
			<div><%=item.get("album")%></div>
		</div>

		<!-- 재생 시간 -->
		<div class="d-flex justify-content-between fw-light">
			<div>재생시간</div>
			<%
			/* 분, 초 */
			int minute = (int) item.get("time") / 60;
			int sec = (int) item.get("time") % 60;
			%>
			<div><%=minute%> : <%=sec%></div>
		</div>

		<!-- 작곡가 -->
		<div class="d-flex justify-content-between fw-light">
			<div>작곡가</div>
			<div><%=item.get("composer")%></div>
		</div>

		<!-- 작사가 -->
		<div class="d-flex justify-content-between fw-light">
			<div>작사가</div>
			<div><%=item.get("lyricist")%></div>
		</div>
	</div>
</div>

<!-- 가사 정보 -->
<div class="mt-3">
	<span class="fs-4">가사</span>
	<hr>
	<span>가사 정보 없음</span>
</div>

<%
}
}
}
}
%> --%>

