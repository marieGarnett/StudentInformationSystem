USE SIS


GO

IF OBJECT_ID('spViewSystemVersion') IS NOT NULL DROP PROCEDURE spViewSystemVersion
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spViewSystemVersion
AS

	SELECT Version
	FROM systemVersion
	WHERE IsActive = 1


GO