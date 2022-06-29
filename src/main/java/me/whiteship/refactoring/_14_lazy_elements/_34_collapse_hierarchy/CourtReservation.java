package me.whiteship.refactoring._14_lazy_elements._34_collapse_hierarchy;

/**
 * 냄새 14. 성의 없는 요소 Lazy Element
 * - 여러 프로그래밍적인 요소(변수, 메소드, 클래스 등)를 만드는 이유
 *      - 나중에 발생할 변화를 대비해서...
 *      - 해당 함수 또는 클래스를 재사용하려고...
 *      - 의미있는 이름을 지어주려고...
 *  - 가끔 그렇게 예상하고 만들어 놓은 요소들이 기대에 부응하지 못하는 경우가 있는데 그런 경우에 해당 요소들을 제거해야 한다.
 *  - 관련 리팩토링 기술
 *      - "함수 인라인(Inline Function)"
 *      - "클래스 인라인(Inline Class)"
 *      - 불필요한 상속 구조는 "계층 합치기(Callapse Hierarchy)"를 사용할 수 있다.
 * */

import java.time.LocalDateTime;
import java.util.List;

/**
 * 리팩토링 34.계층 합치기 Collapse Hierarchy
 * - 상속 구조를 리팩토링 하는 중에 기능을 올리고 내리다 보면 하위 클래스와 상위클래스 코드에
 *   차이가 없는 경우가 발생할 수 있다. 그런 경우에 그 둘을 합칠 수 있다.
 * - 하위클래스와 상위클래스 중에 어떤 것을 없애야 하는가?
 *   (둘 중에 보다 이름이 적절한 쪽을 선택하지만, 애매하다면 어느 쪽을 선택해도 문제없다.)
 *
 * */
public class CourtReservation extends Reservation {

    private String courtNumber;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;
    private List<String> members;
    private String owner;
    private boolean paid;
}
