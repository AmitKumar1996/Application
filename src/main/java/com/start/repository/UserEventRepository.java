package com.start.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.start.entity.UserEvent;

public interface UserEventRepository  extends JpaRepository<UserEvent, Integer>{

}
