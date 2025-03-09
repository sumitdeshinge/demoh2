package com.myspring.demo.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.myspring.demo.model.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
	Optional<Member> findByName(String name);
	Optional<Member> findByEmail(String email);
	Optional<Member> findByPhone(String phone);
}
