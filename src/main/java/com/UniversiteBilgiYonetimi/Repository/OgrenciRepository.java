package com.UniversiteBilgiYonetimi.Repository;

import com.UniversiteBilgiYonetimi.Model.Ders;
import com.UniversiteBilgiYonetimi.Model.Ogrencı;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OgrenciRepository  extends JpaRepository<Ogrencı, Long>  {
}
