---
id: unit.io-network-threads
type: unit
title: 입출력 스트림 · 스레드 · 소켓 채팅
summary: 바이트/문자/버퍼 스트림·파일·URLConnection·Thread/Runnable·소켓 채팅 mk1~mk4
stack: java
parent: ../ROOT.md
status: draft
order: 4
triggers: [io, 스트림, stream, 파일, bufferedreader, urlconnection, thread, 스레드, runnable, socket, 소켓, 채팅]
evidence:
  - legacy/04-io-network-threads/study_190311
  - legacy/04-io-network-threads/study_190315
  - legacy/04-io-network-threads/study_190318
  - legacy/04-io-network-threads/study_190318_mk2
  - legacy/04-io-network-threads/study_190318_mk3
  - legacy/04-io-network-threads/study_190318_mk4
  - legacy/05-jdbc-libs/study_190313
related:
  - ./05-jdbc-libs.md
---

# 입출력 스트림 · 스레드 · 소켓 채팅

## 학습 목표
InputStream/Reader/Buffered 계층을 구분해 파일과 네트워크에서 읽고 쓰며, 스레드로 동시성을 도입해 소켓 채팅을 네 단계로 확장합니다.

## 핵심 개념
- 바이트(InputStream/FileInputStream) vs 문자(InputStreamReader) vs 버퍼(BufferedReader) 스트림, FileWriter/BufferedWriter/PrintWriter — study_190311 (StreamEx01~03, FileEx01~02, FileWriteEx01)
- URLConnection으로 웹 페이지를 파일로 저장 — study_190311/MyConnection, study_190313 (크롤러 입력부, 주 단원 05)
- Runnable 구현·start·join·sleep·interrupt·InterruptedException — study_190315 (ThreadStop 상단에 스레드 원리 한국어 주석)

## 시리즈: 소켓 채팅
| 단계 | 패키지 | 추가된 것 | 핵심 |
|---|---|---|---|
| 1 | study_190318 | ServerSocket/Socket 단방향(클라이언트 → 서버) | BufferedReader/PrintWriter |
| 2 | study_190318_mk2 | Runnable 내부 클래스 + 별도 스레드로 양방향 1:1 | 읽기/쓰기 분리 |
| 3 | study_190318_mk3 | 클라이언트마다 Thread 상속 내부 클래스, Vector에 모아 브로드캐스트 | 다중 접속 서버 |
| 4 | study_190318_mk4 | ChatProtocol 인터페이스 상수(ALL/MSG), split로 전체/귓속말 분기 | 프로토콜 라우팅 |

mk3에서 ArrayList가 아니라 Vector를 쓴 이유(동기화)와 인터페이스 상수가 암묵적으로 `public static final`인 규칙은 좋은 복습 질문입니다.

## 근거 패키지
| 패키지 | 날짜 | 종류 | 무엇을 연습 | 주의 |
|---|---|---|---|---|
| [study_190311](../../legacy/04-io-network-threads/study_190311) | 2019-03-11 | study | 스트림·파일·URLConnection (7 java) | naver.html·test*.txt 덤프. D:/ 절대 경로 |
| [study_190315](../../legacy/04-io-network-threads/study_190315) | 2019-03-15 | study | 기초 스레드 | ThreadNotify 빈 골격 |
| [study_190318](../../legacy/04-io-network-threads/study_190318) | 2019-03-18 | study | 소켓 채팅 1단계 | - |
| [study_190318_mk2](../../legacy/04-io-network-threads/study_190318_mk2) | 2019-03-18 | study | 2단계 양방향 | - |
| [study_190318_mk3](../../legacy/04-io-network-threads/study_190318_mk3) | 2019-03-18 | study | 3단계 브로드캐스트 | 클라이언트 UTF-8 지정 |
| [study_190318_mk4](../../legacy/04-io-network-threads/study_190318_mk4) | 2019-03-18 | study | 4단계 프로토콜 | - |
| [study_190313](../../legacy/05-jdbc-libs/study_190313) | 2019-03-13 | study | (부) URLConnection 입력부 | 주 단원 05 |

## 주의점
- study_190311 소스에 `D:/workspace/...` 절대 경로가 하드코딩되어 있어 그대로 실행되지 않습니다.
- `study_190315/ThreadNotify.java`는 main과 run이 모두 빈 골격입니다(wait/notify 미완성).
- try-with-resources는 근거가 없고 모두 try-finally 또는 미해제입니다.

## 현업 연결
BufferedReader/PrintWriter 계층은 서블릿 요청/응답 스트림의 바탕이고, mk3의 스레드-per-클라이언트는 톰캣 스레드 풀·WebSocket 브로드캐스트와 비교됩니다. Vector 대신 CopyOnWriteArrayList/ConcurrentHashMap을 쓰는 이유도 여기서 출발합니다.

## 이어서 볼 단원
- [JDBC·크롤링·외부 라이브러리](./05-jdbc-libs.md) — URLConnection으로 받은 HTML을 jsoup로 파싱해 DB에 넣는 study_190313이 다음 단계입니다.

## 메모 · 아직 없는 노드(TODO)
- 2026-09-25: topic 후보 1순위 — `topics/04-socket-chat-series.md`(위 표를 단계별 차이 관점으로 확장). evidence 후보 — study_190311(7 java).
