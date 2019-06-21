package kr.or.bit.dao;

import kr.or.bit.model.Course;

/*
*
* @date: 2019. 06. 21.
*
* @author: 권예지
*
* @description: CourseDao를 통해서 Course CRUD를 이용한다
* 
*/
public interface CourseDao {
  void insertCourse(Course course);

  void updateCourse(int id); // CourseDTO의 id

  void deleteCourse(int id);

  void selectAllCourse(int page);
}