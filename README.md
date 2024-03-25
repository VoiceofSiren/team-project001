<div>
<h1 align="center">Project PERION</h1>
<p>
- 이 프로젝트는 'Perion'이라는 남성 패션 전자상거래 사이트입니다.<br>
- 전자상거래 사이트를 선택한 이유는 CRUD, session, 파일 처리, 마크업 등을 활용할 수 있어서이며,<br>
   '기본에 충실하다'는 공통의 목적에 부합하기 때문입니다.<br>
- Perion은 한국의 MMORPG에서 등장하는 전사의 마을로, '전사처럼 강한 마음으로 살아가고 싶다'는 마음을 담아 이름을 지었습니다.
</p>
</div>
<br/>

## 전체 목차
- [프로젝트 개요](#프로젝트-개요)
- [프로젝트 설명 (프론트엔드·백엔드)](#프로젝트-설명)
- [리팩토링](#리팩토링)
- [참고 자료](#참고자료)
<br/>

## 프로젝트 개요
- 프로젝트명: Perion
- 프로젝트 기간: 2023.12.05-2024.01.08 (약 1개월)
- 프로젝트 기술:
  + Backend<br>
    <img src="https://img.shields.io/badge/Java-1C9AD6?style=flat-square&logo=Java&logoColor=orange"/>
    <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=MySQL&logoColor=white"/>
    <img src="https://img.shields.io/badge/MyBatis-030303?style=flat-square&logo=MyBatis&logoColor=white"/>
    <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=springboot&logoColor=white"/>
    <img src="https://img.shields.io/badge/Gradle-02303A?style=flat-square&logo=Gradle&logoColor=white"/>
    <img src="https://img.shields.io/badge/Thymeleaf-005F0F?style=flat-square&logo=Thymeleaf&logoColor=white"/>
    <img src="https://img.shields.io/badge/Lombok-EC1C24?style=flat-square&logo=Lombok&logoColor=white"/>
  + Frontend<br>
    <img src="https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=HTML5&logoColor=white"/>
    <img src="https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=CSS3&logoColor=white"/>
    <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=flat-square&logo=JavaScript&logoColor=black"/>
    <img src="https://img.shields.io/badge/SweetAlert2-EF1970?style=flat-square&logo=SweetAlert&logoColor=white"/>

  + Environment<br>
    <img src="https://img.shields.io/badge/IntelliJ-000000?style=flat-square&logo=IntelliJIdea&logoColor=white"/>
    <img src="https://img.shields.io/badge/Visual Studio Code-007ACC?style=flat-square&logo=VisualStudioCode&logoColor=white"/>
    <img src="https://img.shields.io/badge/Figma-F24E1E?style=flat-square&logo=Figma&logoColor=white"/>
    <img src="https://img.shields.io/badge/Git-F05032?style=flat-square&logo=Git&logoColor=white"/>
    <img src="https://img.shields.io/badge/GitHub-181717?style=flat-square&logo=GitHub&logoColor=white"/>
    <img src="https://img.shields.io/badge/ERDCloud-181717?style=flat-square&logo=ERDCloud&logoColor=white"/>
    <img src="https://img.shields.io/badge/Google Spreadsheets-34A853?style=flat-square&logo=Google Sheets&logoColor=white"/>

    
- 팀 멤버:
  + 권혁모 (PM/BE/FE) [@HyonHyonKOR](https://github.com/HyonHyonKOR) <br><br>
UX/UI 디자인 총괄 / 클라이언트 페이지 마크업 및 FE / 서버 아키텍처 / 회원 기능 전반 / 유효성 검사 / 인증 (Spring Interceptor)<br><br>
  + 김찬혁 (BE/FE)  [@swaeluu](https://github.com/swaeluu) <br><br>
UX/UI 디자인 / 관리자 페이지 마크업 및 FE / Q&A 기능 / 고객 리뷰 기능 / 페이징 처리<br><br>
  + 박영무 (BE/FE)  [@VoiceofSiren](https://github.com/VoiceofSiren) <br><br>
AJAX / 상품 관련 기능 / 재고 관리 기능 / 회원 카트 기능 / 회원 주문 기능 / DBA <br><br>
  + 이범선(BE/FE) [@Titan153](https://github.com/Titan153)　<br><br>
공지사항 기능 / ID·PW 재설정 기능 / 마크업 보조 / 외부 API / 참고 자료 정리　<br><br>
  + 창명성 (BE/FE)　[@Ainchel](https://github.com/Ainchel)　<br><br>
AJAX / 재고 관리 기능 / 회원 카트 기능 / 비회원 카트 기능 / 비회원 주문 기능　 <br><br>
<br/>

## 프로젝트 설명
- Front-end와 Back-end로 분류하여 설명 드리겠습니다.

### Front-end

  + Responsive WEB
<table>
  <thead>
    <tr>
      <th align="center">Desktop</th>
      <th align="center">tablet</th>
      <th align="center">mobile</th>
    </tr>
  <tbody>
    <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/89d0dfc2-acab-4fe7-8bc6-1d8e7eaaa42c" width="400px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/aa90bc71-9002-4525-a054-6c33bb227e78" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/4ba646da-66f0-4db3-be4a-cc20ac4e731a" width="200px;" alt=""/></td>
     <tr/>
    <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/9f4ba2e6-08f8-41b2-b334-26409b8d4ec2" width="400px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/1dfbca9c-ba2c-46f2-b13b-78fd070115ca" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/f8e0e3ec-0230-44c1-a95a-a2587b162e6d" width="200px;" alt=""/></td>
    </tr>
     <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/d5ffd3c7-f868-41f5-bd67-b70266e92a0d" width="400px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/131c7a86-6ebc-4344-ae12-23bdc2b06ffc" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/338e6ccb-29b9-49d0-9fad-c4a9f7aa1382" width="200px;" alt=""/></td>
    </tr>
     <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/73007a60-37b8-47a8-a7aa-8ee931359300" width="400px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/e2faeca0-941b-4e87-87aa-e1969ef23d2b" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/6edba50e-e182-4193-bab5-dc1b49c26e9c" width="200px;" alt=""/></td>
    </tr>
     <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/6fbfcf75-0390-40cc-8d26-e8a7b52c1311" width="400px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/488be4dc-5e3f-46c3-815d-30a06ccacbd9" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/f937bf6a-9a3c-4ccb-b309-6cfba8f3ed9e" width="200px;" alt=""/></td>
    </tr>
     <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/02b7a1aa-badf-4077-9458-b2bfb481ede6" width="400px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/5cdcf06c-3be5-4135-9601-ad6182d1ade0" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/95a06d98-20c8-42b4-924f-5f631d60b653" width="200px;" alt=""/></td>
    </tr>
  </tbody>
</table>

  1. 첫 번째 페이지는 viewport의 크기에 따라 레이아웃이 변경되는 반응형 웹을 구현하였습니다.<br>
  2. 앞으로 index 페이지뿐만 아니라 다른 페이지들도 media query를 활용하여 반응형 웹을 구현하고자 합니다.<br><br>

  + UX/UI

  <table>
  <thead>
    <tr>
      <th align="center">Navigation</th>
      <th align="center">Side bar</th>
      <th align="center">login(입력 전)</th>
      <th align="center">login(입력 후)</th>
    </tr>
  <tbody>
    <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/9f0626d0-c811-4885-b493-30eff72097d4" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/9b4de93f-4ced-4d24-a3a5-25049df06207" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/8f5e397c-4a87-4946-b29c-7a1b3700b5fa" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/d886d6ce-c5a0-40b1-b288-201279325ef5" width="300px;" alt=""/></td>
     <tr/>
  </tbody>
</table>

  1. Navigation에서 카테고리를 바로 선택할 수 있도록 하고, 페이지 DEPTH를 줄여 CPR을 향상시켰습니다.<br>
  2. 세로로 긴 페이지인 만큼 사용자가 원하는 정보를 바로 확인할 수 있도록 사이드바를 형상화하였습니다.<br>
  3. 보다 직관적으로 로그인할 수 있도록 아이디와 비밀번호의 최소 글자 수를 초과하면 로그인 버튼의 Opacity를 조정하였습니다. <br><br>

  + AJAX
    
　<table>
  <thead>
    <tr>
      <th align="center">OrderDetails</th>
      <th align="center">Cart</th>
    </tr>
  <tbody>
    <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/5bada663-7fbd-47e7-8e1f-ea348bff3071" width="500px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/af7a73e7-40f4-4a23-8f17-f6f53eea2831" width="500px;" alt=""/></td>
    <tr/>
  </tbody>
  </table>
    
  1. JavaScript의 fetch, @RestController 어노테이션 등을 활용하여 카트 기능을 구현했습니다.<br>


### Back-end
  + 상품 관련

  <table>
  <thead>
    <tr>
      <th align="center">상품 등록（Admin）</th>
      <th align="center">상품 상세/수정/삭제（Admin）</th>
      <th align="center">상품 목록 조회（User）</th>
      <th align="center">상품 상세（User）</th>
    </tr>
  <tbody>
    <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/ed3802b5-4154-4600-bb50-f3b1a623ee7b" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/d157e335-693b-4d75-97ef-98ba8efe78f5" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/615c5401-a8ac-428e-ae48-5ef80bd59336" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/5bada663-7fbd-47e7-8e1f-ea348bff3071" width="300px;" alt=""/></td>
     <tr/>
  </tbody>
  </table>


  관리자 페이지에서 상품, 사진, 재고 등을 DB, resource 폴더에 등록하고 클라이언트 페이지에서 해당 데이터를 읽는 형태입니다.<br>
    
  + 주문

  <table>
  <thead>
    <tr>
      <th align="center">회원 주문 페이지</th>
      <th align="center">회원 주문 페이지</th>
      <th align="center">회원 주문 페이지</th>
      <th align="center">회원 주문 페이지</th>
    </tr>
  <tbody>
    <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/c87ca19e-c70c-4eab-abeb-6b3c9467621f" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/62e3c23d-53e0-407b-821b-d5faf677370e" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/df9c0645-97ad-400a-8f44-d4d159dd3616" width="300px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/5bada663-7fbd-47e7-8e1f-ea348bff3071" width="300px;" alt=""/></td>
     <tr/>
  </tbody>
  </table>

  + 관리자 페이지

  <table>
  <thead>
    <tr>
      <th align="center">관리자 페이지</th>
      <th align="center">회원 목록</th>
      <th align="center">Q&A</th>
    </tr>
  <tbody>
    <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/6313fc23-a60f-43fd-9ab9-dd20bc4e58bd" width="400px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/6326ef40-2862-4ceb-9eac-4c34f761ef54" width="400px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/04ab0a49-fd69-492a-9e0d-e4380a47e0aa" width="400px;" alt=""/></td>
     <tr/>
  </tbody>
  </table>

　매출은 보류, 비회원 주문 목록은 아직 버그 문제로 소개하지 못했습니다. 아직 원인을 알 수 없어 추후에 해결하도록 하겠습니다.


  + 인증(Spring Interceptor)

  <table>
  <thead>
    <tr>
      <th align="center">User1의 회원정보 페이지</th>
      <th align="center">권한 외 요청</th>
      <th align="center">Log</th>
    </tr>
  <tbody>
    <tr>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/fe5ed579-cf5f-4f72-b6cb-7bdfd5b8cc43" width="400px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/daa040e4-beee-4bb7-8499-e37a04a98ed9" width="400px;" alt=""/></td>
      <td align="center"><img src="https://github.com/HyonHyonKOR/team-project/assets/134394081/96f6de73-f59e-4f45-a307-b57586af260d" width="400px;" alt=""/></td>
     <tr/>
  </tbody>
  </table>

  미인증 사용자의 요청은 회원 로그인 페이지로, 권한이 있는 회원의 요청은 404 오류 페이지를 반환하여 인증을 강화했습니다.<br>
  권한 외 요청이 있을 경우 log4j를 통해 WARN 로그를 남기도록 코드를 작성했습니다.<br>

  해결하지 못한 점 : 일부 페이지에서 Interceptor가 적용되지 않는 현상이 있어 향후 개선해보고자 합니다.<br>
<br/>                    

## 리팩토링
- 일부 페이지에서 Interceptor가 적용되지 않는 문제를 해결하기 위한 대안으로 Spring Security 6를 사용할 예정입니다.
  - 이에 따라 사용자 별 권한 부여를 위한 필드를 추가할 예정입니다.
- AWS에 배포할 예정입니다.
- 페이지 처리 버그 개선 예정입니다.
<br/>

## 참고자료
- 제품 사진 360장: https://www.coor.kr/
- 인덱스 페이지 이미지: https://unsplash.com/ko
- 로고: https://www.figma.com/
- Kakao Map API, Kakao 주소 API : https://developers.kakao.com/
- Sweetalert2: https://sweetalert2.github.io/
- SVG 및 폰트: https://fonts.google.com/








