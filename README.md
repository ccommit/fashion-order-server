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

# 기획
- 로그인: https://www.figma.com/design/kavZDdrQUzP6ftz0oOp2dc/Fashion-order-server_Login?node-id=0-1&t=Oxn2DBu10TiLXQVZ-1
- 회원가입:
- 마이페이지: 
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
- [검색](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=dGl0bGUg7Luk66i47IqkIOqygOyDiSDsi5ztgIDsiqQKClVzZXItPitXZWI6IApXZWItPitDb250cm9sbGVyOiDsobDtmoztlZjquLAo7KO866y467KI7Zi4LCDssJzrqqnroZ0sIOyepeuwlOq1rOuLiCwg7LWc7Iug7IicLCDquIjslaHsiJwpCgpub3RlIHJpZ2h0IG9mIFdlYjoKZXgpIEdFVCB7e3VybH19L2Zhc2hpb24tc2VyZXZlci9zZWFyY2g_dHlwZT0zCmVuZCBub3RlCgoAgRgKLT4rU2VydmljZTog7JqU7LKt7JioIO2MjOudvOuvuO2EsOuTpOydhACBQgcgRFRP7YG0656Y7Iqk66GcIOuzgOqyvSAKAD4HLT4rREI6IOyDge2SiCDthYzsnbTruJQAggAHCkRCLS0-LQBnCgBOBuyEseqztQA6CS0-LQCCMBIAHQgAgS8LLT4tAIJxBQA4DgCCfgVVcwApESDsnZHri7UKCg&s=default)
- [단건 주문](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=dGl0bGUg7Luk66i47IqkIOyjvOusuCDshJzrsoQg64uo6rG0IOqysOygnCDsi5ztgIDsiqQKClVzZXItPitXZWI6ACwH67KI7Zi4LCDquIjslaEgCldlYi0-LVRvc3NBUEk6ADoJp4TtlokKbm90ZSByaWdodCBvZiBXZWI6CmV4KQp7CiAgICAib3JkZXJfbm8iOiIxMjM0NTY3IiwADgxwcmljZSI6IjEwMDAwMAAUCHByb2R1Y3RfbmFtZSI6IkZhc2hpb25fVGVlIgp9CmVuZCBub3RlCgoAgQwHLT4rQ29udHJvbGxlcjogcmVkaXJlY3QgVVJJ66GcAIFqCYq57J24IEFQSSDtmLjstpwKACsKLT4tU2VydmljZQCBVgkAgXYH67CPAIJBCOqwgOuKpSDsg4Htg5wg7ZmV7J24CgAwBy0-K0RCAIIRCpmE66OM7IucAIJ8CABBBYOB7ZKIIO2FjOydtOu4lCDrs4Dqsr0KREItAHMMABAGIOyEseqztQCCTw9EQjogCmV4KSAKMS4g66y87ZKIAINfBwCBFAiImOufiSDssKjqsJAgCjIuAIN9CABsCjHqsbQg7LaU6rCACjMAFwnrgrTsl60AEBcAgmgJAIFlCC0-LQCCZQwAhEwIAIEtBgCCSwstPi0AhFIFABQNIOydkeuLtQCEUAZVcwAwEeyLnCDrrLjsnpAg7ZqM7IugAINdCwBqDQCDUBiLpO2MqACDUBgrAINfCWxvZyDquLDroZ0AgUwMAIEjDQBFBQCFeAcAgRwOAF4GAIFDBwoKCgoKCg&s=default)
- [복합 결제](https://www.websequencediagrams.com/cgi-bin/cdraw?lz=dGl0bGUg7Luk66i47IqkIOyjvOusuCDshJzrsoQg67O17ZWpIOqysOygnCDsi5ztgIDsiqQKClVzZXItPitXZWI6ACwH67KI7Zi4LCDquIjslaEgCldlYi0-K1Rvc3NBUEk6ADoJp4TtlokKbm90ZSByaWdodCBvZiAAQQUKZXgpIAp7CiAgICBbeyJvcmRlcl9ubyI6IjEyMzQ1NjciLAAXBQATB3ByaWNlIjoiMTAwMDAwABQIcHJvZHVjdF9uYW1lIjoiRmFzaGlvbl9UZWUifQA5BgBHEzgARBYyADMnMiJ9AIEwBV0KfQplbmQgbm90ZQoKAIFyBy0-K0NvbnRyb2xsZXI6IHJlZGlyZWN0IFVSSeuhnACCUAmKueyduCBBUEkg7Zi47LacCgArCi0-K1NlcnZpY2UAgjwJAIJcB-uwjwCDEQmDge2DnCDtmZXsnbgKACkHLT4rREIAgnEJ67CPACIFkogg7YWM7J2067iUIOuzgOqyvQpEQi0tPi0AXgkAEAYg7ISx6rO1AEUJLT4tAIE_DACEDAgAHwYAgSULLT4tAIQSBQATDgCECgVVcwApESDsnZHri7UAgiYLAFkNAIIZGIuk7YyoAIIPImxvZyDquLDroZ0AgikFcmV0cnkAhUUJnqzsi5zrj4QAgVYMAIEtDQBgBQCFQwYtAIEtDgB5BgCBNAc&s=default)
