USE [SIS]


GO

IF OBJECT_ID('spUpdateUsername') IS NOT NULL DROP PROCEDURE[spUpdateUsername]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spUpdateUsername (@Username VARCHAR(50), @NewUsername VARCHAR(50))
AS

	DECLARE @User_ID INT
	
	SELECT @User_ID = User_ID
	FROM [user]
	WHERE Username = @Username

	UPDATE [user]
	SET Username = @NewUsername
	WHERE User_ID = @User_ID


GO
