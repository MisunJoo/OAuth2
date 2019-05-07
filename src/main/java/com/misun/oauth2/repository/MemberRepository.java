package com.misun.oauth2.repository;

import com.misun.oauth2.domain.Member;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
}
