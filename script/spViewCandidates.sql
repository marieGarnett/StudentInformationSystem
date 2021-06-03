USE SIS


GO

IF OBJECT_ID('spViewCandidates') IS NOT NULL DROP PROCEDURE spViewCandidates
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE PROCEDURE spViewCandidates
AS

SELECT Surname, Firstname, Middlename
FROM admission


GO

