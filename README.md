<div align="center">
<a href="https://youtu.be/seke_i2wgBY"><img src="frontend/src/assets/image/logo.png"
  alt="다소니 로고"
/>
</a>
<p>☝로고를 클릭하면 UCC로 이동합니다</p>
</div>

<br>

# 프로젝트 소개

### 💗 프로젝트 개요

- N:N 랜덤 화상 미팅 / 매칭 서비스
- 서비스 명 : [다소니](https://i9a307.p.ssafy.io/)

<br>

### 📆 프로젝트 일정

- 2023.7.4 ~ 2023.8.18 ( 7주)

<br>

### ✨팀

| **강한(팀장**)                                    | **이명우**                                        | **권현우**                                                    | **김유진**                                        | **김선희**                                              | **민경현**                                        |
| ------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------------------- | ------------------------------------------------- | ------------------------------------------------------- | ------------------------------------------------- |
| <p align="left" style="color:skyblue">Backend</p> | <p align="left" style="color:skyblue">Backend</p> | <p align="left" style="color:skyblue">Backend <br> DevOps</p> | <p align="left" style="color:skyblue">Backend</p> | <p align="left" style="color:pink">Frontend</p>         | <p align="left" style="color:pink">Frontend</p>   |
| 멤버 관리 API, WebSocket <br> 채팅,매칭,알람 서비스              | 매칭, 레이팅 알고리즘 <br> REST API               | CI/CD <br> 프로필 사진 API                                    | CI/CD <br> 회원 API <br> 반응형 CSS               | WebSocket 대기방, 미팅 시스템 <br > WebRTC <br> UX / UI | 회원가입 및 로그인 <br> 모달 및 컴포넌트 <br> CSS |
| [@27kanghan](https://github.com/27kanghan)        | [@Fishphobiagg](https://github.com/Fishphobiagg)  | [@mycodeisnoob](https://github.com/mycodeisnoob)              | [@Yujin830](https://github.com/Yujin830)          | [@KimSeonHui](https://github.com/KimSeonHui)            | [@minaldo15](https://github.com/minaldo15)        |

<br><br>

### 🔧 기술 스택

### Back-end & Front-end

![Java](https://img.shields.io/badge/Java-yellow.svg?&style=for-the-badge&logo=java&logoColor=#3776AB)
![Spring](https://img.shields.io/badge/Spring-6DB33F.svg?&style=for-the-badge&logo=Spring&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F.svg?&style=for-the-badge&logo=Spring%20Boot&logoColor=white)
![Spring Security](https://img.shields.io/badge/Spring%20Security-6DB33F.svg?&style=for-the-badge&logo=Spring%20Security&logoColor=white)

![React](https://img.shields.io/badge/React-61DAFB.svg?&style=for-the-badge&logo=React&logoColor=blue)
![TypeScript](https://img.shields.io/badge/TypeScript-3178C6.svg?&style=for-the-badge&logo=Typescript&logoColor=white)
![Redux](https://img.shields.io/badge/Redux-764ABC.svg?&style=for-the-badge&logo=Redux&logoColor=white)

### DataBase

![MySQL](https://img.shields.io/badge/MySQL-4479A1.svg?&style=for-the-badge&logo=MySQL&logoColor=white)
![Redis](https://img.shields.io/badge/Redis-DC382D.svg?&style=for-the-badge&logo=Redis&logoColor=white)

### CI/CD & Infra Tools

![Jenkins](https://img.shields.io/badge/Jenkins-D24939.svg?&style=for-the-badge&logo=Jenkins&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED.svg?&style=for-the-badge&logo=Docker&logoColor=white)
![Nginx](https://img.shields.io/badge/Nginx-009639.svg?&style=for-the-badge&logo=Nginx&logoColor=white)

### Collaboration Tools

![Notion](https://img.shields.io/badge/Notion-000000.svg?&style=for-the-badge&logo=Notion&logoColor=로고색상)
![Mattermost](https://img.shields.io/badge/Mattermost-0058CC.svg?&style=for-the-badge&logo=Mattermost&logoColor=로고색상)

### Issue & Configuration Management

![GitLab](https://img.shields.io/badge/Gitlab-FC6D26.svg?&style=for-the-badge&logo=Gitlab&logoColor=#FC6D26)
![Jira](https://img.shields.io/badge/Jira-0052CC.svg?&style=for-the-badge&logo=Jira&logoColor=Blue)

---

<br><br>

# 목차

1. [**기획 배경**](#🎉기획-배경)
2. [**기능 소개**](#🔗기능-소개)
3. [**시연 영상**](#🎵시연-영상)
4. [**트러블 슈팅**](#⚽트러블-슈팅)
5. [**프로젝트 산출물**](#🎈프로젝트-산출물)

<br><br>

# 🎉기획 배경

## 배경

일반적으로 미팅/소개팅을 할 때는 상대방의 사진과 간단한 정보 등을 전달 받게 됩니다. 하지만 막상 실제로 만나보면 이전에 받은 사진과 실물이 달라 실망할 때 많습니다.

그래서 [다소니](https://i9a307.p.ssafy.io/)는 미리 주고받는 정보 없이 다양한 사람들과의 랜덤 미팅으로 실망감 대신 설레고 즐길 수 있는 미팅을 만들고자 했습니다.

<br>

## 의의

랜덤 미팅을 통해 3가지 기대를 할 수 있습니다.

1. 미팅 전 상대방에 대한 아무런 정보가 없어 선입견을 가지지 않게 됩니다.
2. 미팅을 진행하면서 얼굴, 직업, 나이 정보 등이 공개되어 정보가 공개될수록 다른 사람들과 소통 했을 때 호기심이 극대화 되고 설렘을 느낄 수 있습니다.
3. 미팅과 매칭 서비스를 통해 돈과 시간 소비하는 것을 줄이고 다양한 사람들과 만남을 가질 수 있습니다.

<br><br>

# 🔗기능 소개

## 시스템 아키텍쳐

![image](https://github.com/KimSeonHui/cs-study/assets/44824456/2193db0f-9258-4402-923e-6fd39588a487)

<br><br>

## 핵심 기능

### 레이팅 시스템

- 미팅 내 퍼포먼스(시그널 수신 횟수 및 매칭 여부)에 따른 등수 산출
- 등수에 따른 레이팅 변동값 부여
- ELO 알고리즘 적용
- K 가중치 40
- 내 레이팅 vs 상대 레이팅(미팅 방의 평균 레이팅)을 통해 기대 승률 계산
- 가중치와 기대 승률을 통해 가중 레이팅 변동값에 추가적인 변동값 합산

<br>

### 실시간 매칭

![16 매칭 버튼 클릭](https://github.com/KimSeonHui/cs-study/assets/44824456/b5be85f1-b268-493a-a5ef-050046aa51b8)

- 빠른 매칭 버튼, 메기 매칭 버튼 클릭 시 매칭 중 모달창 등장
- 매칭 완료 되면 안내 문구 출력 후 미팅 페이지로 이동

<br>

### 매칭 알고리즘 
  - Redis에 성별 및 레이팅에 따른 대기열 큐 구현
  - 각 레이팅 별로 들어갈 수 있는 큐가 두개씩 존재 `ex) 600~900점 큐, 750~1050점 큐`
  - 자신의 레이팅에 맞는 큐 중, 인원이 적은 큐에 매칭 신청자를 Push
  - 들어간 큐의 인원이 3명 이상일 경우 상대 성별의 동일 레이팅 대 큐 인원 확인
  - 상대 큐의 인원 또한 3명 이상일 경우 매칭!
  - 매칭 완료 알림 -> 매칭시 SSE 구독, 매칭 완료시 서버에서 알림을 보냄

<br>

### 메기 매칭 알고리즘 
  -  성별, 레이팅에 따른 대기열 큐, 방 대기열 큐 존재
  
  **성별 , 레이팅 큐**
  -  큐의 인원이 1명 이상일때 상대 성별 큐 확인 및 매칭 절차 진행

  **방 대기열 큐**
  -  방의 점수에 따라 들어갈 수 있는 큐가 한개씩 존재
  -  일반 매칭으로 방이 생성되었을 떄 매칭된 유저들의 대기열 큐 점수의 중간값`(ex 600~900 큐이면 750)`이 방 대기열 큐의 레이팅

  **알고리즘**
  -  해당 레이팅 대에서 매칭이 되었을 경우 이에 해당하는 방 대기열 큐에서 메기 매칭이 가능한 방이 있는지 확인
  -  메기 입장 가능한 방이 있을 경우 메기 투입, 큐에서 방과 유저 삭제
  -  방이 대기열에 등록 되었을 경우에도 방의 점수대에 맞는 메기 대기열 큐에서 인원 확인 및 매칭 절차 진행
  -  알맞은 인원이 큐에 있을 경우 메기를 방에 투입, 큐에서 모두 삭제

<br>

### 다대다 화상 미팅

![8 미팅방페이지 - 미팅 시작](https://github.com/KimSeonHui/cs-study/assets/44824456/7f2a614c-a70d-4201-9554-9d604270d00a)

![9 미팅방페이지 - 참여자 화면](https://github.com/KimSeonHui/cs-study/assets/44824456/acd0aa76-f05a-4b9e-8504-3cf447ce69e2)

![10 미팅방페이지 - 첫인상 투표](https://github.com/KimSeonHui/cs-study/assets/44824456/5fcd7ecc-2a2c-4b8e-ad65-cb6870035ebd)

![11 미팅방페이지 - 정보 공개](https://github.com/KimSeonHui/cs-study/assets/44824456/cf9d84cb-503d-45b6-8c40-f22d0ae9f1b1)

![12 미팅방페이지 - 질문](https://github.com/KimSeonHui/cs-study/assets/44824456/1f860c18-9a89-4f0e-982a-189cbe54e1f4)

![13 미팅방페이지 - 최종 시그널](https://github.com/KimSeonHui/cs-study/assets/44824456/86b157d7-d72d-4d0d-afb6-dfec65662d45)


<br><br>

# 🎵시연 영상

## 핵심 기능

### 실시간 매칭
![짱구빠른매칭-_online-video-cutter com_](https://github.com/minaldo15/class_work/assets/122500569/15434eac-ac60-4f66-98c5-13f15ebf688c)


### 다대다 화상 미팅
#### 미팅방 입장
![짱구사설방-_online-video-cutter com_](https://github.com/minaldo15/class_work/assets/122500569/21f710af-1215-460b-860b-87a4613ed1a4)


#### 첫인상 투표
![첫인상 투표](./img/first_vote.GIF)


#### 정보 공개
![정보 공개](./img/open_info.GIF)


#### 질문 공개
![질문 공개](./img/open_question.GIF)

#### 메기 입장
![메기 입장](./img/megi_enter.GIF)

#### 최종 투표
![최종 투표](./img/fianl_vote.GIF)


#### 매칭된 둘만의 채팅방
![매칭된 둘만의 채팅방](./img/match_session.gif)

<br><br>

# ⚽트러블 슈팅
- [x] [WebSocket과 STOMP, SSE 비동기 처리](https://velog.io/@27kanghan/WebSocket-STOMP-React%EB%A5%BC-%ED%99%9C%EC%9A%A9%ED%95%9C-%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8-%EC%A4%91-%ED%8A%B8%EB%9F%AC%EB%B8%94-%EC%8A%88%ED%8C%85)
- [x] [커스텀 훅으로 웹 소켓 연결 중복 코드 제거, 비동기 상태 설정으로 Stomp client 에러 해결](https://sunsunny.tistory.com/93)
- [x] [로컬 환경과 배포 환경에서 시간이 상이함으로 발생하는 문제 해결](https://velog.io/@hjk8596/%EB%A1%9C%EC%BB%AC-%ED%99%98%EA%B2%BD%EA%B3%BC-%EB%B0%B0%ED%8F%AC-%EC%84%9C%EB%B2%84-%ED%99%98%EA%B2%BD%EC%97%90%EC%84%9C-%EC%8B%9C%EA%B0%84%EC%9D%B4-%EC%83%81%EC%9D%B4%ED%95%98%EC%97%AC-%EC%9D%BC%EC%96%B4%EB%82%98%EB%8A%94-%EB%AC%B8%EC%A0%9C)

<br><br>

# 🎈프로젝트 산출물

- [📃 요구사항 정의서](https://plump-sailor-daa.notion.site/4d2fb2d9fa3049e6a0689b2c40d1cd52?pvs=4)
- [🎨 와이어프레임](https://www.figma.com/file/lMRXAT3HPBflT8HtT5Z20T/%EC%8B%9C%EA%B7%B8%EB%8B%88%EC%97%98?type=design&node-id=102%3A567&mode=design&t=cq2dlHwKx8UW5FVs-1)
- [📕 API 명세서](https://plump-sailor-daa.notion.site/API-57a6d9c4a1f24f96bcd6625c08a53d73?pvs=4)
- [💿 ERD](/img/ERD.png)
