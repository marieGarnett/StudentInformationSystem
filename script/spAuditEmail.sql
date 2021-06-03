USE SIS


GO

IF OBJECT_ID('spAuditEmail') IS NOT NULL DROP PROCEDURE spAuditEmail
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE PROCEDURE spAuditEmail @User VARCHAR(50), @Date DATE, @Time TIME, @Action VARCHAR(50)
AS

	DECLARE @Id INT
	DECLARE @Message VARCHAR(200)
	DECLARE @AuditType_ID INT

	SELECT @Id = User_ID
	FROM [user]
	WHERE Username = @User

	SELECT @AuditType_ID = AuditType_ID
	FROM auditType
	WHERE AuditName = 'User Email'

	SET @Message = 'Successfully ' + @Action + ' ' + @User + '.'

	INSERT INTO audittrail(User_ID, Date, Time, Operation, AuditType_ID)
	VALUES(@Id, @Date, @Time, @Message, @AuditType_ID)


GO

