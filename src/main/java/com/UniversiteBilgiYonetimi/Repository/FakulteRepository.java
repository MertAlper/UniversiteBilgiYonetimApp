package com.UniversiteBilgiYonetimi.Repository;

import com.UniversiteBilgiYonetimi.Model.Fakulte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface FakulteRepository extends JpaRepository<Fakulte, Long> {

    @Query("select fak   from Fakulte fak  where  fak.fakulteId=:id")
    public  Fakulte findFakulte(@Param("id") long id);


}
