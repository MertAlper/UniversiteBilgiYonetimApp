package com.UniversiteBilgiYonetimi.Repository;

import com.UniversiteBilgiYonetimi.Model.Ders;
import com.UniversiteBilgiYonetimi.Model.Notlar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotlarRepositroy  extends JpaRepository<Notlar, Long>  {
}
