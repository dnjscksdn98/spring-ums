# user management system &lt;회원 관리 시스템>

### 데이터베이스 액세스 방법 : Mybatis

- 사용 데이터베이스 : Oracle

- 사용 이유

  JDBC를 통해 데이터베이스에 엑세스하는 작업을 캡슐화하고 일반 SQL 쿼리, 
  저장 프로 시저 및 고급 매핑을 지원하며 모든 JDBC 코드 및 매개 변수의 중복작업을 제거할 수 있기 있음
  
### 스프링 구조 : MVC 구조

- 구조

  1. 컨트롤로에서 요청을 매핑하고 해당 Service 호출
  2. Service가 관련 Dao 함수를 호출
  3. Dao 함수가 sqlSession으로 데이터베이스에 접속후 해당 요청 처리 진행
  4. 요청 처리 후 컨트롤러가 해당 뷰로 렌더링 진행
  
### 기능

- 회원 목록 조회
- 회원 상세 정보 조회
- 회원 삭제
- 회원 정보 수정