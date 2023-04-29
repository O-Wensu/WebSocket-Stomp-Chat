package com.example.messagingstompwebsocket.repository;

import com.example.messagingstompwebsocket.entity.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {
}
