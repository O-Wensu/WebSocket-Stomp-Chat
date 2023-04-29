package com.example.messagingstompwebsocket.repository;


import com.example.messagingstompwebsocket.entity.ChatRoom;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChatRoomRepository extends JpaRepository<ChatRoom, Long> {
    Optional<ChatRoom> findByRoomId(String roomId);

    Optional<ChatRoom> findByHostAndGuest(String host, String guest);

    void deleteByRoomId(String roomId);

//    List<ChatRoom> findAllByHostIdOrGuestIdOrderByModifiedAtDesc(Long hostId, Long guestId);
}
