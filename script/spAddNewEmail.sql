USE SIS


GO

IF OBJECT_ID('spAddNewEmail') IS NOT NULL DROP PROCEDURE spAddNewEmail
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAddNewEmail @User VARCHAR(50), @OldEmail VARCHAR(150), @NewEmail1 VARCHAR(150)
AS

	DECLARE @User_ID INT

	SELECT @User_ID = User_ID
	FROM [user]
	WHERE Username = @User
		AND Email =@OldEmail

	UPDATE [user]
	SET Email = @NewEmail1
	WHERE User_ID = @User_ID


GO
