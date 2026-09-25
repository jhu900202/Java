---
id: index.java
type: index
title: 패키지 색인 (36개, 날짜순)
summary: src/ 패키지 36개를 날짜순으로 주 단원·부 단원·한 줄 요약·주의와 함께 나열한 색인.
stack: java
parent: ./ROOT.md
---

# 패키지 색인

- 패키지명으로 찾을 때 이 파일을 통째로 읽지 말고 `grep -n "study_190318" knowledge-map/INDEX.md`처럼 행만 읽으세요.
- "주"는 그 패키지의 대표 단원, "부"는 일부 파일이 걸치는 단원입니다. 단원 본문의 근거 표와 이 배정이 어긋나면 이 표를 진실로 삼고 단원을 고칩니다.
- 리포 정리로 경로가 바뀌면 이 표의 패키지 열과 각 단원의 `evidence`만 갱신합니다.
- 단원 번호: 01 [기초](./units/01-basics.md) · 02 [객체지향](./units/02-oop.md) · 03 [컬렉션·문자열](./units/03-collections-strings.md) · 04 [입출력·스레드·소켓](./units/04-io-network-threads.md) · 05 [JDBC·라이브러리](./units/05-jdbc-libs.md)

| 패키지 | 날짜 | 종류 | 주 | 부 | 한 줄 요약 | 주의 |
|---|---|---|---|---|---|---|
| study_181217 | 2018-12-17 | study | 01 | - | Hello World. 가장 이른 패키지 | - |
| study_181218 | 2018-12-18 | study | 01 | - | 기본 타입·변수·산술/비교 연산자·묵시적 형변환·while·Scanner | Var1.java 주석 깨짐(U+FFFD), 나머지 MS949 |
| study_181219 | 2018-12-19 | study | 02 | 01 | 클래스·생성자·필드·new, static 메서드 매개변수/반환, 배열, if-else (Apple/Car/Money/CalApp) | 데이터 클래스와 실행 클래스 분리 첫 시도 |
| study_181220 | 2018-12-20 | study | 01 | - | if/else-if/중첩 if·논리 연산자·for·이중 for(구구단·별 찍기 5종) | Test1~9 번호식 파일명 |
| study_181221 | 2018-12-21 | study | 01 | - | 배열 순회·버블 정렬 직접 구현 vs Arrays.sort·Random 로또·while(true)+break | Test5 빈 printstar(), Lotto 중복 검사 없음 |
| report_181226 | 2018-12-26 | report | 01 | - | Random 로또 6개 중복 없이 뽑아 버블 정렬 출력 과제 | MS949 |
| study_190215 | 2019-02-15 | study | 02 | - | 매개변수 생성자·this로 필드 초기화, Champ 객체 여러 개 (LoL 테마) | 두 달 공백 후 첫 패키지. Champ.java만 UTF-8 |
| study_190215Mk2 | 2019-02-15 | study | 02 | - | Gateway 팩토리 메서드·오버로딩(printUnit/attack)·객체 간 상호작용 (StarCraft) | 명명 규칙 주석. attack 호출 12회 반복 |
| study_190220 | 2019-02-20 | study | 02 | - | 질럿·드라군·다크템플러 클래스와 Gateway 생성. 생성자·필드·오버로딩 | MS949 |
| study_190220Mk2 | 2019-02-20 | study | 02 | - | Animal 인터페이스를 Bird/Cat/Dog/Fish/Snake가 구현. 인터페이스 타입 매개변수 다형성 | study_190305 Ex02App에 유사 예제 중복 |
| report_190220 | 2019-02-20 | report | 02 | - | 지역변수/static/instance 변수 차이와 return. 한우 상품 예제 | 한 파일 3클래스(Local/Global/Hanwoo) |
| study_190220Mk3 | 2019-02-20 | study | 02 | - | Lamun(라면) 인터페이스를 삼양·신·진 클래스가 구현. Mk2와 동일 패턴 | - |
| report_190221 | 2019-02-21 | report | 02 | - | StarCraft 인터페이스 → 종족 추상 클래스 → 유닛 구체 클래스 3단 계층. 인터페이스 타입 파라미터로 전투/출력 (12파일) | 주석 없음, ASCII |
| study_190227 | 2019-02-27 | study | 01 | - | 배열 복사·병합·값 전달·String ==/equals·가위바위보 | GBBGame/GBBGame2 두 버전, MS949 |
| report_190227 | 2019-02-27 | report | 01 | 02 | Scanner/Random 3라운드 야구 게임. static 상태 관리·생성자 (2인 팀 과제) | score.java vs class Score 대소문자 불일치 |
| study_190304 | 2019-03-04 | study | 05 | - | Oracle scott.emp JDBC SELECT/INSERT. PreparedStatement/ResultSet, finally 자원 해제 | ojdbc6.jar 2.1MB 포함. DB 접속 정보 하드코딩 |
| study_190305 | 2019-03-05 | study | 02 | - | Menu 인터페이스·버거/콜라/감자 세트 합성·접근지정자·생성자 오버로딩·getter·필드 은닉 | Manager/Ex02App 한 파일 다중 클래스 |
| study_190306 | 2019-03-06 | study | 02 | 03 | 카페 주문 흐름(Customer/Barista/Menu/MenuItem/Coffee) 협력·List·다단계 업캐스팅 | CafeApp 한 파일 5클래스 |
| study_190306_room1 | 2019-03-06 | study | 02 | - | private / default 접근 범위(같은 패키지) | room2와 한 쌍 |
| study_190306_room2 | 2019-03-06 | study | 02 | - | 다른 패키지에서 default 메서드 접근 불가 확인, toString | room1의 MySite 의존. 실패 라인 주석 처리 |
| study_190308 | 2019-03-08 | study | 02 | 03 | People 상속 오버라이딩, ArrayList\<Humen\> 다형 호출 | Humen/Enermy 오타(mk2에서 재사용). 파일명 Class404OR |
| report_190308 | 2019-03-08 | report | 03 | - | JSON 형태 문자열 split/replace/parseInt 파싱 | 주석 처리된 substring 대안 |
| study_190308_mk2 | 2019-03-08 | study | 02 | 03 | 인터페이스 타입 리스트 요소 다운캐스팅 + try-catch | study_190308 재작성 변형. 파일명 Class404DC |
| study_190308_mk3 | 2019-03-08 | study | 05 | - | Coolsms(nurigo) SDK + json-simple로 SMS 발송 | API 키·시크릿·전화번호 하드코딩. SMSlib 의존 |
| study_190308_mk4 | 2019-03-08 | study | 02 | 03 | Object.toString 오버라이딩·StringBuilder·parseInt·hashCode | - |
| study_190311 | 2019-03-11 | study | 04 | - | 표준 입력/파일 입출력 스트림(바이트·문자·버퍼)·FileWriter/PrintWriter·URLConnection 웹 저장 (7 java) | naver.html 169KB·test*.txt 포함. D:/workspace 절대 경로 |
| study_190312 | 2019-03-12 | study | 03 | - | 네이버 뉴스 URL 파라미터 split/StringTokenizer/parseInt 파싱 협업 과제 | JUnit import 후 main 직접 호출. UTF-8/MS949 혼재 |
| study_190312_mk2 | 2019-03-12 | study | 03 | - | 제네릭 클래스·ArrayList/Vector/HashMap CRUD·synchronized | GenerixEx 오타. GenerixEx04 main 비어 있음 |
| study_190313 | 2019-03-13 | study | 05 | 04 | 뉴스 100건 URLConnection+Jsoup 파싱 → Oracle NEWS 저장 미니 크롤러(DAO/VO 원형) | 한 파일 5클래스. DB 접속 정보 하드코딩. UTF-8 |
| study_190315 | 2019-03-15 | study | 04 | - | Runnable·start·join·sleep·interrupt 기초 스레드 | ThreadNotify 빈 골격(wait/notify 미완성) |
| study_190318 | 2019-03-18 | study | 04 | - | 소켓 채팅 1단계: ServerSocket/Socket 단방향 전송 | MS949 |
| study_190318_mk2 | 2019-03-18 | study | 04 | - | 2단계: Runnable 내부 클래스 + 스레드로 양방향 1:1 채팅 | 사설 IP 하드코딩 |
| study_190318_mk3 | 2019-03-18 | study | 04 | - | 3단계: Thread 상속 내부 클래스 + Vector 브로드캐스트 다중 접속 서버 | 클라이언트 OutputStreamWriter UTF-8 지정 |
| study_190318_mk4 | 2019-03-18 | study | 04 | - | 4단계: ChatProtocol 인터페이스 상수(ALL/MSG), split로 전체/귓속말 분기 | 인터페이스 상수 = public static final 주석 |
| study_190328 | 2019-03-28 | study | 05 | - | Class.forName/DriverManager/Statement/ResultSet. book·customer 조회, Scanner LIKE 검색 | 소문자 클래스명(booklist, name). DB 접속 정보 하드코딩. 문자열 연결 LIKE |
| study_190425 | 2019-04-25 | study | 02 | - | Shape/Circle draw() 오버라이딩. super.draw() vs this.draw() | 2파일, ASCII. 마지막 패키지 |

소스 외: `SMSlib/`(javaSDK-2.2.jar, json-simple-1.1.1.jar, jsoup-1.11.3.jar) → 단원 05. git 이력에만 있는 `src/private_190313/`(이미지·개인 게임, 삭제됨)은 색인하지 않습니다.
