package hongik.burgerq.infrastructure.jpaEntity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class RecommendMenuJpaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // selectedProduct: 고객이 구매하려고 하는 상품
    @ManyToOne
    @JoinColumn(name = "selectedProduct_id")  // selectedProduct 외래 키
    private ProductJpaEntity selectedProduct;

    // recommendProduct: 추천되는 상품
    @ManyToOne
    @JoinColumn(name = "recommendProduct_id")  // recommendProduct 외래 키
    private ProductJpaEntity recommendProduct;
}
