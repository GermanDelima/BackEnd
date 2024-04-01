
package com.portfolio.jgd.repositories;

import com.portfolio.jgd.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long>{

}
