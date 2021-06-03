USE SIS


GO

IF OBJECT_ID('spAddCourse') IS NOT NULL DROP PROCEDURE spAddCourse
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAddCourse @Department VARCHAR(50), @CourseName VARCHAR(50), @Description VARCHAR(200)
AS

DECLARE @Department_Id INT

SELECT @Department_Id = Department_ID
FROM department
WHERE Department = @Department

INSERT INTO course(Department_ID, CourseName, [Description])
VALUES(@Department_Id, @CourseName, @Description)


GO
