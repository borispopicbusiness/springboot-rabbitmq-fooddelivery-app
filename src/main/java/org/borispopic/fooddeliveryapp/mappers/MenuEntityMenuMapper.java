package org.borispopic.fooddeliveryapp.mappers;

import org.borispopic.fooddeliveryapp.domain.MenuItem;
import org.borispopic.fooddeliveryapp.entity.MenuEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MenuEntityMenuMapper {
    MenuEntity manuItemToMenuEntityMapping(MenuItem menu);
    MenuItem menuEntityToManuItemMapping(MenuEntity menuEntity);
}
