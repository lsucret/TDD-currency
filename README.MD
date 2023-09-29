화폐 예제
----------------

테스트 목록
- [ ] $5 + 10CHF = $10(환율이 2 : 1일 경우) ->  환율 전환
  - [ ] $5 + $5 = $10 -> 더하기의 작은 테스트
  - [ ] $5 + $5 에서 Money 반환하기
  - [x] Bank.reduce(Money) -> 다형성 지원(Sum,Money) 테스트
  - [ ] Money에 대한 통화 변환을 수행하는 Reduce
  - [ ] Reduce(Bank, String)
- [x] 5 dollar * 2 = 10 dollar -> 갯수에 따른 금액 계산
- [x] amount를 private으로 만들기
- [x] Dollar의 부작용
- [ ] Money의 반올림 
- [x] equals()
- [ ] hasCode()
- [ ] Equal null 을 대처
- [ ] Equal object 를 대처
- [x] 5CHF * 2 = 10 CHF -> 다른 화폐 적용
- [x] 공용 equals
- [x] 공용 times
- [x] Franc과 Dollar 비교하기
- [x] 통화 구현
- [x] testFrancMultiplication 제거