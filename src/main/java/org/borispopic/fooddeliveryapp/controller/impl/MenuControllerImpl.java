package org.borispopic.fooddeliveryapp.controller.impl;

import lombok.AllArgsConstructor;
import org.borispopic.fooddeliveryapp.controller.MenuController;
import org.borispopic.fooddeliveryapp.domain.MenuItem;
import org.borispopic.fooddeliveryapp.dto.MenuItemDto;
import org.borispopic.fooddeliveryapp.mappers.MenuDtoMenuMapper;
import org.borispopic.fooddeliveryapp.service.MenuService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/menu/")
@AllArgsConstructor
public class MenuControllerImpl implements MenuController {

    private MenuService menuService;
    private MenuDtoMenuMapper menuDtoMenuMapper;

    @GetMapping(path = "get/all")
    @Override
    public ResponseEntity<List<MenuItemDto>> getAllManuItems() {

        List<MenuItem> allMenuItems = menuService.getAllMenuItems();

        List<MenuItemDto> list = allMenuItems.stream().map(menuDtoMenuMapper::menuItemToMenuItemDtoMapping)
                .toList();

        return ResponseEntity.ok(list);
    }
}
