USE SIS


GO

IF OBJECT_ID('spViewSpecificCandidate') IS NOT NULL DROP PROCEDURE spViewSpecificCandidate
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spViewSpecificCandidate @name VARCHAR(50)
AS

SELECT CONCAT(Surname, ', ', Firstname, ' ', Middlename) AS Name,  Gender, CourseName AS Course, Department
FROM department JOIN course
ON department.Department_ID = course.Department_ID JOIN admission
ON course.Course_ID = admission.Course_ID
WHERE CONCAT(Surname, ', ', Firstname, ' ', Middlename) = @name


GO

