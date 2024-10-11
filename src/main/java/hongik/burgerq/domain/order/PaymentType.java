package hongik.burgerq.domain.order;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PaymentType {
    CASH("현금"),
    CARD("카드"),
    MOBILE("모바일 페이");

    private final String korName;
}
