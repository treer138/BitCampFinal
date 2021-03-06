package kr.or.bit.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import kr.or.bit.model.Member;

/*
*
* @date: 2019. 6. 21.
*
* @author: 이힘찬 
*
* @description: MemberDao 
* 
*/
public interface MemberDao {
  void insertMember(Member member);

  void updateMember(Member member);

  void deleteMember(String username);
  
  void updateMemberWithoutFile(Member member);
  
  void updateMemberOnlyFile(Member member);

  List<Member> selectAllMembers();

  List<Member> selectStudentsList(int course_id);
  
  Member selectMemberByUsername(String username);
  
  void insertNewCourseMembers(@Param("people") int people, @Param("teacher_id") int teacher_id, @Param("course_id") int course_id, @Param("start_date") Date start_date, @Param("password") String password);
  
  List<Member> selectAllMembersByMycourse(int course_id);
  
  List<Member> selectStudent();
  
  void updateMemberGraduate(Member member);
  
  void insertTeacher(Member member);
  
  int getCountCourseMember(@Param("courseid") int courseid, @Param("status") String status);
  
  List<Member> selectMemberSearchByAjax(@Param("course_id") int course_id, @Param("role") String role, @Param("enabled") int enabled);
  
  int countMemberSearchByAjax(@Param("course_id") int course_id, @Param("role") String role, @Param("enabled") int enabled);
  
  void updateEnabled(Member member);
  
  List<Member> selectAllStudent();
  
  void updateTeacherCourseId(Member member);
  
  List<Member> selectAllMembersByCourseId(int course_id);
}
