package org.borispopic.fooddeliveryapp.domain;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class MenuItem {
    private String id;
    private String name;
    private BigDecimal price;
}
