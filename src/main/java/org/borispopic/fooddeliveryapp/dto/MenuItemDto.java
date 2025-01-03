package org.borispopic.fooddeliveryapp.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class MenuItemDto {
    private String id;
    private String name;
    private BigDecimal price;
}
