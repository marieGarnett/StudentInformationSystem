USE SIS


GO


IF OBJECT_ID('viewStudents') IS NOT NULL DROP VIEW viewStudents


GO

SET ANSI_NULLS ON


GO

SET QUOTED_IDENTIFIER ON


GO

CREATE VIEW viewStudents AS

SELECT student.Student_ID AS 'Student ID', CONCAT(Surname, ', ', Firstname, ' ', Middlename) AS 'Student', CourseName AS 'Course', Department AS 'Department'
FROM student INNER JOIN admission
ON admission.Admission_ID = student.Admission_ID INNER JOIN course
	ON course.Course_ID = admission.Course_ID INNER JOIN department
		ON department.Department_ID = course.Department_ID
WHERE admission.IsEnrolled = CONVERT(bit, 1) and student.IsActive = CONVERT(bit, 1)


GO
