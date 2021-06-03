USE SIS


GO

IF OBJECT_ID('spViewSpecificCourse') IS NOT NULL DROP PROCEDURE spViewSpecificCourse
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spViewSpecificCourse @courseName VARCHAR(50)
AS

SELECT DISTINCT c.CourseName AS Course, c.[Description], d.Department
FROM department d JOIN course c ON d.Department_ID = c.Department_ID
WHERE c.CourseName = @courseName


GO

