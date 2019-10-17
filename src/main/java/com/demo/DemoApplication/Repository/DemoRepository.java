package com.demo.DemoApplication.Repository;

import com.demo.DemoApplication.Model.DemoModelTS;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<DemoModelTS,Integer> {
}
