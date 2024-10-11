package hongik.burgerq.infrastructure.jpaEntity;

import hongik.burgerq.domain.order.Order;
import hongik.burgerq.domain.order.OrderStatus;
import hongik.burgerq.domain.order.PaymentType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderJpaEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private PaymentType paymentType;
    private long orderNum;
    private LocalDateTime orderTime;
    private OrderStatus status;

    public Order toDomain() {
        return Order.builder()
                .id(id)
                .paymentType(paymentType)
                .orderNum(orderNum)
                .orderTime(orderTime)
                .status(status)
                .build();
    }

    public static OrderJpaEntity from(Order order) {
        return OrderJpaEntity.builder()
                .id(order.getId())
                .paymentType(order.getPaymentType())
                .orderNum(order.getOrderNum())
                .orderTime(order.getOrderTime())
                .status(order.getStatus())
                .build();
    }
}
