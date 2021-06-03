USE SIS


GO

IF OBJECT_ID('spViewCourseDescription') IS NOT NULL DROP PROCEDURE[spViewCourseDescription]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spViewCourseDescription @Course VARCHAR(150)
AS

	
	SELECT department.Department, course.Description
	FROM department JOIN course
	ON department.Department_ID = course.Department_ID
	WHERE course.CourseName = @Course


GO
