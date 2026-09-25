---
id: unit.jdbc-libs
type: unit
title: JDBC (Oracle) · 크롤링 · 외부 라이브러리
summary: Oracle JDBC·PreparedStatement·DAO/VO 원형·jsoup 크롤러·Coolsms SMS·jar 의존
stack: java
parent: ../ROOT.md
status: draft
order: 5
triggers: [jdbc, oracle, sql, preparedstatement, resultset, 크롤링, jsoup, sms, coolsms, jar, 라이브러리, dao]
evidence:
  - src/study_190304
  - src/study_190313
  - src/study_190328
  - src/study_190308_mk3
  - SMSlib
related:
  - ./04-io-network-threads.md
  - ./03-collections-strings.md
---

# JDBC (Oracle) · 크롤링 · 외부 라이브러리

## 학습 목표
JDBC로 Oracle XE에 접속해 조회·삽입하고 자원을 닫는 순서를 익히며, 외부 jar(jsoup, Coolsms, json-simple)를 프로젝트에 붙여 쓰는 법을 경험합니다. 민감값이 가장 많은 단원이라 "위치만 기록" 규칙의 적용 예시이기도 합니다.

## 핵심 개념
- Connection/PreparedStatement/ResultSet, finally에서 역순 close — study_190304 (JdbcSelect/JdbcInsert/JdbcTest, 샘플 스키마 emp 테이블)
- Class.forName·DriverManager·Statement, Scanner 입력으로 LIKE 검색(문자열 연결) — study_190328 (booklist/booklistScanner/name, 진입점 DBTest)
- 뉴스 100건 URLConnection + jsoup 파싱 → NEWS 테이블 저장. 한 파일에 NewsApp/Utils/News/Crawling/DBConnection(DAO/VO 원형) — study_190313
- Coolsms SDK + json-simple로 SMS 발송, HashMap 파라미터, 예외 처리 — study_190308_mk3 (ExampleSend)
- 의존 jar 위치: `SMSlib/javaSDK-2.2.jar`, `SMSlib/json-simple-1.1.1.jar`, `SMSlib/jsoup-1.11.3.jar`, `src/study_190304/ojdbc6.jar`.

## 근거 패키지
| 패키지 | 날짜 | 종류 | 무엇을 연습 | 주의 |
|---|---|---|---|---|
| [study_190304](../../src/study_190304) | 2019-03-04 | study | JDBC SELECT/INSERT, 자원 해제 | ojdbc6.jar 포함. DB 접속 정보 하드코딩 |
| [study_190308_mk3](../../src/study_190308_mk3) | 2019-03-08 | study | Coolsms SMS 발송 | API 키·시크릿·전화번호 하드코딩 |
| [study_190313](../../src/study_190313) | 2019-03-13 | study | jsoup 크롤러 → Oracle 저장 | 한 파일 5클래스. DB 접속 정보 하드코딩. 부 단원 04 |
| [study_190328](../../src/study_190328) | 2019-03-28 | study | Statement·LIKE 검색 | 소문자 클래스명. DB 접속 정보 하드코딩 |
| [SMSlib](../../SMSlib) | - | lib | jar 3개 | 읽지 않음 |

## 주의점 (값은 적지 않습니다)
- DB 접속 정보(URL·계정)가 하드코딩된 파일: study_190304(JdbcTest/JdbcSelect/JdbcInsert), study_190313(NewsApp 안의 DBConnection), study_190328(booklist/booklistScanner/name의 각 생성자. DBTest는 진입점일 뿐 접속 정보 없음). SMS API 키·시크릿·전화번호: study_190308_mk3/ExampleSend. 값은 이 문서·답변 어디에도 옮기지 않으며, 처리 방침은 [정리 논의](../discussion/repo-reorg.md) 안건 2입니다.
- study_190328은 Statement + 문자열 연결 LIKE라 SQL 인젝션 교육 포인트이며, 클래스명이 소문자(booklist, booklistScanner, name)입니다.
- study_190313은 UTF-8, ExampleSend.java·DBTest.java는 ASCII, 나머지(study_190304 3파일, study_190328의 booklist/booklistScanner/name)는 MS949입니다.
- jar를 읽거나 실행하지 않습니다.

## 현업 연결
Statement vs PreparedStatement는 JdbcTemplate/JPA가 바인딩 파라미터를 강제하는 이유이고, study_190313의 DAO/VO는 Spring Data Repository/Entity의 원형입니다. jsoup 크롤러는 RestTemplate/WebClient + 파서 구조와 비교됩니다.

## 이어서 볼 단원
- [입출력·스레드·소켓](./04-io-network-threads.md) — study_190313의 입력부(URLConnection)는 그 단원의 study_190311과 같은 기법입니다.
- [컬렉션·제네릭·문자열](./03-collections-strings.md) — study_190312의 URL 파라미터 파싱이 이 크롤러의 전 단계입니다.

## 메모 · 아직 없는 노드(TODO)
- 2026-09-25: evidence 후보 1순위 — study_190313(한 파일 5클래스, 의존 2종). Spring 리포가 생기면 related에 데이터 접근 단원 URL을 추가합니다.
