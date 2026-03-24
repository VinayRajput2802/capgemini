package org.cg.repo;

import org.cg.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILoginRepo extends JpaRepository<Login,String> {
}
