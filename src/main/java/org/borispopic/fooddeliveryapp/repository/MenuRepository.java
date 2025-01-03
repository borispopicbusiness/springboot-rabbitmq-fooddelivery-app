package org.borispopic.fooddeliveryapp.repository;

import org.borispopic.fooddeliveryapp.entity.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MenuRepository extends JpaRepository<MenuEntity, UUID> {
}
