---
id: unit.basics
type: unit
title: 자바 기초 (변수 · 연산자 · 제어문 · 배열)
summary: 변수·연산자·제어문·배열·정렬·Scanner/Random. 로또·야구·가위바위보 게임으로 반복 연습
stack: java
parent: ../ROOT.md
status: draft
order: 1
triggers: [기초, 변수, 연산자, 형변환, 배열, 정렬, for, while, scanner, random, 로또, 게임]
evidence:
  - src/01-basics/study_181217
  - src/01-basics/study_181218
  - src/02-oop/study_181219
  - src/01-basics/study_181220
  - src/01-basics/study_181221
  - src/01-basics/study_190227
  - src/01-basics/report_181226
  - src/01-basics/report_190227
related:
  - ./02-oop.md
---

# 자바 기초

## 학습 목표
자바 프로그램의 뼈대(main, println)와 기본 타입·연산자·제어문·1차원 배열을 손에 익히고, 작은 게임(로또·야구·가위바위보)으로 조합해 봅니다. 2018-12 첫 4일 수업과 2019-02-27의 배열 복습, 과제 2개가 근거입니다.

## 핵심 개념
- 기본 타입과 묵시적 형변환, 산술/비교/논리 연산자, while·Scanner 입력 — study_181218
- if / else if / 중첩 if, for·이중 for(구구단, 별 피라미드·다이아몬드 5종) — study_181220 (Test8이 별 찍기)
- 배열 선언·순회·length, 버블 정렬 직접 구현 vs `Arrays.sort` — study_181221
- `Random`으로 1~45 로또 6개: 중복 검사 없는 버전과 있는 버전 — study_181221/Lotto, report_181226
- 배열 복사·병합, 값 전달(pass by value), `String`의 `==` vs `equals` — study_190227
- `Scanner` 입력 + `while(true)`/break 루프로 게임 만들기 — study_190227(GBBGame/GBBGame2), report_190227(야구 3라운드)

## 근거 패키지
| 패키지 | 날짜 | 종류 | 무엇을 연습 | 주의 |
|---|---|---|---|---|
| [study_181217](../../src/01-basics/study_181217) | 2018-12-17 | study | Hello World | - |
| [study_181218](../../src/01-basics/study_181218) | 2018-12-18 | study | 타입·변수·연산자·형변환·while·Scanner | Var1.java 주석 깨짐 |
| [study_181219](../../src/02-oop/study_181219) | 2018-12-19 | study | (부) 배열·if-else·Scanner. 클래스 부분은 단원 02 | 주 단원 02 |
| [study_181220](../../src/01-basics/study_181220) | 2018-12-20 | study | 조건문·반복문·별 찍기 | Test1~9 번호식 파일명 |
| [study_181221](../../src/01-basics/study_181221) | 2018-12-21 | study | 배열·버블 정렬·Arrays.sort·로또 | Test5 빈 printstar() |
| [report_181226](../../src/01-basics/report_181226) | 2018-12-26 | report | 로또 중복 없이 뽑아 정렬 | - |
| [study_190227](../../src/01-basics/study_190227) | 2019-02-27 | study | 배열 복사·값 전달·equals·가위바위보 | 두 버전(GBBGame/GBBGame2) |
| [report_190227](../../src/01-basics/report_190227) | 2019-02-27 | report | 야구 게임(static 상태·생성자) | 부 단원 02. 2인 팀 과제 |

## 주의점
- `study_181218/Var1.java`는 UTF-8이지만 한글 주석·문자열이 '占쏙옙' 형태로 깨진 채 커밋되어 있습니다(복구 불가). 나머지는 대부분 MS949입니다.
- `study_181221/Test5.java`에 빈 `printstar()`가 남아 있습니다.
- `report_190227/score.java`는 파일명과 클래스명(Score)이 대소문자로 다릅니다(비-public 클래스라 컴파일은 됩니다).
- `study_181219`의 클래스·생성자 부분은 단원 02가 주 단원입니다.

## 현업 연결
`==` vs `equals`와 값 전달은 Spring에서 DTO 동등성·불변 객체 설계로 이어지고, 배열·정렬은 JS의 `map`/`sort` 같은 배열 메서드와 1:1로 비교됩니다.

## 이어서 볼 단원
- [객체지향](./02-oop.md) — study_181219에서 시작된 클래스·생성자를 본격적으로 다룹니다.

## 메모 · 아직 없는 노드(TODO)
- 2026-09-25: topic 후보 — "별 찍기 패턴 5종 비교"(study_181220/Test8). 소유자 승인 전에는 만들지 않습니다.
