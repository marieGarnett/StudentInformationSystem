USE SIS


GO

IF OBJECT_ID('spAddDepartment') IS NOT NULL DROP PROCEDURE spAddDepartment
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAddDepartment @Department VARCHAR(50), @Description VARCHAR(50)
AS

INSERT INTO department(Department, [Description])
VALUES(@Department, @Description)


GO

