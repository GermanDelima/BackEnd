
package com.portfolio.jgd.repositories;

import com.portfolio.jgd.models.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EducationRepository extends JpaRepository<Education, Long>{

}
