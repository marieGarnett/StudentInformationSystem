
USE [SIS]


GO

SET ANSI_NULLS ON


GO

SET QUOTED_IDENTIFIER ON


GO

IF OBJECT_ID('viewSubjects') IS NOT NULL DROP VIEW viewSubjects


GO

CREATE VIEW [dbo].[viewSubjects] AS

SELECT subject.Subject_ID AS 'Student ID', subject.Subject AS 'Subject Name', subject.Code, subject.Description, course.CourseName AS 'Course Under'
FROM subject INNER JOIN course
ON course.Course_ID = subject.Course_ID


GO
