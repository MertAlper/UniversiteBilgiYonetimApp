package com.UniversiteBilgiYonetimi.Repository;

import com.UniversiteBilgiYonetimi.Model.Ogrenci;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OgrenciRepository  extends JpaRepository<Ogrenci, Long>  {




}
