# ✨Fashion-order-server✨
- 옷 쇼핑몰 커머스 백엔드에 결제 모듈을 연동한 시스템
<br/>

# 목적
- 객체지향과 디자인패턴을 의미있게 적용
- 코드 가독성과 확장성을 고려하여 작성
- 대용량 트래픽 기반 안정성 있는 어플리케이션 개발
<br/>

# 사용 기술
- Java8.0
- Mysql
- SprigBoot
- Mybatis
<br/>

# 기획
- 로그인: https://www.figma.com/design/kavZDdrQUzP6ftz0oOp2dc/Fashion-order-server_Login?node-id=0-1&t=Oxn2DBu10TiLXQVZ-1
- 결제: https://www.figma.com/design/B7ba4NaoUF1PRHp0izxyab/Fashion-order-server_order?node-id=0-1&t=BJrkBo6pHgPrGR2b-1
- 주문내역: https://www.figma.com/design/W7OslQMfmaoIgM2l1PpK99/Fashion-order-server_history?node-id=0-1&t=DtwA0kg7rcZVjF7I-1
<br/>

# 주요 기능
## 💳결제방식
- 간편결제 토스페이먼츠
- 계정 타입에 따른 차등 할인률 제공
- 복합 결제 서비스 지원

## 👨👩로그인/계정 시스템
- 자체 로그인 / 카카오 로그인
- 비밀번호 찾기 기능 지원
- 계정 타입(General, VIP, VVIP)
  
## 👚상품 관리
### 일반 유저
- 상품 조회
- 상품 문의(채팅, 메일)

### 관리자 기능
- 상품 등록
- 상품 삭제
- 상품 수정

### 카테고리 관리
- Blouse
- Knit/Tee
- Outer
- Pants
- Skirts
- Dress
- Shoes

## 👀상품 검색
- 신상품순
- 낮은 가격순
- 높은 가격순
- 좋아요순

## ⏰알림 기능
- 결제 완료 시 금액과 상품명을 유저에게 메일 / 문자 / 카카오로 알림

## ❤️장바구니/찜 기능
- 상품 장바구니에 담기 / 찜 최대 20개

## 📜주문내역 관리
- 취소 / 반품내역 조회
- 결제내역 조회
