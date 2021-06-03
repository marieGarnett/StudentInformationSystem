USE SIS


GO

IF OBJECT_ID('spUpdateCourse') IS NOT NULL DROP PROCEDURE[spUpdateCourse]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spUpdateCourse (@Course VARCHAR(50), @NewDescription VARCHAR(250))
AS

	DECLARE @Course_ID INT
	
	SELECT @Course_ID = Course_ID
	FROM course
	WHERE CourseName = @Course

	UPDATE course
	SET [Description] = @NewDescription
	WHERE Course_ID = @Course_ID


GO
