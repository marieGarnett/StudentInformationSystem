USE SIS


GO

IF OBJECT_ID('spAddUserPicture') IS NOT NULL DROP PROCEDURE spAddUserPicture
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAddUserPicture @Username VARCHAR(50), @UserPicture BINARY(5000)
AS

	DECLARE @User_ID INT

	SELECT User_ID = @User_ID
	FROM [user]
	WHERE Username = @Username

	UPDATE [user]
	SET UserPicture = @UserPicture
	WHERE User_ID = @User_ID
		AND Username = @Username


GO
