USE SIS
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

IF EXISTS(SELECT * FROM sys.indexes WHERE Name = 'DF_admission_IsEnrolled')
BEGIN
	ALTER TABLE admission DROP CONSTRAINT DF_admission_IsEnrolled
END


GO

IF OBJECT_ID('admission', 'IsEnrolled') IS NOT NULL
BEGIN
	ALTER TABLE admission DROP IsEnrolled
END


GO

ALTER TABLE admission
ADD IsEnrolled BIT NOT NULL CONSTRAINT[DF_admission_IsEnrolled] DEFAULT(0)


GO
