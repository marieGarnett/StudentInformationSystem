USE [SIS]
GO

IF OBJECT_ID ('viewDepartments') IS NOT NULL DROP VIEW viewDepartments

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[viewDepartments] AS

SELECT Department_ID AS 'Department ID', Department, Description
FROM department


GO
