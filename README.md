![image](https://github.com/SlackClone-v/slack_BE/assets/107148237/6ca4290b-f690-41d2-938a-b4d4c3f9733c) 

# slack_BE
Slack을 클론코딩하는 **BackEnd** 프로젝트입니다.

## 1. 스택

프론트엔드
- Next.js

백엔드
- Spring Boot 3.0.2
- jdk 17
- Gradle
- Spring Data JPA(Hibernate)
- Mysql
- Lombok

## 2. 서버스택
> Https 적용 + 도메인

백엔드
- EC2, ECS

프론트엔드
- S3 + cloud font + Route 53

  
## 3. 프로젝트 구조
> DDD(Domain-Driven Design)에 맞추어 설계를 하였습니다.
```javascript
.
├── HELP.md
├── README.md
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── settings.gradle
└── src
    ├── main
    │   ├── generated
    │   ├── java
    │   │   └── com
    │   │       └── spring
    │   │           └── slackClone
    │   │               ├── SlackCloneApplication.java
    │   │               ├── application
    │   │               │   ├── channel
    │   │               │   │   └── ChannelController.java
    │   │               │   ├── message
    │   │               │   │   └── MessageController.java
    │   │               │   └── user
    │   │               │       └── UserController.java
    │   │               ├── domain
    │   │               │   ├── channel
    │   │               │   ├── message
    │   │               │   └── user
    │   │               │       ├── domain
    │   │               │       │   └── User.java
    │   │               │       ├── entity
    │   │               │       │   └── UserEntity.java
    │   │               │       ├── mapper
    │   │               │       │   └── UserMapper.java
    │   │               │       ├── repository
    │   │               │       │   └── UserRepository.java
    │   │               │       └── service
    │   │               │           └── UserService.java
    │   │               ├── infrastructure
    │   │               │   ├── persistence
    │   │               │   └── security
    │   │               │       └── SecurityConfig.java
    │   │               └── interfaces
    │   │                   ├── channel
    │   │                   │   └── ChannelRequestDto.java
    │   │                   ├── message
    │   │                   │   └── MessageRequestDto.java
    │   │                   └── user
    │   │                       ├── UserRequestDto.java
    │   │                       └── UserResponseDto.java
    │   └── resources
    │       └── application.properties
    └── test

```

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
## 4. 프로젝트 범위


## 5. ERD
<img width="607" alt="ERD" src="https://github.com/instagramClone-v/instagram_BE/assets/107148237/066c8ab3-2911-4b8c-96b9-8d998a7cce14">
