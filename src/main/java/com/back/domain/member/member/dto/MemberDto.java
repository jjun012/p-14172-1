package com.back.domain.member.member.dto;

import com.back.domain.member.member.entity.Member;
import com.back.domain.post.post.entity.Post;

import java.time.LocalDateTime;

public record MemberDto(
        int id,
        String username,
        String password,
        String name
) {

    public MemberDto(Member member) {
        this(
                member.getId(),
                member.getUsername(),
                member.getPassword(),
                member.getName()
        );
    }
}