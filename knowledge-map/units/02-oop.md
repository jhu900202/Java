---
id: unit.oop
type: unit
title: 객체지향 (class · static · inheritance · interface · polymorphism)
summary: 클래스·생성자·static·상속·인터페이스·다형성·접근지정자·캐스팅. StarCraft/LoL/동물/라면/카페 테마
stack: java
parent: ../ROOT.md
status: draft
order: 2
triggers: [class, 클래스, 생성자, this, static, 상속, inheritance, interface, 다형성, override, 캐스팅, 접근지정자]
evidence:
  - legacy/02-oop/study_181219
  - legacy/02-oop/study_190215
  - legacy/02-oop/study_190215Mk2
  - legacy/02-oop/study_190220
  - legacy/02-oop/study_190220Mk2
  - legacy/02-oop/study_190220Mk3
  - legacy/02-oop/study_190305
  - legacy/02-oop/study_190306
  - legacy/02-oop/study_190306_room1
  - legacy/02-oop/study_190306_room2
  - legacy/02-oop/study_190308
  - legacy/02-oop/study_190308_mk2
  - legacy/02-oop/study_190308_mk4
  - legacy/02-oop/study_190425
  - legacy/02-oop/report_190220
  - legacy/02-oop/report_190221
  - legacy/01-basics/report_190227
related:
  - ./01-basics.md
  - ./03-collections-strings.md
---

# 객체지향

## 학습 목표
클래스로 데이터와 동작을 묶고, 생성자·this·static을 구분하며, 상속·인터페이스·다형성으로 여러 객체를 같은 타입으로 다루는 감각을 익힙니다. 가장 많은 패키지(16개)가 걸리는 핵심 단원입니다.

## 핵심 개념 (학습 순서대로)
- 클래스·필드·생성자·new, 데이터 클래스와 실행 클래스 분리 — study_181219 (Apple/Fruit, Car/CarApp)
- 매개변수 생성자와 `this` — study_190215 (Champ, LoL 테마)
- 팩토리 메서드(Gateway)와 메서드 오버로딩 — study_190215Mk2, study_190220 (StarCraft 테마)
- 지역변수 / static 필드 / instance 필드의 소유 주체와 생명주기, `return`의 의미 — report_190220 (Local/Global/Hanwoo)
- 인터페이스 구현과 인터페이스 타입 매개변수 다형성 — study_190220Mk2 (Animal), study_190220Mk3 (Lamun)
- 인터페이스 → 추상 클래스 → 구체 클래스 3단 계층, `@Override` — report_190221 (StarCraft 12파일, 진입점 StartApp)
- 접근지정자 4종·getter·생성자 오버로딩·합성(세트 메뉴)·상속 시 필드 참조 규칙 — study_190305
- 패키지 경계에서 private/default 접근 실험 — study_190306_room1 ↔ room2
- 객체 협력과 다단계 업캐스팅 — study_190306 (CafeApp)
- 오버라이딩 vs 다운캐스팅(+예외 처리) — study_190308 (Class404OR) ↔ study_190308_mk2 (Class404DC)
- `Object`의 `toString`/`hashCode` 오버라이딩 — study_190308_mk4
- `super.draw()` vs `this.draw()` — study_190425 (Shape/Circle)

## 근거 패키지
| 패키지 | 날짜 | 종류 | 무엇을 연습 | 주의 |
|---|---|---|---|---|
| [study_181219](../../legacy/02-oop/study_181219) | 2018-12-19 | study | 클래스·생성자·필드·new | 부 단원 01 |
| [study_190215](../../legacy/02-oop/study_190215) | 2019-02-15 | study | 매개변수 생성자·this (LoL) | Champ.java만 UTF-8 |
| [study_190215Mk2](../../legacy/02-oop/study_190215Mk2) | 2019-02-15 | study | Gateway 팩토리·오버로딩 (StarCraft) | 명명 규칙 주석 |
| [study_190220](../../legacy/02-oop/study_190220) | 2019-02-20 | study | 유닛 클래스·Gateway·오버로딩 | - |
| [study_190220Mk2](../../legacy/02-oop/study_190220Mk2) | 2019-02-20 | study | Animal 인터페이스 다형성 | study_190305 Ex02App과 중복 |
| [study_190220Mk3](../../legacy/02-oop/study_190220Mk3) | 2019-02-20 | study | Lamun 인터페이스 (Mk2 동일 패턴) | - |
| [report_190220](../../legacy/02-oop/report_190220) | 2019-02-20 | report | 지역/static/instance 변수·return | 한 파일 3클래스 |
| [report_190221](../../legacy/02-oop/report_190221) | 2019-02-21 | report | 인터페이스→추상→구체 3단 계층 (12파일) | 주석 없음 |
| [study_190305](../../legacy/02-oop/study_190305) | 2019-03-05 | study | 접근지정자·getter·합성·생성자 오버로딩 | 한 파일 다중 클래스 |
| [study_190306](../../legacy/02-oop/study_190306) | 2019-03-06 | study | 객체 협력·업캐스팅 (CafeApp) | 부 단원 03. 한 파일 6클래스(CafeApp 포함) |
| [study_190306_room1](../../legacy/02-oop/study_190306_room1) | 2019-03-06 | study | private/default 접근 (같은 패키지) | room2와 한 쌍 |
| [study_190306_room2](../../legacy/02-oop/study_190306_room2) | 2019-03-06 | study | 다른 패키지에서 default 접근 불가 | room1 의존 |
| [study_190308](../../legacy/02-oop/study_190308) | 2019-03-08 | study | 상속 오버라이딩·ArrayList\<인터페이스\> | 부 단원 03. Humen/Enermy 오타 |
| [study_190308_mk2](../../legacy/02-oop/study_190308_mk2) | 2019-03-08 | study | 다운캐스팅 + try-catch | 부 단원 03 |
| [study_190308_mk4](../../legacy/02-oop/study_190308_mk4) | 2019-03-08 | study | toString/hashCode·StringBuilder | 부 단원 03 |
| [study_190425](../../legacy/02-oop/study_190425) | 2019-04-25 | study | super vs this 오버라이딩 | 마지막 패키지 |
| [report_190227](../../legacy/01-basics/report_190227) | 2019-02-27 | report | (부) static 상태 관리·생성자 (야구 3라운드) | 주 단원 01. 2인 팀 과제 |

## 주의점
- 클래스명 오타: Humen, Enermy(study_190308, mk2에서 재사용). 파일명은 Class404OR / Class404DC라 클래스명으로 파일을 찾을 수 없습니다.
- 한 파일 다중 클래스: report_190220, study_190305(Manager, Ex02App, Ex01App), study_190306(CafeApp 포함 6클래스). 클래스는 grep으로 찾습니다.
- 같은 Animal 예제가 study_190220Mk2와 study_190305/Ex02App에 중복됩니다.
- study_190215Mk2/StarApp.main에 attack(z1, d1) 호출이 12회 반복됩니다(의도된 연습).
- report_190221은 주석이 없고 StartApp.java(한글 출력문, MS949)를 제외한 11개가 ASCII입니다. 나머지 패키지는 대부분 MS949이며 study_190425(2파일)·study_190220Mk3(4파일)도 ASCII입니다.

## 현업 연결
인터페이스 타입 매개변수(report_190221)는 Spring의 인터페이스 기반 DI·전략 패턴으로, 팩토리(Gateway)는 `@Bean` 팩토리 메서드로 이어집니다. static 필드로 상태를 공유하는 습관(report_190227)은 싱글턴 빈의 상태 관리와 같은 함정입니다.

## 이어서 볼 단원
- [컬렉션·제네릭·문자열](./03-collections-strings.md) — ArrayList\<Humen\>에 담아 다형 호출하는 study_190308이 두 단원의 접점입니다.
- [자바 기초](./01-basics.md) — static 메서드와 배열은 여기서 시작됐습니다.

## 메모 · 아직 없는 노드(TODO)
- 2026-09-25: topic 후보 — "interfaces-polymorphism"(190220Mk2/Mk3/report_190221/190305 비교), "access-modifiers"(190305/room1/room2). evidence 후보 — report_190221(12파일, 진입점 StartApp).
