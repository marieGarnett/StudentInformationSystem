USE SIS


GO

IF OBJECT_ID('spLogIn') IS NOT NULL DROP PROCEDURE spLogIn
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spLogIn @User VARCHAR(50), @Password VARCHAR(50)
AS

	SELECT Username
	FROM [user]
	WHERE Username = @User AND Password = @Password
		OR Email = @User AND Password = @Password


GO
