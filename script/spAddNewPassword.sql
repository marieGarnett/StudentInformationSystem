USE SIS


GO

IF OBJECT_ID('spAddNewPassword') IS NOT NULL DROP PROCEDURE spAddNewPassword
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAddNewPassword @User VARCHAR(50), @OldPasword VARCHAR(50), @NewPassword1 VARCHAR(50)
AS

	DECLARE @User_ID INT

	SELECT @User_ID = User_ID
	FROM [user]
	WHERE Username = @User
		AND Password =@OldPasword

	UPDATE [user]
	SET Password = @NewPassword1
	WHERE User_ID = @User_ID


GO
