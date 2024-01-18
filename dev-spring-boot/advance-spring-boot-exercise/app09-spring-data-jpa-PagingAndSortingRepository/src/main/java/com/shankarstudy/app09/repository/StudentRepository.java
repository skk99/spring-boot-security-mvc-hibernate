package com.shankarstudy.app09.repository;

import com.shankarstudy.app09.bean.Student;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends PagingAndSortingRepository<Student, String> {


}
