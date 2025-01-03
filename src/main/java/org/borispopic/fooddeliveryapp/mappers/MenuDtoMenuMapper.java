package org.borispopic.fooddeliveryapp.mappers;

import org.mapstruct.Mapper;

import org.borispopic.fooddeliveryapp.dto.MenuItemDto;
import org.borispopic.fooddeliveryapp.domain.MenuItem;

@Mapper(componentModel = "spring")
public interface MenuDtoMenuMapper {
    MenuItemDto menuItemToMenuItemDtoMapping(MenuItem menu);
    MenuItem menuItemDtoToMenuItemMapping(MenuItemDto menuItemDto);
}
