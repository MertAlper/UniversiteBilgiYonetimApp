package com.UniversiteBilgiYonetimi.Repository;

import com.UniversiteBilgiYonetimi.Model.Bolum;
import com.UniversiteBilgiYonetimi.Model.Ders;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DersRepository  extends JpaRepository<Ders, Long> {


}
