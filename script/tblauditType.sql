USE SIS


GO

IF OBJECT_ID('auditType') IS NULL
BEGIN
	CREATE TABLE auditType(
		AuditType_ID INT IDENTITY(1, 1) NOT NULL,
		[AuditName] VARCHAR(100) NOT NULL,
		CONSTRAINT [PK_auditType] PRIMARY KEY(AuditType_ID)
	)
END


GO