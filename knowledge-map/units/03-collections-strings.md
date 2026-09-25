---
id: unit.collections-strings
type: unit
title: 컬렉션 · 제네릭 · 문자열 처리
summary: ArrayList/Vector/HashMap·제네릭·split/StringTokenizer/parseInt·StringBuilder
stack: java
parent: ../ROOT.md
status: draft
order: 3
triggers: [컬렉션, arraylist, hashmap, vector, 제네릭, generic, 문자열, split, tokenizer, parseint, stringbuilder, json]
evidence:
  - src/03-collections-strings/study_190312
  - src/03-collections-strings/study_190312_mk2
  - src/03-collections-strings/report_190308
  - src/02-oop/study_190306
  - src/02-oop/study_190308
  - src/02-oop/study_190308_mk2
  - src/02-oop/study_190308_mk4
related:
  - ./02-oop.md
  - ./05-jdbc-libs.md
---

# 컬렉션 · 제네릭 · 문자열 처리

## 학습 목표
배열 대신 컬렉션(ArrayList/Vector/HashMap)과 제네릭으로 객체를 담고, 문자열을 split/StringTokenizer/parseInt로 분해해 숫자와 파라미터를 뽑아냅니다. 근거가 얇은 단원이라 "근거 공백"을 함께 적어 둡니다.

## 핵심 개념
- 제네릭 클래스 정의, ArrayList/Vector/HashMap CRUD, `synchronized` 개념 — study_190312_mk2
- ArrayList\<인터페이스\>에 구현체를 담아 다형 호출, 다운캐스팅 — study_190308, study_190308_mk2 (주 단원 02)
- List로 주문 목록 관리 — study_190306 (CafeApp, 주 단원 02)
- JSON 형태 문자열을 split/replace → parseInt로 파싱 — report_190308
- URL 쿼리 파라미터(sid1/oid/aid) split/StringTokenizer/검증/예외 처리, `String.format` — study_190312 (협업 과제)
- `StringBuilder`, 문자열↔숫자 형변환 — study_190308_mk4 (주 단원 02)

## 근거 공백 (이 리포에 없는 것)
Set, Iterator, Comparator/Comparable, Stream API, try-with-resources는 근거가 없습니다. 복습 시 이 리포 밖 자료가 필요합니다.

## 근거 패키지
| 패키지 | 날짜 | 종류 | 무엇을 연습 | 주의 |
|---|---|---|---|---|
| [report_190308](../../src/03-collections-strings/report_190308) | 2019-03-08 | report | JSON 형태 문자열 파싱 | 주석 처리된 substring 대안 |
| [study_190312](../../src/03-collections-strings/study_190312) | 2019-03-12 | study | URL 파라미터 파싱 협업 과제 | JUnit import 후 main 직접 호출 |
| [study_190312_mk2](../../src/03-collections-strings/study_190312_mk2) | 2019-03-12 | study | 제네릭·ArrayList/Vector/HashMap | GenerixEx04 main 비어 있음 |
| [study_190306](../../src/02-oop/study_190306) | 2019-03-06 | study | (부) List로 주문 목록 | 주 단원 02 |
| [study_190308](../../src/02-oop/study_190308) | 2019-03-08 | study | (부) ArrayList\<Humen\> 다형 호출 | 주 단원 02 |
| [study_190308_mk2](../../src/02-oop/study_190308_mk2) | 2019-03-08 | study | (부) 리스트 요소 다운캐스팅 | 주 단원 02 |
| [study_190308_mk4](../../src/02-oop/study_190308_mk4) | 2019-03-08 | study | (부) StringBuilder·parseInt | 주 단원 02 |

## 주의점
- 파일명 오타 혼재: GenericEx01~02 / GenerixEx03~05. GenerixEx04는 main이 비어 있는 미완성 예제입니다.
- study_190312/Collabo2는 `org.junit.Test`를 import하지만 main에서 직접 호출합니다(JUnit 실행 아님). Collabo/Collabo2는 UTF-8, CollaboKHJEdition은 MS949로 한 패키지 안에서 인코딩이 다릅니다.
- report_190308에 주석 처리된 substring 대안 구현이 남아 있습니다.

## 현업 연결
제네릭 `List<DTO>`는 Spring 컨트롤러/서비스의 기본 반환 형태이고, URL 파라미터 파싱은 `@RequestParam`이 대신하는 일입니다. JS의 `split`/`map`/배열 처리와 1:1로 비교해 보면 좋습니다.

## 이어서 볼 단원
- [객체지향](./02-oop.md) — ArrayList\<Humen\> 예제의 주 단원입니다.
- [JDBC·크롤링·외부 라이브러리](./05-jdbc-libs.md) — study_190312에서 파싱한 네이버 뉴스 URL이 study_190313 크롤러로 이어집니다.

## 메모 · 아직 없는 노드(TODO)
- 2026-09-25: 근거가 얇은 단원입니다. Spring 리포 지식맵이 생기면 related로 잇는 것을 우선 검토합니다.
