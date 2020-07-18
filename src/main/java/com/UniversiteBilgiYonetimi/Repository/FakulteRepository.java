package com.UniversiteBilgiYonetimi.Repository;

import com.UniversiteBilgiYonetimi.Model.Fakulte;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface FakulteRepository extends JpaRepository<Fakulte, Long> {


    @Query("select fak   from Fakulte fak  where  fak.id=:id")
    public  Fakulte findFakulte(@Param("id") long id);


}
