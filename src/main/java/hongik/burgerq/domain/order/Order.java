package hongik.burgerq.domain.order;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Order {

    private long id;
    private PaymentType paymentType;
    private long orderNum;
    private LocalDateTime orderTime;
    private OrderStatus status;

}
