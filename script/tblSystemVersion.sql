USE SIS


GO

IF OBJECT_ID('systemVersion') IS NULL
BEGIN
	CREATE TABLE systemVersion(
		SystemVersion_ID INT IDENTITY(1, 1) NOT NULL,
		[Version] VARCHAR(50) NOT NULL,
		[Description] VARCHAR(50),
		[IsActive] BIT NOT NULL CONSTRAINT[DF_systemVersion_IsActive] DEFAULT + (0),
		CONSTRAINT [PK_systemVersion] PRIMARY KEY(SystemVersion_ID)
	)
END


GO
