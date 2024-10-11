package hongik.burgerq.domain.order;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum OrderStatus {
    YET("주문 접수"),
    ING("조리 중"),
    DONE("조리 완료");

    private final String korName;
}
