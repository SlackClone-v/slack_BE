![image](https://github.com/instagramClone-v/instagram_BE/assets/107148237/63a86cbd-19a2-4fb2-8f59-78e2fe9aeae4)

# instagramClone_BE
인스타그램 클론코딩 **BackEnd** 프로젝트입니다.

## 스택

프론트엔드: React, React-Query, Recoil,

백엔드: Spring Boot, Spring JPA

## 서버스택

백엔드: EC2, ECS

프론트엔드: S3 + cloud font + Route 53

https 적용 + 도메인

## 프로젝트 범위
- 게시물 CRUD
- 게시물 좋아요
- 게시물 댓글

## 프로젝트 구조
![Untitled](https://github.com/instagramClone-v/instagram_BE/assets/107148237/7cf1b20e-2592-4c6a-8d43-8be2aad61bda)

- **Web Layer**
    - 흔히 사용하는 컨트롤러 (@Controller) 와 JSP/Freemarker등의 뷰 템플릿 영역
- **Service Layer**
    - @Sercive에 사용되는 서비스 영역
    - Controller와 Dto의 중간 영역에서 사용
    - @Transactional이 사용되어야하는 영역
- **Repository Layer**
    - 데이터베이스와 같이 데이터 저장소에 접근하는 영역
- **Domain Model**
    - 도메인(개발 대상)을 모든 사람이 동일한 관점에서 이해할수있고 공유할 수 있도록 단순환 시킨것
    - 택시 앱이라고 하면 배차 탑승 요금 등이 도메인
    - @Entity가 사용되는 영역(JPA, 테이블과 1:1매칭)
- **Dtos**
    - 계층 간의 데이터 교환을 위한 객체 (Data Transfer Object)

```markdown
Domain (DB의 테이블과 1:1 매칭 될 Entity Class)
Repository (DB에 접근해 도메인 객체를 DB에 저장하고 관리해주는 영역)
Service (핵심 비즈니스 로직 구현, Transactional)
Controller (해당 요청 url에 따라 적절하게 응답 - MVC 모델에서는 적절한 view와 mapping, RestController의 경우 적절한 ResponseEntity(DTO)를 body에 담아 Client에 반환, service의 메서드를 이용함)
```

- 해당 사항에 따른 폴더구조

```markdown
├── domain
	 ├── entity
   └── repository
├── service
└── web
    ├── controller
    └── dto
```

## ERD
<img width="607" alt="ERD" src="https://github.com/instagramClone-v/instagram_BE/assets/107148237/066c8ab3-2911-4b8c-96b9-8d998a7cce14">
