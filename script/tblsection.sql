USE SIS


GO

IF OBJECT_ID('section') IS NULL
BEGIN
	CREATE TABLE section(
		Section_ID INT IDENTITY(1, 1) NOT NULL,
		Course_ID INT NOT NULL,
		Section VARCHAR(50),
		YearStart DATE,
		YearEnd DATE,
		[IsActive] BIT NOT NULL CONSTRAINT[DF_section_IsActive] DEFAULT + (0),
		CONSTRAINT [PK_section] PRIMARY KEY(Section_ID)
	)
END


GO