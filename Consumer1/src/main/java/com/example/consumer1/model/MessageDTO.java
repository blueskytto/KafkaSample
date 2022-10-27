package com.example.consumer1.model;

import lombok.*;

import java.io.Serializable;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class MessageDTO implements Serializable {

    private static final long serialVersionUID = -5215229114978824155L;

    private long id = 0;
    private String sender = "";
    private String contents = "";
}
