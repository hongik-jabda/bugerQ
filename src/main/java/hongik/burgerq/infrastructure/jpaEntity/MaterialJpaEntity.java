package hongik.burgerq.infrastructure.jpaEntity;

import hongik.burgerq.domain.material.Material;
import hongik.burgerq.domain.material.UnitType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MaterialJpaEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;
    private UnitType unitType;

    public Material toDomain(){
        return Material.builder()
                .id(id)
                .name(name)
                .price(price)
                .unitType(unitType)
                .build();
    }

    public static MaterialJpaEntity from(Material material){
        return MaterialJpaEntity.builder()
                .id(material.getId())
                .name(material.getName())
                .price(material.getPrice())
                .unitType(material.getUnitType())
                .build();
    }
}
