convention: 1 · 원본: jhu900202/Java · 2026-09-25

# 지식맵 안내 (GUIDE)

이 문서는 지식맵의 규약서입니다. 사람과 Claude가 함께 씁니다. 노드를 새로 만들거나 frontmatter를 고치거나 규약이 헷갈릴 때만 읽습니다. 평소 탐색에는 [ROOT.md](./ROOT.md)만 있으면 됩니다.

## 1. 지식맵이란

이 리포의 학습 내용을 "날짜 패키지"가 아니라 "커리큘럼 단원"으로 다시 묶은 Markdown 문서 묶음입니다. 소스 자체가 아니라 **소스에 대해 알아낸 것**을 저장하는 얇은 층입니다.

역할 분리를 한 문장으로 하면 이렇습니다. **코드 위치는 INDEX.md와 frontmatter `evidence`가, 개념은 단원 본문이 담습니다.** 그래서 리포를 정리해 경로가 바뀌어도 INDEX 표와 `evidence` 경로만 갱신하면 됩니다.

원칙 네 가지:
1. 순수 Markdown입니다. 외부 도구 없이 GitHub에서 그대로 읽힙니다.
2. 소스가 진실입니다. 노드와 소스가 다르면 소스를 따릅니다. Claude는 차이를 답변에 밝히고, 소유자 승인 뒤에만 본문을 고칩니다(8절 7항, 9절 12항).
3. 노드는 짧게 둡니다(단원 150줄 이하). Claude가 세션당 ROOT + 단원 1~2개만 읽어도 답할 수 있어야 합니다.
4. 자식 목록은 부모 본문의 표 한 곳에만 둡니다. frontmatter에 `children` 키는 없습니다.

## 2. 디렉토리 구조

```
knowledge-map/
├── GUIDE.md            # 이 문서. 규약서. frontmatter 없음
├── ROOT.md             # 루트 노드. 유일한 진입점. 로드맵 표 + 주의사항 + 열린 논의 (60줄 이하)
├── INDEX.md            # 패키지 색인(36행). 패키지명 질문일 때만 grep으로 행만 읽음
├── units/              # 커리큘럼 단원 노드 (초기 5개)
│   ├── 01-basics.md
│   ├── 02-oop.md
│   ├── 03-collections-strings.md
│   ├── 04-io-network-threads.md
│   └── 05-jdbc-libs.md
└── discussion/
    └── repo-reorg.md   # 리포 정리 논의 (안건·선택지·질문·결정 기록)
```

지금 없는 디렉토리(필요해지면 첫 파일을 만들 때 함께 만듭니다): `topics/`(단원 세부 주제), `evidence/`(패키지 1개 = 노드 1개). 빈 디렉토리나 `.gitkeep`은 두지 않습니다.

## 3. 노드 타입

| type | 목적 | 위치 | parent | status | 길이 상한 |
|---|---|---|---|---|---|
| root | 유일한 진입점. 로드맵 표(단원·summary·triggers), 저장소 주의사항, 열린 논의, 갱신 기록 | `ROOT.md` | 없음 | 없음 | 60줄 |
| unit | 커리큘럼 단원. 날짜 패키지를 주제로 재묶는 층 | `units/NN-slug.md` | ROOT | 있음 | 150줄 |
| topic | 단원이 길어지거나 한 주제만 집중할 때 쪼개는 세부 노드 | `topics/NN-slug.md` | 소속 unit | 있음 | 100줄 |
| evidence | src 패키지 1개의 설명서(파일 목록·진입점·의존·주의). 소스를 열지 않고 답하게 하는 캐시 | `evidence/<패키지명>.md` | 소속 unit | 있음 | 60줄 |
| discussion | 리포 운영 논의(배경·안건·선택지·질문·결정 기록) | `discussion/<slug>.md` | ROOT | 없음 | 제한 없음 |
| index | 보조 파일. 패키지 → 단원 색인 | `INDEX.md` | ROOT | 없음 | 행 수 = 패키지 수 |

## 4. 파일 이름과 id

1. 파일명은 영문 소문자 kebab-case + `.md`. 고정 보조 파일만 대문자(`GUIDE.md`, `ROOT.md`, `INDEX.md`).
2. 단원: `units/NN-slug.md`. `NN`은 두 자리 번호이며 **한 번 부여하면 바꾸지 않습니다**(번호 재부여 금지). 커리큘럼 순서는 frontmatter `order`와 ROOT 표의 행 순서가 진실이고, 파일명 번호는 식별용입니다. 단원을 끼워 넣을 때는 다음 빈 번호(06, 07…)를 쓰고 `order`로 순서를 표현합니다.
3. 세부 주제: `topics/NN-slug.md`. `NN`은 소속 단원 번호. 예: `topics/04-socket-chat-series.md`.
4. 근거 노트: `evidence/<패키지명 그대로>.md`. src 패키지와 1:1이므로 예외적으로 snake_case를 유지합니다. 예: `evidence/study_190318_mk4.md`.
5. 논의: `discussion/<slug>.md`.
6. frontmatter `id`는 `<type>.<slug>` 형식(`root.java`, `unit.oop`, `topic.socket-chat-series`, `evidence.study_190318_mk4`, `discussion.repo-reorg`, `index.java`). 리포 안에서 유일하며 파일을 옮기거나 이름을 바꿔도 **불변**입니다. 링크가 깨지면 `grep -rl "id: unit.oop" knowledge-map/`로 새 위치를 찾습니다.
7. `title`은 한국어이며 필요하면 괄호로 영어 키워드를 병기합니다. 파일명에는 한글·공백·대문자를 쓰지 않습니다.

## 5. frontmatter

GUIDE.md를 제외한 모든 파일은 첫 줄 `---`로 시작하는 YAML frontmatter를 갖습니다. 키는 영어, 사람이 읽는 값(title, summary, next_action)은 한국어입니다.

```yaml
---
id: unit.oop                 # (필수) <type>.<slug>. 불변
type: unit                   # (필수) root | unit | topic | evidence | discussion | index
title: 객체지향 (class · inheritance · interface · polymorphism)   # (필수) 한국어 제목
summary: 클래스·생성자·static·상속·인터페이스·다형성·접근지정자·캐스팅. StarCraft/LoL/동물/라면/카페 테마   # (필수) 120자 이내 한 줄, 끝 마침표 없음. ROOT 표의 summary 열과 글자 단위로 같아야 함
stack: java                  # (필수) java | spring | react | ... 다른 리포로 복제할 때 구분용
parent: ../ROOT.md           # (필수, root 제외) 상위 노드 상대 경로. 정확히 하나
status: draft                # (필수: unit/topic/evidence) draft | confirmed | stale
order: 2                     # (필수: unit/topic) 커리큘럼 순서. ROOT 표 정렬 기준
triggers: [class, 클래스, 생성자, this, static, 상속, inheritance, interface, 다형성, override, 캐스팅, 접근지정자]
                             # (필수: unit/topic) 질문 키워드 매칭용. 한/영 혼용, 소문자, 12개 이내
evidence:                    # (선택) 근거 경로. 리포 루트 기준, 디렉토리 또는 파일. glob 금지, 실제 존재하는 경로만
  - src/02-oop/study_190215
  - src/02-oop/report_190221
related:                     # (선택) 교차 참조 노드 상대 경로. Claude는 필요할 때만 1홉
  - ./01-basics.md
last_reviewed: null          # (선택) 소유자가 "복습했다"고 명시할 때만 갱신. Claude 자동 갱신 금지
next_action: null            # (선택) 다음에 볼 것 한 줄. 위와 같은 규칙
---
```

타입별 필수 키:
- root: `id`, `type`, `title`, `summary`, `stack`, `convention`
- unit / topic: 위 공통 키 + `parent`, `status`, `order`, `triggers`
- evidence: 공통 키 + `parent`(소속 unit), `status`, `evidence`(패키지 1개)
- discussion: `id`, `type`, `title`, `summary`, `stack`, `parent`(`../ROOT.md`)
- index: `id`, `type`, `title`, `summary`, `stack`, `parent`(`./ROOT.md`)

`status`는 **문서의 신뢰도**이지 학습 상태가 아닙니다.
- `draft`: Claude가 썼고 소유자가 아직 확인하지 않음. 초기 노드는 전부 draft.
- `confirmed`: 소유자가 내용을 확인함. Claude는 소유자 요청 없이 confirmed 노드의 본문을 고치지 않습니다(`## 메모`에 한 줄 추가만 허용). 강등 규칙은 없습니다.
- `stale`: `evidence` 경로가 사라졌거나 소스와 크게 어긋남. 본문 첫 줄에 `> stale: YYYY-MM-DD — 어떤 경로가 없어졌는지 / 무엇이 어긋나는지` 인용문을 남깁니다.

불변식:
- `evidence`에는 실제로 존재하는 경로만 적습니다. glob은 쓰지 않습니다.
- `triggers`는 소문자, 한/영 혼용, 12개 이내. summary와 중복되는 단어는 넣지 않아도 됩니다.
- `last_reviewed`·`next_action`은 소유자가 명시적으로 말할 때만 갱신합니다.
- `updated`·`author` 같은 관리 필드는 두지 않습니다. 수정 이력은 git log가 담당합니다.

## 6. 링크

- 문법은 표준 Markdown 상대 링크만 씁니다. `[객체지향](./units/02-oop.md)`, `[ROOT](../ROOT.md)`. 위키링크(`[[...]]`)는 GitHub에서 렌더링되지 않으므로 쓰지 않습니다.
- 소스 링크: frontmatter `evidence`에는 리포 루트 기준 경로(`src/02-oop/study_190215`), 본문에서는 그 파일 기준 상대 링크(`units/`에서는 `[src/02-oop/study_190215](../../src/02-oop/study_190215)`). 줄 번호 앵커(`#L12`)는 쓰지 않고 "12행 부근"처럼 본문에 적습니다.
- 관계의 의미:
  - `parent`(frontmatter, 정확히 1개): 위로 가는 링크. 트리 깊이 최대 3(ROOT → unit → topic/evidence).
  - `children` 키는 없습니다. 부모 본문의 표가 자식 목록의 단일 진실입니다. ROOT의 "학습 로드맵" 표 = unit 목록, unit의 "세부 주제·근거 노트" 목록 = topic/evidence 목록.
  - `related`(frontmatter, 선택): 계층과 무관한 교차 참조. 양방향 의무는 없습니다. 본문 `## 이어서 볼 단원`에 링크마다 "왜" 한 줄을 붙입니다.
  - `evidence`(frontmatter): 노드 → 코드. 노드끼리의 링크가 아닙니다.
- 다른 리포 참조(나중): `related`에 GitHub 절대 URL을 씁니다. 상대 경로는 리포 안에서만 씁니다.

## 7. 본문 템플릿

### unit

```markdown
---
id: unit.<slug>
type: unit
title: <한국어 제목>
summary: <120자 이내>
stack: java
parent: ../ROOT.md
status: draft
order: <N>
triggers: [<12개 이내>]
evidence:
  - src/<NN-단원>/<패키지>
related:
  - ./<다른 단원>.md
---

# <제목>

## 학습 목표
<2~3줄>

## 핵심 개념
- <개념 한 줄> — <근거 패키지/파일>

## 근거 패키지
| 패키지 | 날짜 | 종류 | 무엇을 연습 | 주의 |
|---|---|---|---|---|

## 주의점
- <오타·미완성·하드코딩·인코딩. 값은 적지 않음>

## 현업 연결
<Spring/React에서 어디에 대응하는지 2~3줄>

## 이어서 볼 단원
- [<단원>](./<파일>) — <왜>

## 메모 · 아직 없는 노드(TODO)
- YYYY-MM-DD: <한 줄>
```

선택 섹션(필요할 때만 추가): `## 복습 체크리스트`, `## 퀴즈 시드`, `## 복습 기록`, `## 근거 공백(이 리포에 없는 것)`, `## 시리즈: <이름>`(단계별 패키지 표가 필요할 때).

### topic

unit의 축약형입니다. `## 학습 목표` / `## 핵심 개념` / `## 근거` / `## 메모`만 둡니다. `parent`는 소속 unit입니다.

### evidence

```markdown
---
id: evidence.<패키지명>
type: evidence
title: <패키지명> — <한 줄>
summary: <120자 이내>
stack: java
parent: ../units/<NN-slug>.md
status: draft
evidence:
  - src/<NN-단원>/<패키지명>
---

# <패키지명>

## 파일
## 진입점(main)
## 의존
## 알려진 문제
## 메모
```

### discussion

`## 배경` / `## 전제` / `## 큰 방향`(선택: 방향별 비교 표) / `## 안건`(안건마다 현황 · 선택지와 장단점 · 지식맵 영향) / `## 바로 할 수 있는 안전한 항목`(선택) / `## 소유자에게 묻는 질문` / `## 결정 기록`(표: 날짜 | 안건 | 결정 | 근거) / `## 후속 작업`.

## 8. Claude 읽기 프로토콜

1. **세션 시작**: CLAUDE.md만 자동 로드됩니다. 여기서 얻는 것은 리포 목적, 절대 규칙, 지식맵 위치와 로드 조건뿐입니다.
2. **ROOT.md를 읽는 조건**: 이 리포의 자바 개념 질문("상속 예제 어디 있었죠?", "소켓 채팅은 몇 단계였죠?"), 학습 이력·타임라인, 복습 요청, 리포 정리 논의.
   **읽지 않는 조건**: git 명령·브랜치 작업, LICENSE/README 편집, 지식맵과 무관한 파일 조작, 이 리포와 무관한 일반 자바 질문("Stream API 사용법 알려 주세요").
3. **단원 선택**: ROOT 로드맵 표의 `triggers`·`summary`와 질문 키워드를 대조해 unit **1개**를 고릅니다. 경계가 겹치면(예: StringBuilder는 02와 03, URLConnection은 04와 05) 최대 2개. `units/` 전체를 읽지 않습니다.
4. **매칭 실패 폴백**: (a) 패키지명·테마 이름("StarCraft", "라면")이 보이면 `grep -n "<키워드>" knowledge-map/INDEX.md`로 행을 찾아 주 단원을 엽니다. (b) 그래도 없으면 소유자에게 되묻습니다. 어떤 경우에도 `units/`·`src/` 전체 나열로 대체하지 않습니다.
5. **패키지명 질문**("study_190318_mk3이 뭐였죠?"): ROOT를 열지 않고 `grep -n "<패키지명>" knowledge-map/INDEX.md`로 해당 행만 읽습니다. 한 줄 요약으로 답이 되면 거기서 멈추고, 부족할 때만 그 행의 주 단원을 엽니다.
6. **소스 진입**: unit의 `evidence` 경로에서 시작합니다. 한 번에 패키지 1개, 파일 5개 이내. `src/04-io-network-threads/study_190311/naver.html`과 `libs/`는 읽지 않습니다. MS949 파일은 `iconv -f CP949 -t UTF-8 <파일>`로 읽고 재저장하지 않습니다.
7. **소스가 진실**: 노드와 소스가 다르면 소스를 따르고, 그 사실을 답변에 밝히며 노드 갱신을 제안합니다. 자동 갱신은 하지 않습니다.
8. **민감값 경계**: 소스의 민감값은 `<REDACTED_...>`로 치환되어 있습니다. git 이력에서 옛 값(키 문자열·번호·계정·IP)을 보더라도 인용하지 않고, 파일 경로와 종류까지만 적습니다.
9. **GUIDE.md**(이 문서)는 노드를 만들거나 frontmatter를 고치거나 규약이 헷갈릴 때만 읽습니다. `discussion/`은 정리 논의 요청일 때만 읽습니다. git log는 다시 뽑지 않습니다(고정 사실은 CLAUDE.md·ROOT에 있습니다).
10. **예산**: CLAUDE.md + ROOT + unit 1~2개 + INDEX 행 몇 줄 ≈ 4~6k 토큰(단원 1개면 4k 안팎, 2개면 6k 안팎)이 지식맵의 최대 부담입니다. 이 안에서 답이 안 나오면 소스를 직접 읽는 쪽으로 전환합니다.

## 9. Claude 쓰기 프로토콜

11. **승인 없이 허용**: 세션 중 알아낸 사실을 해당 unit의 `## 메모 · 아직 없는 노드(TODO)`에 `- YYYY-MM-DD: 한 줄`로 추가하는 것. 지식맵이 성장하도록 하되 구조는 바꾸지 않습니다.
12. **승인 필요**: 새 파일(unit/topic/evidence) 생성, 기존 본문 섹션 수정, ROOT/INDEX 표 변경. 소유자가 요청했거나 "기록할까요?"에 승인했을 때만. 5개 이상 대량 생성은 소유자와 합의 후에 합니다.
13. **새 노드 절차**: 7절 템플릿 복사 → 필수 키 채움 → 부모 본문 표에 행 추가 → (evidence면) INDEX 행 갱신 → `status: draft`.
14. **confirmed 노드**: 소유자 요청 없이 본문을 고치지 않습니다(메모 한 줄 추가만).
15. **stale 처리**: `evidence` 경로가 사라지면 `status: stale`로 바꾸고 본문 첫 줄에 `> stale: ...` 인용문을 남긴 뒤 소유자에게 알립니다. 리포 정리 실행 직후에는 INDEX 표와 모든 unit의 `evidence`를 한 번에 갱신하는 것을 후속 작업으로 제안합니다.
16. **last_reviewed / next_action**: 소유자가 "복습했다", "다음엔 X 보자"고 명시적으로 말할 때만 갱신합니다. 세션 종료 시 자동 갱신 절차는 없습니다.
17. **ROOT `## 갱신 기록`**: 구조 변경(노드 추가·stale·정리 결정)이 있을 때만 한 줄 추가하고, 최근 10건만 유지합니다.
18. **검증(수동)**: 노드를 만들거나 고친 뒤 답변에 보고합니다. (1) 필수 키 존재, (2) `parent` 경로 유효, (3) 부모 표에 행 있음, (4) `evidence` 경로 실제 존재, (5) triggers 12개 이하.
    ```bash
    grep -L '^id:' knowledge-map/units/*.md                       # id 없는 파일
    for p in $(grep -h '^  - src/\|^  - libs' knowledge-map/units/*.md | sed 's/^  - //'); do [ -e "$p" ] || echo "missing: $p"; done
    ```

## 10. 소유자 워크플로

- 노드를 읽고 맞으면 `status: confirmed`로 바꿔 주세요. 틀린 곳은 본문 그 자리에 `> fix: ...` 한 줄을 남기면 다음 세션에서 Claude가 반영하고 fix 줄을 지웁니다.
- 새 단원: 7절 unit 템플릿 복사 → 다음 빈 번호 → ROOT 로드맵 표에 행 추가.
- 단원이 150줄을 넘으면 `topics/`로 쪼갭니다.
- 커밋 메시지 관례: `map: add unit 06-xxx`, `map: confirm 02-oop`, `map: stale 05-jdbc-libs`.

## 11. 다른 리포로 옮기기

- 복사하는 것: `GUIDE.md`, `ROOT.md` 골격, `INDEX.md`(선택), `units/`·`discussion/` 디렉토리, CLAUDE.md의 "지식맵" 절.
- 바꾸는 것: `stack` 값, ROOT 내용, `units/` 내용.
- 규약 변경은 원본(이 리포)에서 먼저 하고 복사합니다. GUIDE.md 첫 줄의 `convention` 번호와 "원본" 표기로 어느 쪽이 최신인지 확인합니다.
- 리포 간 연결: `related`에 GitHub 절대 URL. 예: 이 리포의 05-jdbc-libs → Spring 리포의 데이터 접근 단원("학원 JDBC → 현업 JdbcTemplate/JPA").
- 리포가 3개 이상이 되면 별도 리포에 ROOT 하나만 두고 각 리포의 ROOT.md를 URL로 가리킵니다. 기존 노드는 바꿀 필요 없습니다.

## 12. 용어와 버전

| 한국어 | type | 위치 |
|---|---|---|
| 루트 | root | `ROOT.md` |
| 단원 | unit | `units/` |
| 세부 주제 | topic | `topics/` (아직 없음) |
| 근거 노트 | evidence | `evidence/` (아직 없음) |
| 논의 | discussion | `discussion/` |
| 색인 | index | `INDEX.md` |

규약 변경 이력:

| convention | 날짜 | 내용 |
|---|---|---|
| 1 | 2026-09-25 | 최초 작성 |
