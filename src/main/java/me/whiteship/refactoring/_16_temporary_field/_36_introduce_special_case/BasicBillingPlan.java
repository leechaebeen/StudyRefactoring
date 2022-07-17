package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case;

/**
 * 냄새 16. 임시 필드 Temporary Field
 * - 클래스에 있는 어떤 필드가 특정한 경우에만 값을 찾는 경우.
 * - 어떤 객체의 필드가 "특정한 경우에만" 값을 가진다는 것을 이해하는 것은 일반적으로 예상하기 못하기 때문에 이해하기 어렵다.
 * - 관련 리팩토링
 *   - "클래스 추출하기(Extract Class)" 를 사용해 해당 변수들을 옮길 수 있다.
 *   - "함수 옮기기(Move Function)" 을 사용해서 해당 변수를 사용하는 함수를 특정 클래스로 옮길 수 있다.
 *   - "특이 케이스 추가하기(Introduce Special Case)" 를 적용해 "특정한 경우"에 해당하는 클래스를 만들어 해당 조건을 제거할 수 있다.
 * */
public class BasicBillingPlan extends BillingPlan {
}
