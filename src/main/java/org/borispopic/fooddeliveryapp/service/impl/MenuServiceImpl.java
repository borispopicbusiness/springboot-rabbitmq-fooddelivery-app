package org.borispopic.fooddeliveryapp.service.impl;

import lombok.AllArgsConstructor;
import org.borispopic.fooddeliveryapp.domain.MenuItem;
import org.borispopic.fooddeliveryapp.entity.MenuEntity;
import org.borispopic.fooddeliveryapp.mappers.MenuEntityMenuMapper;
import org.borispopic.fooddeliveryapp.repository.MenuRepository;
import org.borispopic.fooddeliveryapp.service.MenuService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class MenuServiceImpl implements MenuService {

    private MenuRepository menuRepository;
    private MenuEntityMenuMapper menuEntityMenuMapper;

    @Override
    public List<MenuItem> getAllMenuItems() {

        List<MenuEntity> allMenuItems = menuRepository.findAll();

        var result = allMenuItems.stream()
                .map(menuEntityMenuMapper::menuEntityToManuItemMapping)
                .toList();

        return result;
    }
}
