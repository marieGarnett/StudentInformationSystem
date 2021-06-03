USE [SIS]


GO

SET ANSI_NULLS ON


GO

SET QUOTED_IDENTIFIER ON


GO

IF OBJECT_ID('viewAdmissions') IS NOT NULL DROP VIEW viewAdmissions


GO

CREATE VIEW [dbo].[viewAdmissions] AS

SELECT admission.Admission_ID AS 'Admission ID', CONCAT(Surname, ', ', Firstname, ' ', Middlename) AS 'Name of Candidate', CourseName AS 'Desired Course', Department
FROM department JOIN course
	ON department.Department_ID = course.Department_ID JOIN admission
		ON course.Course_ID = admission.Course_ID
WHERE IsEnrolled = 0


GO