USE SIS


GO

IF OBJECT_ID('spUpdateDepartment') IS NOT NULL DROP PROCEDURE[spUpdateDepartment]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spUpdateDepartment (@Department VARCHAR(50), @NewDescription VARCHAR(150))
AS

	DECLARE @Department_ID INT
	
	SELECT @Department_ID = Department_ID
	FROM department
	WHERE Department = @Department

	UPDATE department
	SET [Description] = @NewDescription
	WHERE Department_ID = @Department_ID


GO

