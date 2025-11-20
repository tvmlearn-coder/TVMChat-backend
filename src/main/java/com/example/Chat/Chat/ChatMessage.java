package com.example.Chat.Chat;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {

    private MessageType type;
    private String content;
    private String sender;

    public enum MessageType
    {
        CHAT,
        JOIN,
        LEAVE
    }

}
