USE [SIS]
GO

IF OBJECT_ID('viewCourses') IS NOT NULL DROP VIEW viewCourses
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE VIEW [dbo].[viewCourses] AS

SELECT c.Course_ID AS 'Course ID', c.CourseName AS Course, c.[Description], d.Department
FROM department d JOIN course c ON d.Department_ID = c.Department_ID


GO
