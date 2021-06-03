USE SIS


GO

IF OBJECT_ID ('spViewDepartmentDescription') IS NOT NULL DROP PROCEDURE [spViewDepartmentDescription]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spViewDepartmentDescription @Department VARCHAR(150)
AS

	
	SELECT Description
	FROM department
	WHERE Department = @Department


GO
