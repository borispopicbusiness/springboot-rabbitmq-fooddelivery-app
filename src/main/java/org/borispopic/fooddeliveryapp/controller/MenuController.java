package org.borispopic.fooddeliveryapp.controller;

import org.borispopic.fooddeliveryapp.dto.MenuItemDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface MenuController {
    ResponseEntity<List<MenuItemDto>> getAllManuItems();
}
