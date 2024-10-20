# ✨FashionOrderServer✨
- 옷 쇼핑몰 커머스 백엔드에 결제 모듈을 연동한 시스템
<br/>

# 목적
- 객체지향과 디자인패턴을 의미있게 적용
- 코드 가독성과 확장성을 고려하여 작성
- 대용량 트래픽 기반 안정성 있는 어플리케이션 개발
- 테스트 코드를 작성함으로써 안정성 있는 어플리케이션 개발
<br/>

# 사용 기술
- Java8.0
- Mysql
- SprigBoot
- Mybatis
<br/>

# 프론트 기획
- [로그인](https://www.figma.com/design/kavZDdrQUzP6ftz0oOp2dc/Fashion-order-server_Login?node-id=0-1&t=Oxn2DBu10TiLXQVZ-1)
- [회원가입](https://www.figma.com/design/d5yYDKdN9GuX5KTI8X2ITN/FashionOrderServer_Join?t=wSxGIkDKc7ufCNL9-1)
- [마이페이지](https://www.figma.com/design/1BiTFNqhh7w1EdyQTQ1TsV/FashionOrderServer_MyPage?t=wSxGIkDKc7ufCNL9-1) 
- [결제](https://www.figma.com/design/B7ba4NaoUF1PRHp0izxyab/Fashion-order-server_order?node-id=0-1&t=BJrkBo6pHgPrGR2b-1)
- [주문내역](https://www.figma.com/design/W7OslQMfmaoIgM2l1PpK99/Fashion-order-server_history?node-id=0-1&t=DtwA0kg7rcZVjF7I-1)
<br/>

# 주요 기능
## 💳결제방식
- 간편결제 토스페이먼츠
- 계정 타입에 따른 차등 할인률 제공
- 복합 결제 서비스 지원

## 👨👩로그인/계정 시스템
- 자체 로그인 / 카카오 로그인
- 아이디 / 비밀번호 찾기 기능 지원
- 유저 레벨 타입(General / VIP / VVIP)
    - General(일반 회원)
    - VIP(총 주문 금액 20만원 이상, 10% 할인)
    - VVIP(총 주문 금액 50만원 이상, 20% 할인)
    - 스케줄 서버 도입(주 1회 오전 2시 시작)
  
## 👚상품 관리
### 일반 유저
- 상품 조회
    - 신상품순
    - 낮은 가격순
    - 높은 가격순
    - 좋아요순
    - 찜 목록 조회
    - 장바구니 목록 조회
- 상품 문의(채팅, 메일)
- 회원 가입 / 탈퇴하기
- 아이디 / 비밀번호 찾기

### 관리자 기능
- 상품 등록
- 상품 삭제
- 상품 수정
- 정산하기

### 카테고리 관리
- Blouse
- Knit/Tee
- Outer
- Pants
- Skirts
- Dress
- Shoes

## ⏰알림 기능
- 결제 완료 시 금액과 상품명을 유저에게 문자 / 카카오로 알림

## ❤️장바구니/찜 기능
- 상품 장바구니에 담기 / 찜 최대 20개

## 📜주문내역 관리
- 취소 / 반품내역 조회
- 결제내역 조회
<br/>

# 시퀀스
- [검색](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=dGl0bGUg7Luk66i47IqkIOqygOyDiSDsi5ztgIDsiqQKClVzZXItPitXZWI6ABUJnoXroKUKYWN0aXZhdGUgVXNlcgpXZWItPitDb250cm9sbGVyOiDsobDtmoztlZjquLAgKOyjvOusuOuyiO2YuCwg7LCc66qp66GdLCDsnqXrsJTqtazri4gsIOy1nOyLoOyInCwg6riI7JWh7IicKQoKbm90ZSByaWdodCBvZiBXZWI6CmV4KSBHRVQge3t1cmx9fS9mYXNoaW9uLXNlcmV2ZXIvc2VhcmNoP3R5cGU9MwplbmQgbm90ZQoKAIEZCi0-K1NlcnZpY2U6IOyalOyyreyYqCDtjIzrnbzrr7jthLDrk6TsnYQAgUMHIERUT-2BtOuemOyKpOuhnCDrs4Dqsr0gCgA-By0-K0RCOiDsg4Htkogg7YWM7J2067iUAIIBBwpEQi0tPi0AZwoATgbshLHqs7UAOgktPi0AgjESAB4HIOydkeuLtQCBNQwtPi0AgxQFAIEaB-qysOqzvCDrsJjtmZggAIMNBlVzZXIAgzEJABIPZGUAgzsJV2ViAAMMAINOBQ&s=default)
- [단건 주문](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=dGl0bGUg7Luk66i47IqkIOyjvOusuCDshJzrsoQg64uo6rG0IOqysOygnCDsi5ztgIDsiqQKClVzZXItPitXZWI6ACwH67KI7Zi4LCDquIjslaEgCmFjdGl2YXRlIFVzZXIKV2ViLT4rVG9zc0FQSToASAmnhO2WiQpkZQAkCVdlYgpub3RlIHJpZ2h0IG9mIFdlYjoKZXgpCnsKICAgICJvcmRlcl9ubyI6IjEyMzQ1NjciLAAODHByaWNlIjoiMTAwMDAwABQIcHJvZHVjdF9uYW1lIjoiRmFzaGlvbl9UZWUiCn0KZW5kIG5vdGUKCgoAgRwHLT4rQ29udHJvbGxlcjogcmVkaXJlY3QgVVJJ66GcAIIICYq57J24IEFQSSDtmLjstpwAgT8MAIFmBwoKAD8KLT4rU2VydmljZQCBegkAgigH67CPAIJzCOqwgOuKpSDsg4Htg5wg7ZmV7J24AIIXDACBDgoKCgBHBy0-K0RCAIJMCpmE66OM7IucAINFCABYBYOB7ZKIIO2FjOydtOu4lCDrs4Dqsr0Agl4PREI6IApleCkgCjEuIOusvO2SiACECwcAgQ4IiJjrn4kg7LCo6rCQIAoyLgCEKQgATwox6rG0IOy2lOqwgAozABcJ64K07JetABAXAIJ3CQCDfwsAgiIHCgpEQi0AgiwMAIEyBiDshLHqs7UAhC8MREIAggYJAIMvDwCFNwgAIhEAXAgAgxcLAIVNCAAnDSDsnZHriwBhDQCCewsAhVcFVXMAWREg66y47J6QIO2ajOyLoACFVhAAhDsvi6TtjKgAhF4MAIRXEQCEURZsb2cg6riw66GdAIQtFwCCKQsAgWwNAGsGAIFnEgCFTwgAgxgTAIdgBS0AgXwOAEAHlYzrprwAh10MAIgRBQoKCgo&s=default)
- [복합 결제](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=dGl0bGUg7Luk66i47IqkIOyjvOusuCDshJzrsoQg67O17ZWpIOqysOygnCDsi5ztgIDsiqQKClVzZXItPitXZWI6ACwH67KI7Zi4LCDquIjslaEgCmFjdGl2YXRlIFVzZXIKV2ViLT4rVG9zc0FQSToASAmnhO2WiQpkZQAkCVdlYgpub3RlIHJpZ2h0IG9mIFdlYjoKZXgpCnsKICAgIFt7Im9yZGVyX25vIjoiMTIzNDU2NyIsABcFABMHcHJpY2UiOiIxMDAwMDAAFAhwcm9kdWN0X25hbWUiOiJGYXNoaW9uX1RlZSJ9ADkGAEcTOABEFjIAMycyIn0AgTAFXQp9CmVuZCBub3RlCgoAgX8HLT4rQ29udHJvbGxlcjogcmVkaXJlY3QgVVJJ66GcAIJrCYq57J24IEFQSSDtmLjstpwAgiIMAIJJBwoKAD8KLT4rU2VydmljZQCCXQkAgwsH67CPAINWCOqwgOuKpSDsg4Htg5wg7ZmV7J24AIJ6DACBDgoKCgBHBy0-K0RCAIMvCpmE66OM7IucAIQoCABYBYOB7ZKIIO2FjOydtOu4lCDrs4Dqsr0Ag0EPREI6IApleCkgCjEuIOusvO2SiACEbgcAgQ4IiJjrn4kg7LCo6rCQIAoyLgCFDAgATwrstpTqsIAKMwASCeuCtOyXrQAQEgCCbAkAhFgLAIIYBwoKREItAIIiDACBKAYg7ISx6rO1AIUIDERCAIF8CQCDJQ8AhhAIACIRAFwIAIMNCwCGJggAJw0g7J2R64sAYQ0AgnELAIYwBVVzAFkRIOusuOyekCDtmozsi6AAhi8QAIQxL4uk7YyoAIRUDACETREAhEcWbG9nIOq4sOuhnQCEIxcAgikLAIFsDQBrBgCBZxIAhUUIAIMXFACIOgUtAIF9DgBBB5WM66a8AIg3DACIawU&s=default)
