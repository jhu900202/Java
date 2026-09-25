---
id: root.java
type: root
title: 자바 학습 로드맵 (학원 과정 2018-12 ~ 2019-04)
summary: 학원 수료 과정의 자바 실습·과제 36개 패키지를 커리큘럼 단원 5개로 재묶은 지식맵의 진입점.
stack: java
convention: 1
---

# 자바 학습 로드맵

## 이 저장소는 무엇인가
- 2018-12 ~ 2019-04 학원 수료 과정의 수업 실습(`study_YYMMDD[변형]`)과 과제(`report_YYMMDD`)입니다. 현업 시작 전 기록이며, 패키지는 `src/<NN-단원>/` 아래에 단원별로 모여 있습니다. 최종적으로는 Markdown만 남길 예정입니다.
- 소유자는 현재 Java/Spring + JS/React 개발자입니다. 이 지식맵은 과거 코드를 빨리 찾고, 기초를 복습하고, 리포 정리를 논의하기 위한 것입니다.

## 사용법 요약
- 아래 표의 `triggers`·`summary`로 단원 1개(경계가 겹치면 2개)를 고르고 그 파일만 엽니다.
- 패키지명으로 물으면 [INDEX](./INDEX.md)에서 `grep -n "<패키지명>"`으로 행만 읽습니다.
- 규약은 [GUIDE](./GUIDE.md) — 노드를 만들 때만 읽습니다.

## 학습 로드맵

| order | 단원 | summary | triggers | 근거 |
|---|---|---|---|---|
| 1 | [자바 기초](./units/01-basics.md) | 변수·연산자·제어문·배열·정렬·Scanner/Random. 로또·야구·가위바위보 게임으로 반복 연습 | 기초, 변수, 연산자, 형변환, 배열, 정렬, for, while, scanner, random, 로또, 게임 | 7(+1) |
| 2 | [객체지향](./units/02-oop.md) | 클래스·생성자·static·상속·인터페이스·다형성·접근지정자·캐스팅. StarCraft/LoL/동물/라면/카페 테마 | class, 클래스, 생성자, this, static, 상속, inheritance, interface, 다형성, override, 캐스팅, 접근지정자 | 16(+1) |
| 3 | [컬렉션·제네릭·문자열](./units/03-collections-strings.md) | ArrayList/Vector/HashMap·제네릭·split/StringTokenizer/parseInt·StringBuilder | 컬렉션, arraylist, hashmap, vector, 제네릭, generic, 문자열, split, tokenizer, parseint, stringbuilder, json | 3(+4) |
| 4 | [입출력·스레드·소켓](./units/04-io-network-threads.md) | 바이트/문자/버퍼 스트림·파일·URLConnection·Thread/Runnable·소켓 채팅 mk1~mk4 | io, 스트림, stream, 파일, bufferedreader, urlconnection, thread, 스레드, runnable, socket, 소켓, 채팅 | 6(+1) |
| 5 | [JDBC·크롤링·외부 라이브러리](./units/05-jdbc-libs.md) | Oracle JDBC·PreparedStatement·DAO/VO 원형·jsoup 크롤러·Coolsms SMS·jar 의존 | jdbc, oracle, sql, preparedstatement, resultset, 크롤링, jsoup, sms, coolsms, jar, 라이브러리, dao | 4 + SMSlib |

"근거"는 주 단원으로 배정된 패키지 수(+부 단원으로 걸치는 수)입니다. Spring 이후 내용은 이 리포에 근거가 없으므로 단원을 두지 않습니다. Spring 리포에 같은 규약으로 지식맵을 만들 때 `related`로 잇습니다.

## 학습 흐름 한눈에
기초 문법(12/17~12/21) + 로또 과제(12/26) → 두 달 공백 → 클래스·생성자·인터페이스(2/15~2/27, StarCraft·LoL·동물·라면 테마) → JDBC 첫 접촉(3/4) → 접근지정자·합성·오버라이딩·다운캐스팅(3/5~3/8) → 문자열·컬렉션·SMS API(3/8~3/12) → 스트림 I/O(3/11) → 크롤러+DB(3/13) → 스레드(3/15) → 소켓 채팅 mk1~mk4(3/18) → JDBC 재방문(3/28) → super/this 상속 복습(4/25).

## 저장소 주의사항
- 인코딩 혼재: MS949 85 / ASCII 40 / UTF-8 9 / 기타 1. `study_181218/Var1.java`는 이미 깨진 채 커밋됨.
- 민감값(DB 접속 정보, SMS API 키·전화번호, 사설 IP)은 소스에서 `<REDACTED_...>`로 치환함. 옛 값은 git 이력에만 남아 있으며 어디에도 옮기지 않습니다.
- 바이너리·덤프: `libs/*.jar`(4개), `src/04-io-network-threads/study_190311/naver.html`(169KB)·`test*.txt`.
- 빌드·실행하지 않는 아카이브입니다(빌드 설정 없음). 컴파일·실행을 시도하지 않음.
- 미완성·오타 파일: ThreadNotify(빈 골격), GenerixEx04(main 비어 있음), Humen/Enermy, score.java 대소문자. 자세한 것은 각 단원의 "주의점".

## 열린 논의
- [리포 정리 논의](./discussion/repo-reorg.md) — 상태: 진행 중(용도 결정: 지식 아카이브). 다음 액션: "소유자에게 묻는 질문" 3번부터.

## 갱신 기록 (최근 10건)
- 2026-09-25: 소스를 단원별 디렉토리로 이관, jar를 `libs/`로 이동, 민감값 치환.
- 2026-09-25: 지식맵 생성(루트 + 단원 5 + INDEX + discussion 1). 모든 단원 status draft.
