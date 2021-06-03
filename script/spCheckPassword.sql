USE SIS


GO

IF OBJECT_ID('spCheckPassword') IS NOT NULL DROP PROCEDURE spCheckPassword
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spCheckPassword @User VARCHAR(50), @Password VARCHAR(50)
AS

	DECLARE @User_ID INT

	SELECT User_ID = @User_ID
	FROM [user]
	WHERE Username = @User AND Password = @Password


GO



