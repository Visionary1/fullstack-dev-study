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


<%
	/* TA */
	Map<String, Object> target = null;

	// 목록에서 클릭한 경우 (id)
	if (request.getParameter("id") != null) {
		int id = Integer.valueOf(request.getParameter("id"));
		
		for (Map<String, Object> music : musicList) {
			if (id == (int)music.get("id")) {
				target = music;
				break;
			}
		}
	}
	
	// 상단에서 검색한 경우 (search)
	if (request.getParameter("search") != null) {
		String search = request.getParameter("search");
		for (Map<String, Object> music : musicList) {
			if (search.equals(music.get("title"))) {
				target = music;
				break;
			
			// 노래 없을 때
			} else {
				%>
				<span class="d-flex justify-content-center align-items-center fs-4">검색한 노래는 없어요</span>
				<%
			}
		}
	}
	
	/* my way */
	/* String id = request.getParameter("id");
	
	boolean contains = musicList.stream().anyMatch((obj) -> id.equals(obj.get("id")));
	
	if (contains) {
		for (Map<String, Object> item : musicList) { */
%>

<span class="fs-4">곡 정보</span>
<!-- 앨범 커버 -->
<div class="border border-success d-flex mt-3">
	<div class="col-2 m-3">
		<img src="<%=target.get("thumbnail")%>" alt="song" class="img-fluid rounded">
	</div>

	<!-- 곡 정보 -->
	<div class="col-2 m-3">
		<!-- 노래 제목 -->
		<div class="fs-1"><%=target.get("title")%></div>
		<!-- 가수 이름 -->
		<div class="fs-5 text-success"><%=target.get("singer")%></div>

		<!-- TA -->
		<div class="d-flex fw-light">
			<div>
				앨범<br>
				재생시간<br>
				작곡가<br>
				작사가<br>
			</div>
			
			<div class="ms-3">
				<%=target.get("album")%><br>
				<%= (int) target.get("time") / 60 %> : <%=(int) target.get("time") % 60 %><br>
				<%=target.get("composer")%><br>
				<%=target.get("lyricist")%><br>
			</div>
		</div>

		<!-- 내가 했던 방식 -->
		<!-- 앨범 커버 -->
<%-- 		<div class="d-flex justify-content-between fw-light">
			<div>앨범</div>
			<div><%=target.get("album")%></div>
		</div>

		<!-- 재생 시간 -->
		<div class="d-flex justify-content-between fw-light">
			<div>재생시간</div>
			<%
			/* 분, 초 */
			int minute = (int) target.get("time") / 60;
			int sec = (int) target.get("time") % 60;
			%>
			<div><%=minute%> : <%=sec%></div>
		</div>

		<!-- 작곡가 -->
		<div class="d-flex justify-content-between fw-light">
			<div>작곡가</div>
			<div><%=target.get("composer")%></div>
		</div>

		<!-- 작사가 -->
		<div class="d-flex justify-content-between fw-light">
			<div>작사가</div>
			<div><%=target.get("lyricist")%></div>
		</div> --%>
	</div>
</div>

<!-- 가사 정보 -->
<div class="mt-3">
	<span class="fs-4">가사</span>
	<hr>
	<span>가사 정보 없음</span>
</div>
